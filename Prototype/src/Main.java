import spawn.*;
import spawn.HP.Acromentule;
import spawn.HP.Basilic;
import spawn.HP.Detraqueur;
import spawn.orkoide.Goblin;
import spawn.orkoide.Ork;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){

        genererHP();
        genereHPClone();
    }

    private static void genererHP(){
        List<Monstre> monstres = new ArrayList<Monstre>();
        for (int x = 0; x < 5; x++)
            monstres.add(new Basilic("Serpentard"));
        for (int x = 0; x < 3; x++) {
            monstres.add(new Acromentule("Aragog"));
            monstres.add(new Detraqueur("Azkaban"));
        }

    }

    private static void genereHPClone() {

        SpawnerHP spawner = new SpawnerHP();
        List<Monstre> monstres = new ArrayList<Monstre>();

        for (int x = 0; x < 1000; x++)
            monstres.add(spawner.spawnBasilic());
        for (int x = 0; x < 5000; x++) {
            monstres.add(spawner.spawnAcromentule());
            monstres.add(spawner.spawnDetraqueur());
        }

        for(Monstre orkoide : monstres)
            System.out.println(orkoide);
    }

    private static void genereTribut() {

        List<Monstre> tribut = new ArrayList<Monstre>();

        for (int x = 0; x < 5; x++)
            tribut.add(new Ork());
        for (int x = 0; x < 3; x++)
            tribut.add(new Goblin("Evil Sunz"));

        for(Monstre orkoide : tribut)
            System.out.println(orkoide);
    }

    private static void genereTributClone() {

        SpawnerOrkoide spawner = new SpawnerOrkoide();
        List<Monstre> tribut = new ArrayList<Monstre>();

        Ork ork = spawner.spawnOrk();
        System.out.println(ork.getClass());
        System.out.println(ork);

        for (int x = 0; x < 1000; x++)
            tribut.add(spawner.spawnOrk());
        for (int x = 0; x < 5000; x++)
            tribut.add(spawner.spawnGoblin());

        for(Monstre orkoide : tribut)
            System.out.println(orkoide);
    }
}
