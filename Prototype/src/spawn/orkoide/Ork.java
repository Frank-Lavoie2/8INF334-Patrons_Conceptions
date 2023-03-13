package spawn.orkoide;

import spawn.Monstre;

public class Ork extends Monstre {

    private int nbDents;

    public Ork() {
        super("ORK");
        nbDents = 30;
    }

    protected final Ork clone() throws CloneNotSupportedException {

        Ork ork = null;
        try {
            ork = (Ork) super.clone();
            ork.nbDents = this.nbDents;
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return ork;
    }

    @Override
    public String toString() {
        return super.toString() + "{ORK{" + nbDents + "}}";
    }
}
