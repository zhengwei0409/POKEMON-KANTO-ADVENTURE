package Cities;

import Pokemons.Meowth;
import Pokemons.Pidgey;

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
        reachableCity.add(new ViridianCity());
        reachableCity.add(new CinnabarIsland());
        wildPokemon.add(new Pidgey());
        wildPokemon.add(new Meowth());
    }
    
}
