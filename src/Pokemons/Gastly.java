package Pokemons;

public class Gastly extends Pokemon {


    public Gastly() {
        super("Gastly", 1, 30, 35, 100);
        this.type = "Poison";
        this.strength = new String[]{"Fighting", "Ground", "Bug"};
        this.weakness = new String[]{"Psychic", "Ghost", "Dark"};
        this.move = new Move("Confuse Ray", "Lick", 35);
    }

}


