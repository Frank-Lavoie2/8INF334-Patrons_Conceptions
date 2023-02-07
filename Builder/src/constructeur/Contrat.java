package constructeur;

import java.util.ArrayList;

public abstract class Contrat {
    protected ArrayList<String> documents;

    public Contrat(){
        documents = new ArrayList<String>();
    }

    public abstract void ajouteDocument(String document);

    public abstract void imprime();
}
