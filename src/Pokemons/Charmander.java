package Pokemons;

public class Charmander extends Pokemon {
    
    public Charmander() {
        super("Charmander", 1, 129, 52, 100);
        this.type = "Fire";
        this.strength = new String[]{"Grass", "Ice", "Bug"};
        this.weakness = new String[]{"Fire", "Water", "Rock"};
        this.move = new Move("Growl", "Scratch", 52);
    }
}
