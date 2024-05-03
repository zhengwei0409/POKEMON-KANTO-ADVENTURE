package Pokemons;

public class Cubone extends Pokemon {


    public Cubone() {
        super("Cubone", 1, 50, 50, 100);
        this.type = "Ground";
        this.strength = new String[]{"Electric", "Poison", "Rock"};
        this.weakness = new String[]{"Water", "Grass", "Ice"};
        this.move = new Move("Growl", "Mud-Slap", 50);
    }

}

