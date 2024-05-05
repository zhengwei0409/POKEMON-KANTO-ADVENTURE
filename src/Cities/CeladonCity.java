package Cities;

import Pokemons.*;

public class CeladonCity extends City {

    public CeladonCity() {
        super("Celadon City");
    }

    @Override
    public void initialize() {
        if(initialized) return;
        else initialized = true;
        reachableCity.add(new SaffronCity());
        reachableCity.add(new FuschiaCity());
        wildPokemon.add(new Poliwag());
        wildPokemon.add(new Magikarp());
        wildPokemon.add(new Goldeen());
        gymLeader = new GymLeader("Erika", "Grass", new Gloom(), "Rainbow");
    }
}