package MonServeurPackage;

public class ServiceB extends Service implements ServiceBInterface{
    public void methodeC(){
        MonServeur.getInstance().defaultPrint("C");
    }
    public void methodeD(){
        MonServeur.getInstance().publicPrint("D");
    }
    public void methodeE(){
        MonServeur.getInstance().getServiceAInterface().methodeA();
    }
    public void methodeF(){
        MonServeur.getInstance().getServiceA().methodeB();
    }
}
