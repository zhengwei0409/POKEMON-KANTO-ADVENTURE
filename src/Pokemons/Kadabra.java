package Pokemons;

public class Kadabra extends Pokemon {
    
    public Kadabra() {
        super("Kadabra", 30, 170, 35, 100);
        this.type = "Psychic";
        this.strength = new String[]{"Psychic", "Fighting"};
        this.weakness = new String[]{"Bug", "Ghost", "Dark"};
        this.move = new Move("Confusion", "Disable", 35);
    }
}
