package Pokemons;

public class Squirtle extends Pokemon {
    
    public Squirtle() {
        super("Squirtle", 1, 124, 48, 100);
        this.type = "Water";
        this.strength = new String[]{"Fire", "Ground", "Rock"};
        this.weakness = new String[]{"Water", "Grass", "Dragon"};
        this.move = new Move("Tackle", "Tail Whip", 48);
    }
}
