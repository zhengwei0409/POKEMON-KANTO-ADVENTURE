package Pokemons;

public class Staryu extends Pokemon {


    public Staryu() {
        super("Staryu", 18, 70, 45, 100);
        this.type = "Water";
        this.strength = new String[]{"Water", "Fire", "Ice"};
        this.weakness = new String[]{"Grass", "Electric"};
        this.move = new Move("Harden", "Tackle", 45);
    }

}