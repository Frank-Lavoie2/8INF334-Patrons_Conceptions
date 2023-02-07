package constructeur;

public class ConstructeurContratHtml extends ConstructeurContrat{
    public ConstructeurContratHtml(){
        contrat = new ContratHtml();
    }

    public void construitBonDeCommande(String nomClient){
        contrat.ajouteDocument("<HTML>Bon de commande Client : " + nomClient + "</HTML>");
    }

    public void construitDemandeImmatriculation(String nomDemandeur){
        contrat.ajouteDocument("<HTML>Demande d'immatriculation Demandeur : " + nomDemandeur + "</HTML>");
    }
}
