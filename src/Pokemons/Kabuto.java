package Pokemons;

public class Kabuto extends Pokemon {
    
    public Kabuto() {
        super("Kabuto", 1, 30, 80, 100);
        this.type = "Water";
        this.strength = new String[]{"Fire", "Ice", "Poison"};
        this.weakness = new String[]{"Electric", "Grass", "Ground"};
        this.move = new Move("Absord", "Harden", 80);
    }
}
