package Pokemons;

public class Tentacool extends Pokemon {


    public Tentacool() {
        super("Tentacool", 13, 140, 40, 100);
        this.type = "Water";
        this.strength = new String[]{"Water", "Fire", "Ice"};
        this.weakness = new String[]{"Ground", "Electric", "Psychic"};
        this.move = new Move("Poison Sting", "Water Gun", 40);
    }

}
