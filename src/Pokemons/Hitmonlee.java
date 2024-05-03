package Pokemons;

public class Hitmonlee extends Pokemon {
    
    public Hitmonlee() {
        super("Hitmonlee", 1, 50, 120, 100);
        this.type = "Fighting";
        this.strength = new String[]{"Bug", "Rock", "Dark"};
        this.weakness = new String[]{"Flying", "Psychic", "Fairy"};
        this.move = new Move("Fake Out", "Focus Energy", 120);
    }
}
