package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;
import surveillance.observable.EspionEvenement;

public class Log implements Observateur {
    private int NIVEAU_LOG;

    public Log(int niveauLog){
        NIVEAU_LOG = niveauLog;
        EspionEvenement.getObservable().ajouterObservateur(this);
    }

    public void alerter(Evenement evenement){
        if(evenement.getNiveauUrgence() > NIVEAU_LOG)
            System.out.print("LOG : " + evenement);
    }
}
