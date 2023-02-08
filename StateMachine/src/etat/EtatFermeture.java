package etat;

public class EtatFermeture implements Etat{
    public Etat envoyerCommande(int commande){
        if(commande == 0)
            return new EtatEteint();
        return this;
    }

    public void afficherInfo(){
        System.out.println("------------------------");
        System.out.println(" ETAT ACTUEL : FERMETURE");
        System.out.println("------------------------");
    }

    public void afficherCommande(){
        System.out.println("Les commandes");
        System.out.println("\t0 - Eteindre le PC");
    }
}
