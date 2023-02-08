package etat;

public class EtatAuthentification implements Etat{
    public Etat envoyerCommande(int commande){
        switch (commande){
            case 0: return new EtatEteint();
            case 1: return new EtatFermeture();
            case 2: return new EtatUtilisation();
            default:return this;
        }
    }

    public void afficherInfo(){
        System.out.println("-------------------------------");
        System.out.println(" ETAT ACTUEL : AUTHENTIFICATION");
        System.out.println("-------------------------------");
    }

    public void afficherCommande(){
        System.out.println("Les commandes");
        System.out.println("\t0 - Eteindre le PC");
        System.out.println("\t1 - Fermer le PC");
        System.out.println("\t2 - Authentification");
    }
}
