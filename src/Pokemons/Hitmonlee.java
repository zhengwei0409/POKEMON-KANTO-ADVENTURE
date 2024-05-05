package Pokemons;

public class Hitmonlee extends Pokemon {
    
    public Hitmonlee() {
        super("Hitmonlee", 18, 150, 120, 100);
        this.type = "Fighting";
        this.strength = new String[]{"Bug", "Rock", "Dark"};
        this.weakness = new String[]{"Flying", "Psychic", "Fairy"};
        this.move = new Move("Fake Out", "Focus Energy", 120);
    }
}
