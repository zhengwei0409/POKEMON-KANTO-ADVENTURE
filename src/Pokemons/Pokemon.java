package Pokemons;
/*
 * This is the parent class for all pokemons
 */
public class Pokemon {
    protected String name;
    protected String type;
    protected int level;
    protected int maxHp, hp, attack;
    protected int currentXp = 0, xp;
    protected String[] strength;
    protected String[] weakness;

    public Pokemon() {
        // default constructor
    }

    public Pokemon(String name, int level, int maxHp, int attack, int xp) {
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.attack = attack;
        this.xp = xp;
    }


    // setter and getter 
    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }



    public int getLevel() {
        return level;
    }



    public void setLevel(int level) {
        this.level = level;
    }



    public int getMaxHp() {
        return maxHp;
    }



    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurrentXp() {
        return currentXp;
    }

    public void setCurrentXp(int xp) {
        this.currentXp = xp;
    }

    public int getHp() {
        return hp;
    }



    public void setHp(int hp) {
        this.hp = hp;
    }



    public int getXp() {
        return xp;
    }



    public void setXp(int xp) {
        this.xp = xp;
    }



    public String[] getStrength() {
        return strength;
    }



    public void setStrength(String[] strength) {
        this.strength = strength;
    }



    public String[] getWeakness() {
        return weakness;
    }



    public void setWeakness(String[] weakness) {
        this.weakness = weakness;
    }



    @Override
    public String toString() {
        return name;
    }
}
