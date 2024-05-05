package Pokemons;

public class Arbok extends Pokemon {


    public Arbok() {
        super("Arbok", 25, 160, 95, 100);
        this.type = "Poison";
        this.strength = new String[]{"Grass", "Poison", "Bug"};
        this.weakness = new String[]{"Ground", "Psychic"};
        this.move = new Move("Bite", "Leer", 95);
    }

}