package constructeur;

public class ContratHtml extends Contrat {
    public void ajouteDocument(String document){
        documents.add(document);
    }

    public void imprime(){
        System.out.println("Document HTML");
        for (String document: documents)
            System.out.println(document);
    }
}
