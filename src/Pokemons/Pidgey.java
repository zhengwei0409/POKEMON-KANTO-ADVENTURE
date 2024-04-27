package Pokemons;

public class Pidgey extends Pokemon {
    public Pidgey() {
        super("Pidgey", 1, 40, 45, 100);
        this.type = "Normal";
        this.strength = new String[]{"Rock", "Steel"};
        this.weakness = new String[]{"Ghost"};
    }
}
