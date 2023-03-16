package virtualisation.core;

public class SessionException extends Exception {

    private int sessionId;
    private String utilisateur;
    private String message;

    public SessionException(String message, int sessionId, String utilisateur){

        this.sessionId = sessionId;
        this.utilisateur = utilisateur;
        this.message = message;
    }

    public String getMessage(){

        return message + " {sid:" + sessionId + ",uid:" + utilisateur + "}";
    }
}
