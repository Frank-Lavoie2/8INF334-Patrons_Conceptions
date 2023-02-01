package MonServeurPackage;

public class MonServeur {
    private static MonServeur monServeur;
    private ServiceA serviceA;
    private ServiceB serviceB;

    private MonServeur(){
        serviceA = new ServiceA();
        serviceB = new ServiceB();
    }

    public static MonServeur getInstance(){
        if(monServeur == null)
            monServeur = new MonServeur();
        return monServeur;
    }

    void defaultPrint(String m){
        System.out.println("defaultPrint : " + m);
    }

    public void publicPrint(String m){
        System.out.println("publicPrint : " + m);
    }

    ServiceA getServiceA(){
        return serviceA;
    }

    public ServiceAInterface getServiceAInterface(){
        return serviceA;
    }

    public ServiceBInterface getServiceBInterface(){
        return serviceB;
    }
}
