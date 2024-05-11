package CLI;
import java.util.ArrayList;

import Cities.*;
import Pokemons.Pokemon;

public class Account {
    private String name = "empty";
    private City lastLocation;
    private ArrayList<Pokemon> pokemonTeam = new ArrayList<>();
    private ArrayList<String> badges = new ArrayList<>();

    // full list of city use in this game
    City[] fullListOfCities = {new CeladonCity(), new CeruleanCity(), new CinnabarIsland(), new FuschiaCity(), new LavenderTown(), new PalletTown(), new PewterCity(), new SaffronCity(), new VermilionCity(), new ViridianCity()};

    // constructor
    public Account() {
        this.lastLocation = new PalletTown();
    }


    public Account(String name, String lastLocation, ArrayList<Pokemon> pokemonTeam, ArrayList<String> badges) {
        handlingName(name);
        convertCityType(lastLocation);
        this.pokemonTeam = pokemonTeam;
        this.badges = badges;
    }

    
    // method 1 : add pokemon into the pokemon Team
    public void addPokemon(Pokemon newPokemon) {
        pokemonTeam.add(newPokemon);
    }

    // method 2 : convert String type city into City type 
    public void convertCityType(String city) {
        // if the city is null, it means it is a new game, so set the lastLocation to PalletTown
        if(city == null) {
            lastLocation = new PalletTown();
            return;
        }

        for(City i : fullListOfCities) {
            if(city.equals(i.toString())) {
                lastLocation = i;
            }
        }
    }

    // method 3 : handle null value of name
    public void handlingName(String name) {
        if(name == null) {
            return;
        } else {
            setName(name);
        }
    }

    // method 4 : add badges
    public void addBadges(String badge) {
        this.badges.add(badge);
    }


    // setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public City getLastLocation() {
        return lastLocation;
    }
    public void setLastLocation(City lastLocation) {
        this.lastLocation = lastLocation;
    }
    public ArrayList<Pokemon> getPokemonTeam() {
        return pokemonTeam;
    }
    public void setPokemonTeam(ArrayList<Pokemon> pokemonTeam) {
        this.pokemonTeam = pokemonTeam;
    }
    public ArrayList<String> getBadges() {
        return badges;
    }
    public void setBadges(ArrayList<String> badges) {
        this.badges = badges;
    }


}
