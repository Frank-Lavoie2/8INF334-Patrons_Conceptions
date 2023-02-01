import MonServeurPackage.MonServeur;

public class Main {
    public static void main(String[] args) {
        MonServeur.getInstance().publicPrint("main");
        MonServeur.getInstance().getServiceAInterface().methodeA();
        MonServeur.getInstance().getServiceBInterface().methodeC();
        MonServeur.getInstance().getServiceBInterface().methodeD();
        MonServeur.getInstance().getServiceBInterface().methodeE();
        MonServeur.getInstance().getServiceBInterface().methodeF();
    }
}