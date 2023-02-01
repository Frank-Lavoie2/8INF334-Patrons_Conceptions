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

    }
}
