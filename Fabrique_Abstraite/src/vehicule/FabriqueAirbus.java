package vehicule;

import vehicule.airbus.avion.A220_300;
import vehicule.airbus.avion.A380;

public class FabriqueAirbus implements FabriqueVehicule{
    public Motoneige createMotoneige(String modele){
        return null;
    }

    public Avion createAvion(String modele){
        try{
            Class<Avion> classAvion = (Class<Avion>) Class.forName("vehicule.airbus.avion." + modele);
            return classAvion.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
