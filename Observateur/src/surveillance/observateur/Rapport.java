package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;
import surveillance.observable.EspionEvenement;

public class Rapport implements Observateur {
    public Rapport(){
        EspionEvenement.getObservable().ajouterObservateur(this);
    }

    public void alerter(Evenement evenement){
        System.out.println("RAPPORT : " + evenement.getDescription());
    }
}
