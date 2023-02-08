package etat;

public class EtatUtilisation implements Etat{
    public Etat envoyerCommande(int commande){
        switch (commande){
            case 0: return new EtatAuthentification();
            case 1: return new EtatAuthentification();
            case 2: return new EtatFermeture();
            default: return this;
        }
    }

    public void afficherInfo(){
        System.out.println("--------------------------");
        System.out.println(" ETAT ACTUEL : UTILISATION");
        System.out.println("--------------------------");
    }

    public void afficherCommande(){
        System.out.println("Les commandes");
        System.out.println("\t0 - Eteindre le PC");
        System.out.println("\t1 - Fermer la session");
        System.out.println("\t2 - Fermer le PC");
    }
}
