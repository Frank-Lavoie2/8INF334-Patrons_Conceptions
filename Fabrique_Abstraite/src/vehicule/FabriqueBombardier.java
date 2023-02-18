package vehicule;

import vehicule.bombardier.avion.CRJ1000;
import vehicule.bombardier.avion.Global8000;
import vehicule.bombardier.motoneige.SkiDooExpeditionSport;
import vehicule.bombardier.motoneige.SkiDooRenegade;

public class FabriqueBombardier implements FabriqueVehicule{
    @Override
    public Motoneige createMotoneige(String modele) {
        try{
            Class<Motoneige> classMotoneige = (Class<Motoneige>) Class.forName("vehicule.bombardier.motoneige." + modele);
            return classMotoneige.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Avion createAvion(String modele) {
        try{
            Class<Avion> classAvion = (Class<Avion>) Class.forName("vehicule.bombardier.avion." + modele);
            return classAvion.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
