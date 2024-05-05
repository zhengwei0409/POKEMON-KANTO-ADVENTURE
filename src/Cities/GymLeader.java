package Cities;

import Pokemons.Pokemon;

public class GymLeader {
    String name;
    String type;
    Pokemon pokemon; 
    String badges;

    // constructor
    public GymLeader(String name, String type, Pokemon pokemon, String badges) {
        this.name = name;
        this.type = type;
        this.pokemon = pokemon;
        this.badges = badges;
    }

    // 不用管下面的
    // setters and getters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public String getBadges() {
        return badges;
    }

    public void setBadges(String badges) {
        this.badges = badges;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    

}
