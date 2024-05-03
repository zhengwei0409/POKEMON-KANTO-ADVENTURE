package Pokemons;

public class Goldeen extends Pokemon {


    public Goldeen() {
        super("Goldeen", 5, 45, 67, 100);
        this.type = "Water";
        this.strength = new String[]{"Water", "Ice", "Fire"};
        this.weakness = new String[]{"Grass", "Electric"};
        this.move = new Move("Peck", "Tail Whip", 67);
    }

}


