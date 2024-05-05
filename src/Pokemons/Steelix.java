package Pokemons;

public class Steelix extends Pokemon {
    
    public Steelix() {
        super("Steelix", 13, 75, 85, 100);
        this.type = "Steel";
        this.strength = new String[]{"Electric", "Poison", "Rock"};
        this.weakness = new String[]{"Fire", "Water", "Ground"};
        this.move = new Move("Bind", "Crunch", 85);
    }
}