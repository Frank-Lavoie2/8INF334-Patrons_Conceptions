package controleur.commande;

import controleur.acteur.Acteur;

public class CommandeSaut implements Commande{
    public void executer(Acteur acteur){
        acteur.sauter();
    }

    public String toString(){
        return "{SAUT}";
    }
}
