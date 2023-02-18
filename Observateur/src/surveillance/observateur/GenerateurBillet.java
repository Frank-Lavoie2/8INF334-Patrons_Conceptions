package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;
import surveillance.observable.EspionEvenement;

public class GenerateurBillet implements Observateur {
    public GenerateurBillet(){
        EspionEvenement.getObservable().ajouterObservateur(this);
    }

    public void alerter(Evenement evenement){
        System.out.print("OUVERTURE D'UN BILLET : " + evenement);
    }
}
