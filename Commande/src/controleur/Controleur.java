package controleur;

import controleur.acteur.Acteur;
import controleur.commande.*;

public class Controleur {
    private Commande[] commandes;
    private Acteur acteur;

    public Controleur(Acteur acteur){
        setActeur(acteur);
        commandes = new Commande[Bouton.values().length];
        reinitialiserCommandes();
    }

    public void setActeur(Acteur acteur){
        this.acteur = acteur;
    }

    public void reinitialiserCommandes(){
        commandes[Bouton.X.ordinal()] = new CommandeSaut();
        commandes[Bouton.Y.ordinal()] = new CommandeTir();
        commandes[Bouton.A.ordinal()] = new CommandeEsquive();
        commandes[Bouton.B.ordinal()] = new CommandeChangerArme();
    }

    public void setCommande(Bouton bouton, Commande commande){
        commandes[bouton.ordinal()] = commande;
    }

    public void setCommande(Bouton bouton){
        commandes[bouton.ordinal()] = null;
    }

    public void jouer(Bouton bouton){
        if(commandes[bouton.ordinal()] != null)
            commandes[bouton.ordinal()].executer(acteur);
    }

    public String toString(){
        String value = "Controleur{";
        for(int i = 0; i < commandes.length; i++) {
            value += "\n\t[";
            value += Bouton.values()[i].toString();
            value += "] ";

            if(commandes[i] != null)
                value += commandes[i].toString();
            else
                value += "null";
        }
        return value + "\n}";
    }
}
