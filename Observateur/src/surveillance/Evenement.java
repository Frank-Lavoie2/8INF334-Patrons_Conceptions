package surveillance;

public class Evenement {
    private int niveauUrgence;
    private String description;

    public Evenement(int niveauUrgence, String description){
        this.niveauUrgence = niveauUrgence;
        this.description = description;
    }

    public int getNiveauUrgence(){
        return niveauUrgence;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return "Evenement{" + "niveauUrgence=" + niveauUrgence + ", description='" + description + "'}";
    }
}
