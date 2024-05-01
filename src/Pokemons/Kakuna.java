package Pokemons;

public class Kakuna extends Pokemon {
    public Kakuna() {
        super("Kakuna", 1, 45, 25, 100);
        this.type = "Bug";
        this.strength = new String[]{"Grass", "Fighting", "Ground"};
        this.weakness = new String[]{"Fire", "Flying", "Rock"};
    }
}
