package Pokemons;

public class Charmander extends Pokemon {
    
    public Charmander() {
        super("Charmander", 5, 39, 52, 100);
        this.type = "Fire";
        this.strength = new String[]{"Grass", "Ice", "Bug"};
        this.weakness = new String[]{"Fire", "Water", "Rock"};
    }
}
