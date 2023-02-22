package controleur.acteur;

public class Drone implements Acteur{
    public void sauter(){
        System.out.println("DRONE-SAUTER");
    }

    public void tirer(){
        System.out.println("DRONE-TIRER");
    }

    public void esquiver(){
        System.out.println("DRONE-ESQUIVER");
    }

    public void changerArme(){
        System.out.println("DRONE-CHANGER_ARME");
    }
}
