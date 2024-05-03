package Pokemons;

public class Ninetales extends Pokemon {


    public Ninetales() {
        super("Ninetales", 1, 73, 76, 100);
        this.type = "Fire";
        this.strength = new String[]{"Grass", "Fire", "Ice"};
        this.weakness = new String[]{"Water", "Ground", "Rock"};
        this.move = new Move("Flamethrower", "Quick Attack", 76);
    }

}