package Cities;

import Pokemons.Caterpie;
import Pokemons.Kakuna;
import Pokemons.Rhyhorn;
import Pokemons.Weedle;

public class ViridianCity extends City {

    public ViridianCity() {
        super("Viridian City");
        
    }
    
    @Override
    public void initialize() {
        reachableCity.add(new PalletTown());
        reachableCity.add(new PewterCity());
        wildPokemon.add(new Weedle());
        wildPokemon.add(new Kakuna());
        wildPokemon.add(new Caterpie());
        gymLeader = new GymLeader("Giovanni", "Ground", new Rhyhorn(), "Earth");
    }
}
