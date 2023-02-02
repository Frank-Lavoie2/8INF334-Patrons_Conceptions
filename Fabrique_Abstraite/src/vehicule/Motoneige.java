package vehicule;

public abstract class Motoneige implements Vehicule{
    private int longueurChenille;
    private int PDSF;

    public Motoneige(int longueurChenille, int PDSF){
        this.longueurChenille = longueurChenille;
        this.PDSF = PDSF;
    }

    public void afficherCaracteristiques(){
        System.out.println("Caractéristiques");
        System.out.println("Longueur de la chenille                        : " + longueurChenille);
        System.out.println("Prix de détail suggéré par le fabricant        : " + PDSF);
    }
}
