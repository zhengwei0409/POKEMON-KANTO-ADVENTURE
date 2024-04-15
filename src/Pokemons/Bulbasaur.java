package Pokemons;

public class Bulbasaur extends Pokemon {


    public Bulbasaur() {
        super("Bulbasaur", 5, 45, 45, 100);
        this.type = new String[]{"Grass", "Poison"};
        this.strength = new String[]{"Water", "Ground", "Rock"};
        this.weakness = new String[]{"Fire", "Ice", "Flying", "Psychic"};
    }

}
