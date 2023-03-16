package spawn.orkoide;

import spawn.Monstre;

public class Goblin extends Monstre {

    private String tribut;

    public Goblin(String tribut) {
        super("GOBLIN");
        this.tribut = tribut;
    }

    protected final Goblin clone() throws CloneNotSupportedException {

        Goblin goblin = null;
        try {
            goblin = (Goblin) super.clone();
            goblin.tribut = this.tribut;
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return goblin;
    }

    @Override
    public String toString() {
        return super.toString() + "{GOBLIN{" + tribut + "}}";
    }
}
