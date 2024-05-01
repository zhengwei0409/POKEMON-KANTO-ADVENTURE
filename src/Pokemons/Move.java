package Pokemons;

public class Move {
    private String move1;
    private String move2;
    private int move1Damage;
    private int move2Damage;

    public Move() {
        // Default constructor
    }

    public Move(String move1, String move2, int attack) {
        this.move1 = move1;
        this.move2 = move2;
        this.move1Damage = attack - 5;  // first move is the original damage of pokemon -5
        this.move2Damage = attack + 5;  // second move is the original damage of pokemon +5
    }

    // 不用管下面的
    // setters and getters
    public String getMove1() {
        return move1;
    }

    public void setMove1(String move1) {
        this.move1 = move1;
    }

    public String getMove2() {
        return move2;
    }

    public void setMove2(String move2) {
        this.move2 = move2;
    }

    public int getMove1Damage() {
        return move1Damage;
    }

    public void setMove1Damage(int move1Damage) {
        this.move1Damage = move1Damage;
    }

    public int getMove2Damage() {
        return move2Damage;
    }

    public void setMove2Damage(int move2Damage) {
        this.move2Damage = move2Damage;
    }
    
}
