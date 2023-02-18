import surveillance.observable.EspionEvenement;
import surveillance.observable.ThreadEvenement;
import surveillance.observateur.GenerateurBillet;
import surveillance.observateur.Log;
import surveillance.observateur.Rapport;
import surveillance.observateur.Support;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Log log = new Log(50);
        Rapport rapport = new Rapport();
        Support support = new Support();
        GenerateurBillet generateurBillet = new GenerateurBillet();

        Thread.sleep(5000);

        EspionEvenement.getObservable().supprimerObservateur(log);
        EspionEvenement.getObservable().supprimerObservateur(rapport);
        EspionEvenement.getObservable().supprimerObservateur(support);
    }
}