package vehicule;

import vehicule.airbus.avion.A220_300;
import vehicule.airbus.avion.A380;

public class FabriqueAirbus implements FabriqueVehicule{
    public Motoneige createMotoneige(String modele){
        return null;
    }

    public Avion createAvion(String modele){
        switch(modele.toUpperCase()){
            case "A380": return new A380();
            case "A220_300":return new A220_300();
            default: return null;
        }
    }
}
