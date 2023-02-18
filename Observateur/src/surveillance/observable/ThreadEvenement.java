package surveillance.observable;

import surveillance.Evenement;

public class ThreadEvenement extends Thread{
    private EspionEvenement espion;

    public ThreadEvenement(EspionEvenement espion){
        this.espion = espion;
    }

    public void run(){
        String[] descriptionsEvenement = new String[]{"Feu", "Fuite eau", "panne de courant", "Greve", "Bris majeur"};
        try{
            while(true){
                sleep(1000);
                Evenement evenement = new Evenement((int)(Math.random() * 100), descriptionsEvenement[(int)(Math.random() * descriptionsEvenement.length)]);
                espion.alerter(evenement);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
