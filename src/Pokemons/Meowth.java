package Pokemons;

public class Meowth extends Pokemon {
    public Meowth() {
        super("Meowth", 5, 40, 45, 100);
        this.type = "Normal";
        this.strength = new String[]{"Rock", "Steel"};
        this.weakness = new String[]{"Ghost"};
        this.move = new Move("Fake Out", "Growl", 45);
    }
}
