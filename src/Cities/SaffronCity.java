package Cities;

import Pokemons.*;
public class SaffronCity extends City {

    public SaffronCity() {
        super("Saffron City");
    }

    @Override
    public void initialize() {
        if(initialized) return;
        else initialized = true;
        reachableCity.add(new CeruleanCity());
        reachableCity.add(new LavenderTown());
        reachableCity.add(new VermilionCity());
        reachableCity.add(new CeladonCity());
        wildPokemon.add(new Hitmonlee());
        wildPokemon.add(new Hitmonchan());
        wildPokemon.add(new Porygon());
        gymLeader = new GymLeader("Sabrina", "Psychic", new Kadabra(), "Marsh");
    }
}
