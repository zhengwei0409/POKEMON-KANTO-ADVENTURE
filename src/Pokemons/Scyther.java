package Pokemons;

public class Scyther extends Pokemon {


    public Scyther() {
        super("Scyther", 1, 70, 110, 100);
        this.type = "Flying";
        this.strength = new String[]{"Ground", "Fighting", "Grass"};
        this.weakness = new String[]{"Rock", "Flying", "Fire"};
        this.move = new Move("Leer", "Quick Attack", 110);
    }

}
