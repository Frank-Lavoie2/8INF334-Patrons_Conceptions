package spawn;

import spawn.HP.Acromentule;
import spawn.HP.Basilic;
import spawn.HP.Detraqueur;
import spawn.orkoide.Goblin;
import spawn.orkoide.Ork;

public class SpawnerHP extends Spawner{

    public SpawnerHP(){}

    @Override
    protected final void chargerMonstres() {

        ajouterMonstre(Basilic.class, new Basilic("Serpentard"));
        ajouterMonstre(Acromentule.class, new Acromentule("Aragog"));
        ajouterMonstre(Detraqueur.class, new Detraqueur("Azkaban"));
    }

    public Basilic spawnBasilic(){

        return (Basilic) spawnMonstre(Basilic.class);
    }

    public Acromentule spawnAcromentule(){
        return (Acromentule) spawnMonstre(Acromentule.class);
    }

    public Detraqueur spawnDetraqueur(){

        return (Detraqueur)spawnMonstre(Detraqueur.class);
    }
}
