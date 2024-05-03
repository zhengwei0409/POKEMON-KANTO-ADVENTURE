package Pokemons;

public class Magikarp extends Pokemon {


    public Magikarp() {
        super("Magikarp", 5, 20, 10, 100);
        this.type = "Water";
        this.strength = new String[]{"Water", "Fire", "Ice"};
        this.weakness = new String[]{"Grass", "Electric"};
        this.move = new Move("Splash", "Tackle", 10);
    }

}