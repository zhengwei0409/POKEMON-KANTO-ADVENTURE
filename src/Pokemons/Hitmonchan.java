package Pokemons;

public class Hitmonchan extends Pokemon {
    
    public Hitmonchan() {
        super("Hitmonchan", 1, 50, 105, 100);
        this.type = "Fighting";
        this.strength = new String[]{"Bug", "Rock", "Dark"};
        this.weakness = new String[]{"Flying", "Psychic", "Fairy"};
        this.move = new Move("Fake Out", "Focus Energy", 105);
    }
}
