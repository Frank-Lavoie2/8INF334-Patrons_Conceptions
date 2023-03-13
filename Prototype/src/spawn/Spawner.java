package spawn;

import java.util.Hashtable;

abstract class Spawner {

        private Hashtable monstres;

        Spawner(){

            monstres = new Hashtable();
            chargerMonstres();
        }

        protected final void ajouterMonstre(Class type, Monstre monstre){

            monstres.put(type, monstre);
        }

        protected final Monstre spawnMonstre(Class type) {

            return ((Monstre)monstres.get(type)).spawn();
        }

        protected abstract void chargerMonstres();
}
