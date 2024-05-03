package Pokemons;

public class Gloom extends Pokemon {


    public Gloom() {
        super("Gloom", 1, 60, 65, 100);
        this.type = "Grass";
        this.strength = new String[]{"Water", "Grass", "Electric"};
        this.weakness = new String[]{"Fire", "Psychic", "Ice"};
        this.move = new Move("Charm", "Protect", 65);
    }

}