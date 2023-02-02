package vehicule;

import vehicule.bombardier.avion.CRJ1000;
import vehicule.bombardier.avion.Global8000;
import vehicule.bombardier.motoneige.SkiDooExpeditionSport;
import vehicule.bombardier.motoneige.SkiDooRenegade;

public class FabriqueBombardier implements FabriqueVehicule{
    @Override
    public Motoneige createMotoneige(String modele) {
        switch (modele.toUpperCase()){
            case "SKIDOO_EXPEDITION_SPORT": return new SkiDooExpeditionSport();
            case "SKIDOO_RENEGADE": return new SkiDooRenegade();
        }
        return null;
    }

    @Override
    public Avion createAvion(String modele) {
        switch (modele.toUpperCase()){
            case "CRJ1000": return new CRJ1000();
            case "GLOBAL8000":return new Global8000();
        }
        return null;
    }
}
