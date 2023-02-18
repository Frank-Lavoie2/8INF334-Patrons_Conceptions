package surveillance;

public interface Observable {
    public void ajouterObservateur(Observateur observateur);
    public void supprimerObservateur(Observateur observateur);
}
