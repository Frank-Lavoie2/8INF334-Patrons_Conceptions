package spawn;

import spawn.orkoide.Goblin;
import spawn.orkoide.Ork;

public class SpawnerOrkoide extends Spawner{

    public SpawnerOrkoide(){}

    @Override
    protected final void chargerMonstres() {

        ajouterMonstre(Goblin.class, new Goblin("Goff"));
        ajouterMonstre(Ork.class, new Ork());
    }

    public Ork spawnOrk(){

        return (Ork)spawnMonstre(Ork.class);
    }

    public Goblin spawnGoblin(){

        return (Goblin)spawnMonstre(Goblin.class);
    }
}
