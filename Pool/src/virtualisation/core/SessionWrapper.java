package virtualisation.core;

import java.util.Date;

public class SessionWrapper {

    private Session session;
    private Date momentConnexion;
    private Date momentDerniereOperation;

    public SessionWrapper(Session session){

        momentConnexion = new Date();        // VERIFIER
        miseAJour();
        this.session = session;
    }

    public String getUtilisateur(){

        return session.getUtilisateur();
    }

    public String faireOperation() throws SessionException {

        miseAJour();
        return session.faireOperation();
    }

    public void deconnecter(){

        miseAJour();
        session.deconnecter();
    }

    Session recupererSession(int intervalleDeconnexion){

        if (new Date().getTime() - momentDerniereOperation.getTime() > intervalleDeconnexion)
            return recupererSession();
        return null;
    }

    Session recupererSession(){

        deconnecter();
        if (!session.enUtilisation())
            return session;
        return null;
    }

    private void miseAJour(){

        momentDerniereOperation = new Date();  // CHECK
    }

    @Override
    public String toString() {
        return "{" + session.toString() + "},t:" + (momentDerniereOperation.getTime()-momentConnexion.getTime()) + "}";
    }
}
