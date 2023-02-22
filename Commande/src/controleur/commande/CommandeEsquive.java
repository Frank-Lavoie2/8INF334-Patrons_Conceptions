package controleur.commande;

import controleur.acteur.Acteur;

public class CommandeEsquive implements Commande{
    public void executer(Acteur acteur){
        acteur.esquiver();
    }

    public String toString(){
        return "{ESQUIVE}";
    }
}
