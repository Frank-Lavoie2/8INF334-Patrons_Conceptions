package surveillance.observable;

import surveillance.Evenement;
import surveillance.Observable;
import surveillance.Observateur;

import java.util.ArrayList;

public class EspionEvenement implements Observable {
    private ArrayList<Observateur> observateurs;
    private static Observable observable = new EspionEvenement();

    private EspionEvenement() {
        observateurs = new ArrayList<Observateur>();
        ThreadEvenement thread = new ThreadEvenement(this);
        thread.start();
    }

    public static Observable getObservable() {
        return observable;
    }

    public void alerter(Evenement evenement) {
        //System.out.print(evenement);
        System.out.println();
        for(Observateur observateur: observateurs)
            observateur.alerter(evenement);
    }

    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void supprimerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }
}
