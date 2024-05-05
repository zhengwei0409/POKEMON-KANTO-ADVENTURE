package Pokemons;

public class Krabby extends Pokemon {


    public Krabby() {
        super("Krabby", 12, 68, 105, 100);
        this.type = "Water";
        this.strength = new String[]{"Water", "Fire", "Ice"};
        this.weakness = new String[]{"Grass", "Electric"};
        this.move = new Move("Leer", "Water Gun", 105);
    }

}