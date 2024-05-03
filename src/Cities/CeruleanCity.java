package Cities;
import Pokemons.*;
public class CeruleanCity extends City {

    public CeruleanCity() {
        super("Cerulean City");
    }

    @Override
    public void initialize() {
        reachableCity.add(new PewterCity());
        reachableCity.add(new SaffronCity());
        reachableCity.add(new LavenderTown());
        wildPokemon.add(new Magikarp());
        wildPokemon.add(new Goldeen());
        wildPokemon.add(new Krabby());
        gymLeader = new GymLeader("Misty", "Water", new Staryu(), "Cascade");
    }
}
