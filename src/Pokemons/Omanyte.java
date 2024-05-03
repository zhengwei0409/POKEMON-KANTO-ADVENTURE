package Pokemons;

public class Omanyte extends Pokemon {
    
    public Omanyte() {
        super("Omanyte", 1, 35, 40, 100);
        this.type = "Water";
        this.strength = new String[]{"Fire", "Ice", "Poison"};
        this.weakness = new String[]{"Electric", "Grass", "Ground"};
        this.move = new Move("Bind", "Withdraw", 40);
    }
}
