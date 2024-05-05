package Cities;

import java.util.ArrayList;

import Pokemons.Pokemon;

/*
 * This is the parent class of all cities and towns in the Kanto region
 */

public class City {
    protected String name;
    protected ArrayList<City> reachableCity = new ArrayList<>();
    protected ArrayList<Pokemon> wildPokemon = new ArrayList<>();
    protected GymLeader gymLeader;
    protected boolean initialized = false;
    

    public City(String name) {
        this.name = name;
    }

    public void initialize() {
        // Implement city attributes
    }


    // 不用管下面的
    // setters and getters
    public ArrayList<City> getReachableCity() {
        return reachableCity;
    }

    public ArrayList<Pokemon> getWildPokemon() {
        return wildPokemon;
    }

    public void setWildPokemon(ArrayList<Pokemon> wildPokemon) {
        this.wildPokemon = wildPokemon;
    }

    public GymLeader getGymLeader() {
        return gymLeader;
    }

    public void setGymLeader(GymLeader gymLeader) {
        this.gymLeader = gymLeader;
    }

    @Override
    public String toString() {
        return name;
    }


    public boolean equals(String n) {
        return this.name.equalsIgnoreCase(n);
    }
}
