package constructeur;

public class ConstructeurContratPdf extends ConstructeurContrat{
    public ConstructeurContratPdf(){
        contrat = new ContratPdf();
    }

    public void construitBonDeCommande(String nomClient){
        contrat.ajouteDocument("<PDF>Bon de commande Client : " + nomClient + "</PDF>");
    }

    public void construitDemandeImmatriculation(String nomDemandeur){
        contrat.ajouteDocument("<PDF>Demande d'immatriculation Demandeur : " + nomDemandeur + "</PDF>");
    }
}
