package Pokemons;

public class Aerodactyl extends Pokemon {
    
    public Aerodactyl() {
        super("Aerodactyl", 1, 80, 105, 100);
        this.type = "Rock";
        this.strength = new String[]{"Ground", "Bug", "Poison"};
        this.weakness = new String[]{"Electric", "Water", "Ice"};
        this.move = new Move("Ancient Power", "Bite", 105);
    }
}
