package etat;

public interface Etat {
    public abstract Etat envoyerCommande(int commande);
    public abstract void afficherInfo();
    public  void afficherCommande();
}
