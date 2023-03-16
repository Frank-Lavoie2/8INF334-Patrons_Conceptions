package virtualisation.core;

public abstract class Session {

    private int sessionId;
    private String utilisateur;
    private boolean enUtilisation;

    public Session(int sessionId){

        this.sessionId = sessionId;
        deconnecter();
    }

    public int getSessionId(){

        return sessionId;
    }

    public String getUtilisateur(){

        return utilisateur;
    }

    public void deconnecter(){

        enUtilisation = false;
        utilisateur = "";
    }

    public void connecter(String utilisateur){

        enUtilisation = true;
        this.utilisateur = utilisateur;
    }

    protected abstract String faireOperationImpl();

    public final String faireOperation() throws SessionException {

        if (enUtilisation)
            return faireOperationImpl();
        throw new SessionException("Execution de l'operation impossible", sessionId, utilisateur);
    }


    boolean enUtilisation(){

        return enUtilisation;
    }

    @Override
    public String toString() {
        return "{sid:" + sessionId + ",uid:" + utilisateur + ",u:" + enUtilisation+ "}";
    }
}