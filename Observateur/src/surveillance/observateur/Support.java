package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;
import surveillance.observable.EspionEvenement;

public class Support implements Observateur {
    public Support(){
        EspionEvenement.getObservable().ajouterObservateur(this);
    }

    public void alerter(Evenement evenement){
        if(evenement.getNiveauUrgence() > 90)
            System.out.print(evenement);
    }
}
