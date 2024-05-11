package Cities;

import Pokemons.*;

public class LavenderTown extends City {

    public LavenderTown() {
        super("Lavender Town");
    }

    @Override
    public void initialize() {
        if(initialized) return;
        else initialized = true;
        reachableCity.add(new CeruleanCity());
        reachableCity.add(new SaffronCity());
        reachableCity.add(new VermilionCity());
        reachableCity.add(new FuschiaCity());
        wildPokemon.add(new Gastly());
        wildPokemon.add(new Haunter());
        wildPokemon.add(new Cubone());
        //this town doesn't have a Gym
    }


}
