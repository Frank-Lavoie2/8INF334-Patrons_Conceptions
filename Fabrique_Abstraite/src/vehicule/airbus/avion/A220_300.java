package vehicule.airbus.avion;

import vehicule.Avion;

public class A220_300 extends Avion{
    public A220_300(){
        super(160, 0.82, 6112);
    }
    public void afficherPublicite(){
        System.out.println("publicité A220_300");
    }
}
