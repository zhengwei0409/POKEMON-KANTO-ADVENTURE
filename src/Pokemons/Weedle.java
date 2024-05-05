package Pokemons;

public class Weedle extends Pokemon {
    public Weedle() {
        super("Weedle", 12, 140, 35, 100);
        this.type = "Bug";
        this.strength = new String[]{"Grass", "Psychic", "Dark"};
        this.weakness = new String[]{"Fire", "Fighting", "Poison"};
        this.move = new Move("Poison Sting", "String Shot", 35);
    }
}
