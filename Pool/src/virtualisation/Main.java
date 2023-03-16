package virtualisation;

import virtualisation.core.ServeurMV;
import virtualisation.core.SessionException;
import virtualisation.vmware.ServeurVMWare;

import java.io.File;
import java.io.PrintStream;
import java.util.Random;

public class Main {

    public static void main(String args[]) throws SessionException {

        // Pour transférer la sortie dans un fichier

        /*
        try {
            System.setOut(new PrintStream(new File("execution.txt")));
            System.setErr(new PrintStream(new File("execution.txt")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        Random rand = new Random();
        ServeurMV serveurMV = new ServeurVMWare();


        System.out.println("Tentative de connexion avant l'ouverture du serveur");
        try {
            Thread.sleep(2000);
            Utilisateur utilisateur = new Utilisateur("ROGER_AVANT");
            utilisateur.gererSession(serveurMV.connexion(utilisateur.getNom()));
        } catch (InterruptedException se) {
            se.printStackTrace();
        }
        catch (SessionException se){
            se.printStackTrace();
        }

        serveurMV.demarrer();

        int x = 0;
        while (serveurMV.enExecution()){

            try {
                Thread.sleep(rand.nextInt(1000) + 200);
                Utilisateur utilisateur = new Utilisateur("ROGER" + x++);
                utilisateur.gererSession(serveurMV.connexion(utilisateur.getNom()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            catch (SessionException se){
                se.printStackTrace();
            }
            if (x > 5)                     // Arrêt de maintenance
                serveurMV.arreter();        // Les utilisateurs ne vont pas aimer
        }

        System.out.println("Tentative de connexion après la fermeture du serveur");
        try {
            Thread.sleep(2000);
            Utilisateur utilisateur = new Utilisateur("ROGER_APRES");
            utilisateur.gererSession(serveurMV.connexion(utilisateur.getNom()));
        } catch (InterruptedException se) {
            se.printStackTrace();
        }
        catch (SessionException se) {
            se.printStackTrace();
        }
    }
}
