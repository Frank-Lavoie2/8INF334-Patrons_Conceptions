package constructeur;

public class ContratPdf extends Contrat {
    public void ajouteDocument(String document){
        documents.add(document);
    }

    public void imprime(){
        System.out.println("Document PDF");
        for(String document: documents)
            System.out.println(document);
    }
}
