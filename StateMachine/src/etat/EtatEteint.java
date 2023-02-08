package etat;

public class EtatEteint implements Etat{
    public Etat envoyerCommande(int commande){
        if(commande == 0)
            return new EtatDemarrage();
        return this;
    }

    public void afficherInfo(){
        System.out.println("---------------------");
        System.out.println(" ETAT ACTUEL : ETEINT");
        System.out.println("---------------------");
    }

    public void afficherCommande(){
        System.out.println("Les commandes");
        System.out.println("\t0 - Demarrer le PC");
    }
}
