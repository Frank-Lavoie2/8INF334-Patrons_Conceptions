package controleur.commande;

import controleur.acteur.Acteur;

public class CommandeTir implements Commande{
    public void executer(Acteur acteur){
        acteur.tirer();
    }

    public String toString(){
        return "{TIR}";
    }
}
