package Pokemons;

public class Porygon extends Pokemon {
    
    public Porygon() {
        super("Porygon", 1, 65, 60, 100);
        this.type = "Normal";
        this.strength = new String[]{"Ghost"};
        this.weakness = new String[]{"Fighting"};
        this.move = new Move("Conversion", "Tackle", 60);
    }
}
