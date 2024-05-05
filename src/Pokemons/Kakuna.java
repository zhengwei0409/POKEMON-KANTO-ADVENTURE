package Pokemons;

public class Kakuna extends Pokemon {
    public Kakuna() {
        super("Kakuna", 10, 145, 25, 100);
        this.type = "Bug";
        this.strength = new String[]{"Grass", "Fighting", "Ground"};
        this.weakness = new String[]{"Fire", "Flying", "Rock"};
        this.move = new Move("Tackle", "Harden", 25);
    }
}
