import java.util.Scanner;
import constructeur.ConstructeurContrat;
import constructeur.ConstructeurContratHtml;
import constructeur.ConstructeurContratPdf;
import directeur.Vendeur;
import constructeur.Contrat;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ConstructeurContrat constructeurContrat;
        System.out.print("Voulez-vous construire des contrats HTML (1) ou PDF (2) : ");
        String choix = reader.next();

        if(choix.compareTo("1") == 0)
            constructeurContrat = new ConstructeurContratHtml();
        else
            constructeurContrat = new ConstructeurContratPdf();

        Vendeur vendeur = new Vendeur(constructeurContrat);

        Contrat contrat = vendeur.construit("Francis");
        contrat.imprime();
    }
}