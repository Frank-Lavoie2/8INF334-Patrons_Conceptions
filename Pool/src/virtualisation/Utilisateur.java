package virtualisation;

import virtualisation.core.SessionException;
import virtualisation.core.SessionWrapper;

import java.util.Date;
import java.util.Random;

public class Utilisateur extends Thread {

    private String nom;
    private SessionWrapper session;

    public Utilisateur(String nom){

        this.nom = nom;
    }

    public String getNom(){

        return nom;
    }

    public void gererSession(SessionWrapper session) {

        this.session = session;
        start();
    }

    public void run(){

        Random rand = new Random();
        long finUtilisationSession = new Date().getTime() + rand.nextInt(5000) + 5000;

        while(new Date().getTime() < finUtilisationSession){

            try {
                System.out.println(session.faireOperation());
                sleep(rand.nextInt(1000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            catch (SessionException se) {
                se.printStackTrace();
                break;
            }
        }
        session.deconnecter();;
    }
}
