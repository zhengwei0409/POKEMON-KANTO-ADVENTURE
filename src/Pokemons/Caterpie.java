package Pokemons;

public class Caterpie extends Pokemon {
    public Caterpie() {
        super("Caterpie", 1, 45, 30, 100);
        this.type = "Bug";
        this.strength = new String[]{"Grass", "Psychic", "Dark"};
        this.weakness = new String[]{"Fire", "Fighting", "Poison"};
    }
}
