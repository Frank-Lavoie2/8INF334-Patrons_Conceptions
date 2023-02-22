package controleur.commande;

import controleur.acteur.Acteur;

public interface Commande {
    public void executer(Acteur acteur);
}
