package spawn.HP;

import spawn.Monstre;

public class Detraqueur extends Monstre {

    private String tribut;

    public Detraqueur(String tribut) {
        super("ACROMENTULE");
        this.tribut = tribut;
    }

    protected final Detraqueur clone() throws CloneNotSupportedException {

        Detraqueur detraqueur = null;
        try {
            detraqueur = (Detraqueur) super.clone();
            detraqueur.tribut = this.tribut;
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return detraqueur;
    }

    @Override
    public String toString() {
        return super.toString() + "{DETRAQUEUR{" + tribut + "}}";
    }
}
