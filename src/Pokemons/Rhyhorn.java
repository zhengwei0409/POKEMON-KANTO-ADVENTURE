package Pokemons;

public class Rhyhorn extends Pokemon {
    
    public Rhyhorn() {
        super("Rhyhorn", 43, 280, 85, 100);
        this.type = "Ground";
        this.strength = new String[]{"Fire", "Electric", "Poison"};
        this.weakness = new String[]{"Grass", "Bug"};
        this.move = new Move("Tackle", "Tail Whip", 85);
    }
}
