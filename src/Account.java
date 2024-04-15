import java.util.ArrayList;

import Cities.City;
import Pokemons.Pokemon;

public class Account {
    private String name;
    private City lastLocation;
    private ArrayList<Pokemon> pokemonTeam;
    private String[] badges = new String[7];

    // constructor
    public Account(String name, City lastLocation, ArrayList<Pokemon> pokemonTeam) {
        this.name = name;
        this.lastLocation = lastLocation;
        this.pokemonTeam = null;
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
    public String[] getBadges() {
        return badges;
    }
    public void setBadges(String[] badges) {
        this.badges = badges;
    }





    
}
