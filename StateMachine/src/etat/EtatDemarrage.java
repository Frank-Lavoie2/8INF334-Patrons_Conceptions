package etat;

public class EtatDemarrage implements Etat{
    public Etat envoyerCommande(int commande){
        if(commande == 0)
            return new EtatEteint();
        else if(commande == 1)
            return new EtatAuthentification();
        return this;
    }

    public void afficherInfo(){
        System.out.println("------------------------");
        System.out.println(" ETAT ACTUEL : DEMARRAGE");
        System.out.println("-------------------------");
    }

    public void afficherCommande(){
        System.out.println("Les commandes");
        System.out.println("\t0 - Eteindre le PC");
        System.out.println("\t1 - CTRL+ALT+SUPPR");
    }
}
