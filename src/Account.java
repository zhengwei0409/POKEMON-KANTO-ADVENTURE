import java.util.ArrayList;

import Cities.City;
import Cities.PalletTown;
import Pokemons.Bulbasaur;
import Pokemons.Pokemon;

public class Account {
    private String name = "empty";
    private City lastLocation;
    private ArrayList<Pokemon> pokemonTeam = new ArrayList<>();
    private ArrayList<String> badges = new ArrayList<>();

    // full list of pokemon use in this game
    Pokemon[] fullListOfPokemon = {new Bulbasaur()};
    // full list of city use in this game
    City[] fullListOfCities = {new PalletTown()};

    // constructor
    public Account() {
        this.lastLocation = new PalletTown();
    }


    public Account(String name, String lastLocation, String[] pokemonTeam, ArrayList<String> badges) {
        handlingName(name);
        convertCityType(lastLocation);
        convertPokemonType(pokemonTeam);
        this.badges = badges;
    }

    
    // method 1 : add pokemon into the pokemon Team
    public void addPokemon(Pokemon newPokemon) {
        pokemonTeam.add(newPokemon);
    }

    // method 2 : convert String type of pokemon array into the Pokemon type array ^^
    public void convertPokemonType(String[] pokemonTeam) {
        // handle null senario
        if(pokemonTeam == null) {
            return;
        }
        for(Pokemon i : fullListOfPokemon) {
            for(String j : pokemonTeam) {
                if(j.equals(i.toString())) {
                    this.pokemonTeam.add(i);
                }
            }
        }
    }

    // method 3 : convert String type city into City type 
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

    // method 4 : handle null value of name
    public void handlingName(String name) {
        if(name == null) {
            return;
        } else {
            setName(name);
        }
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
