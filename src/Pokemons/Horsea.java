package Pokemons;

public class Horsea extends Pokemon {
    
    public Horsea() {
        super("Horses", 1, 30, 40, 100);
        this.type = "Water";
        this.strength = new String[]{"Fire", "Water", "Ice"};
        this.weakness = new String[]{"Electric", "Grass"};
        this.move = new Move("Leer", "Water Gun", 40);
    }
}

