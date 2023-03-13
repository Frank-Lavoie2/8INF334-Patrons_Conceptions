package spawn;

// PROTOTYPE
public abstract class Monstre implements Cloneable{

    private static int _id = 0;
    private String description;
    private char infoProvenantDeLaBaseDeDonnees;
    private int id;
    private final int TEMPS_CHARGEMENT = 2000;

    public Monstre (String description){

        this.description = description;
        id = genererID();
        try {
            System.out.println("CHARGMENT EN COURS... " + this.getClass() + "(" + id + ")");
            // Chargement très long provenant de la base de données!
            Thread.sleep(TEMPS_CHARGEMENT);
            infoProvenantDeLaBaseDeDonnees = (char)((int)(Math.random() * 26) + 'A');
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getDescription(){

        return description;
    }

    protected Monstre clone() throws CloneNotSupportedException {

        Monstre monstre = null;
        try {
            monstre = (Monstre) super.clone();
            monstre.description = this.description;
            monstre.infoProvenantDeLaBaseDeDonnees = this.infoProvenantDeLaBaseDeDonnees;
            monstre.id = genererID();
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return monstre;
    }

    private static int genererID(){

        return _id++;
    }

    final Monstre spawn(){

        try {
            return (Monstre)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "{MONSTRE{" + description + ',' + infoProvenantDeLaBaseDeDonnees + ',' + id + "}}";
    }
}
