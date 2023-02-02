package vehicule;

public abstract class Avion implements Vehicule{
    private int passagerMax;
    private double vitesseMaxCroisiere;
    private int distanceFranchissable;

    public Avion(int passagerMax, double vitesseMaxCroisiere, int distanceFranchissable){
        this.passagerMax = passagerMax;
        this.vitesseMaxCroisiere = vitesseMaxCroisiere;
        this.distanceFranchissable = distanceFranchissable;
    }

    public void afficherCaracteristiques(){
        System.out.println("Caractéristiques");
        System.out.println("Nombre de passager maximal         : " + passagerMax);
        System.out.println("Vitesse de croisière maximale      : " + vitesseMaxCroisiere);
        System.out.println("Distance franchissable             : " + distanceFranchissable);
    }
}
