package spawn.HP;

import spawn.Monstre;

public class Acromentule extends Monstre {

    private String tribut;

    public Acromentule(String tribut) {
        super("ACROMENTULE");
        this.tribut = tribut;
    }

    protected final Acromentule clone() throws CloneNotSupportedException {

        Acromentule acromentule = null;
        try {
            acromentule = (Acromentule) super.clone();
            acromentule.tribut = this.tribut;
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return acromentule;
    }

    @Override
    public String toString() {
        return super.toString() + "{ACROMENTULE{" + tribut + "}}";
    }
}
