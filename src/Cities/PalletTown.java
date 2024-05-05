package Cities;

import Pokemons.*;

/*
 * This is the town that every player's journey start
 * This town dont have a gym leader
 */

public class PalletTown extends City {

    public PalletTown() {
        super("Pallet Town");
    }

    @Override
    public void initialize() {
        if(initialized) return;
        else initialized = true;
        reachableCity.add(new ViridianCity());
        reachableCity.add(new CinnabarIsland());
        wildPokemon.add(new Scyther());
        wildPokemon.add(new Pidgey());
        wildPokemon.add(new Meowth());
    }
    
}
