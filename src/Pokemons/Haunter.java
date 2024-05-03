package Pokemons;

public class Haunter extends Pokemon {


    public Haunter() {
        super("Haunter", 1, 45, 50, 100);
        this.type = "Poison";
        this.strength = new String[]{"Fighting", "Ground", "Bug"};
        this.weakness = new String[]{"Psychic", "Ghost", "Dark"};
        this.move = new Move("Confuse Ray", "Lick", 50);
    }

}
