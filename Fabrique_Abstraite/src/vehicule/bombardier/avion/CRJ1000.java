package vehicule.bombardier.avion;

import vehicule.Avion;

public class CRJ1000 extends Avion {
    public CRJ1000(){
        super(104, 0.835, 1650);
    }

    public void afficherPublicite(){
        System.out.println("publicité CRJ1000");
    }
}
