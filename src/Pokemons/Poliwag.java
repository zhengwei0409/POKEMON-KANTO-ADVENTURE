package Pokemons;

public class Poliwag extends Pokemon {


    public Poliwag() {
        super("Poliwag", 8, 100, 50, 100);
        this.type = "Water";
        this.strength = new String[]{"Water", "Fire", "Ice"};
        this.weakness = new String[]{"Grass", "Electric"};
        this.move = new Move("Hypnosis", "Water Gun", 50);
    }

}
