package spawn.HP;

import spawn.Monstre;

public class Basilic extends Monstre {

    private String tribut;

    public Basilic(String tribut) {
        super("BASILIC");
        this.tribut = tribut;
    }

    protected final Basilic clone() throws CloneNotSupportedException {

        Basilic basilic = null;
        try {
            basilic = (Basilic) super.clone();
            basilic.tribut = this.tribut;
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return basilic;
    }

    @Override
    public String toString() {
        return super.toString() + "{BASILIC{" + tribut + "}}";
    }
}
