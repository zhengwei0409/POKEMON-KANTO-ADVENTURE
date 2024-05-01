package Pokemons;

public class Rhyhorn extends Pokemon {
    
    public Rhyhorn() {
        super("Rhyhorn", 1, 80, 85, 100);
        this.type = "Ground";
        this.strength = new String[]{"Fire", "Electric", "Poison"};
        this.weakness = new String[]{"Grass", "Bug"};
    }
}
