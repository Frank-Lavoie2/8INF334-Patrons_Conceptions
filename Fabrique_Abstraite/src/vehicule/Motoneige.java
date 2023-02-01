package vehicule;

public abstract class Motoneige implements Vehicule{
    private int longueurChenille;
    private int PDSF;

    public Motoneige(int longueurChenille, int PDSF){
        this.longueurChenille = longueurChenille;
        this.PDSF = PDSF;
    }
}
