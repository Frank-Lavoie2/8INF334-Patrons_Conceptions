package controleur.commande;

import controleur.acteur.Acteur;

public class CommandeChangerArme implements Commande{
    public void executer(Acteur acteur){
        acteur.changerArme();
    }

    public String toString(){
        return "{CHANGEMENT_ARME}";
    }
}
