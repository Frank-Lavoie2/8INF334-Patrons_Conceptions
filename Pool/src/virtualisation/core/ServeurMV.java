package virtualisation.core;

import virtualisation.Utilisateur;
import virtualisation.vmware.SessionVMWare;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Coder methode de transfert

public abstract class ServeurMV {

    private boolean isStarted;
    private int sessionId;
    private ArrayList<Session> sessions;
    private ArrayList<SessionWrapper> sessionsUtilisees;
    private Thread thread;

    private final int MIN_POOL;
    private final int MAX_POOL;
    private final int MIN_LIBRE;
    private final int MAX_LIBRE;
    private final int INTERVALLE_DECONNEXION;
    private final int INCREMENT;
    private final int DELAI_RECUPERATION_SESSION;

    public ServeurMV() throws SessionException {

        this (3, 20, 2, 2, 5, 2000, 500);
    }

    public ServeurMV(int minPool, int maxPool, int increment, int minLibre, int maxLibre, int intervalleDeconnexion, int delaiRecuperationSession) throws SessionException {


        isStarted = false;

        MIN_POOL = minPool;
        MAX_POOL = maxPool;
        INCREMENT = increment;
        MIN_LIBRE = minLibre;
        MAX_LIBRE = maxLibre;
        INTERVALLE_DECONNEXION = intervalleDeconnexion;
        DELAI_RECUPERATION_SESSION = delaiRecuperationSession;
    }

    protected abstract Session creerSession();

    public void demarrer(){
        isStarted = true;
        sessionId = 0;
        sessions = new ArrayList<Session>();
        sessionsUtilisees = new ArrayList<SessionWrapper>();

        gererSessions();
        afficherSessions("DEMARRAGE DU SERVEUR");

        thread = new Thread(() -> {
            try{
                while(true) {
                    gererSessions();
                    thread.sleep(DELAI_RECUPERATION_SESSION);
                }
            } catch (InterruptedException se) {
                se.printStackTrace();
            }
        });
        thread.start();
    }

    public void arreter(){
        isStarted = false;
        for(Session session: sessions)
            session.deconnecter();
        for(SessionWrapper wrapper: sessionsUtilisees)
            wrapper.recupererSession();

        sessions = new ArrayList<Session>();
        sessionsUtilisees = new ArrayList<SessionWrapper>();
        thread.interrupt();
        afficherSessions("ARRET DU SERVEUR");
    }

    public boolean enExecution(){
        return isStarted;
    }

    public SessionWrapper connexion(String utilisateur) throws SessionException{
        if(!enExecution())
            throw new SessionException("LE SERVEUR N'EST PAS EN EXECUTION", -1, utilisateur);
        if(sessions.size() > 0)
            return genererSessionWrapper(utilisateur);
        else if(sessions.size() < MAX_POOL){
            sessions.add(new SessionVMWare(sessionId++));
            return genererSessionWrapper(utilisateur);
        }
        return null;
    }

    private SessionWrapper genererSessionWrapper(String utilisateur){
        Session session = sessions.get(0);
        session.connecter(utilisateur);
        sessions.remove(session);

        SessionWrapper wrapper = new SessionWrapper(session);
        sessionsUtilisees.add(wrapper);
        return wrapper;
    }

    private void gererSessions(){
        for(int i = sessions.size(); i < MIN_LIBRE; i++)
            sessions.add(new SessionVMWare(sessionId++));
        for(int i = sessions.size() + sessionsUtilisees.size(); i < MIN_POOL; i++)
            sessions.add(new SessionVMWare(sessionId++));

        ArrayList<SessionWrapper> wrappersToDelete = new ArrayList<SessionWrapper>();
        for(SessionWrapper wrapper: sessionsUtilisees)
            if(wrapper.getUtilisateur() == null || wrapper.getUtilisateur() == ""){
                sessions.add(wrapper.recupererSession());
                wrappersToDelete.add(wrapper);
            }
        for(SessionWrapper wrapper: wrappersToDelete)
            sessionsUtilisees.remove(wrapper);


        afficherSessions("RECUPERATION DES SESSIONS INUTILISEES");
    }

    private void afficherSessions(String moment){
        System.out.println("MOMENT : " + moment);
        System.out.println(generateSessionString(sessions, "sessions         "));
        System.out.println(generateSessionWrapperString(sessionsUtilisees, "sessionsUtilisees"));
    }

    private String generateSessionString(List<Session> sessionVMWares, String sessiontype){
        String str = "> " + sessiontype + "\t\t: {size:" + sessionVMWares.size() + " [";
        for(int i = 0; i < sessionVMWares.size(); i++){
            str += sessionVMWares.get(i).toString();
            if(i < sessionVMWares.size() - 1)
                str += ",";
        }
        str += "]";
        return str;
    }

    private String generateSessionWrapperString(List<SessionWrapper> sessionWrapper, String sessiontype){
        String str = "> " + sessiontype + "\t\t: {size:" + sessionWrapper.size() + " [";
        for(int i = 0; i < sessionWrapper.size(); i++){
            str += sessionWrapper.get(i).toString();
            if(i < sessionWrapper.size() - 1)
                str += ",";
        }
        str += "]";
        return str;
    }
}
