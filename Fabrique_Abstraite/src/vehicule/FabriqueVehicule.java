package vehicule;

public interface FabriqueVehicule {
    public Motoneige createMotoneige(String modele);
    public Avion createAvion(String modele);
}
