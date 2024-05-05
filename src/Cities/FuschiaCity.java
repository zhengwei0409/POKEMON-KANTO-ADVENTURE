package Cities;

import Pokemons.*;


public class FuschiaCity extends City {

    public FuschiaCity() {
        super("Fuschia City");
    }

    @Override
    public void initialize() {
        if(initialized) return;
        else initialized = true;
        reachableCity.add(new CeladonCity());
        reachableCity.add(new VermillionCity());
        reachableCity.add(new LavenderTown());
        wildPokemon.add(new Poliwag());
        wildPokemon.add(new Magikarp());
        wildPokemon.add(new Goldeen());
        gymLeader = new GymLeader("Koga", "Poison", new Arbok(), "Soul");
    }


}
