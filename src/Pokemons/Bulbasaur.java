package Pokemons;

public class Bulbasaur extends Pokemon {


    public Bulbasaur() {
        super("Bulbasaur", 1, 120, 49, 100);
        this.type = "Grass";
        this.strength = new String[]{"Water", "Ground", "Rock"};
        this.weakness = new String[]{"Fire", "Grass", "Poison"};
        this.move = new Move("Growl", "Tackle", 49);
    }

}
