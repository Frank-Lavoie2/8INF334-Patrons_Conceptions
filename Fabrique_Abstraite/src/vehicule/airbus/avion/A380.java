package vehicule.airbus.avion;

import vehicule.Avion;

public class A380 extends Avion{
    public A380(){
        super(853, 0.93, 15200);
    }
    public void afficherPublicite(){
        System.out.println("publicité A380");
    }
}
