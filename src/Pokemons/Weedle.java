package Pokemons;

public class Weedle extends Pokemon {
    public Weedle() {
        super("Weedle", 1, 40, 35, 100);
        this.type = "Bug";
        this.strength = new String[]{"Grass", "Psychic", "Dark"};
        this.weakness = new String[]{"Fire", "Fighting", "Poison"};
    }
}
