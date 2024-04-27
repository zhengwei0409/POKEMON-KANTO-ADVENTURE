package Pokemons;

public class Squirtle extends Pokemon {
    
    public Squirtle() {
        super("Squirtle", 5, 44, 48, 100);
        this.type = "Water";
        this.strength = new String[]{"Fire", "Ground", "Rock"};
        this.weakness = new String[]{"Water", "Grass", "Dragon"};
    }
}
