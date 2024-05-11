package Cities;

import Pokemons.Horsea;
import Pokemons.Magikarp;
import Pokemons.Poliwag;
import Pokemons.Voltorb;

public class VermilionCity extends City {

    public VermilionCity() {
        super("Vermilion City");
    }

    @Override
    public void initialize() {
        if(initialized) return;
        else initialized = true;
        reachableCity.add(new SaffronCity());
        reachableCity.add(new LavenderTown());
        reachableCity.add(new FuschiaCity());
        wildPokemon.add(new Poliwag());
        wildPokemon.add(new Magikarp());
        wildPokemon.add(new Horsea());
        gymLeader = new GymLeader("L.t Surge", "Electric", new Voltorb(), "Thunder");
    }
}