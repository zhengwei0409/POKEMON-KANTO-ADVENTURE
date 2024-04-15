package Pokemons;
/*
 * This is the parent class for all pokemons
 */
public class Pokemon {
    protected String name;
    protected String[] type;
    protected int level;
    protected int maxHp, hp;
    protected int xp;
    protected String[] strength;
    protected String[] weakness;

    

    public Pokemon(String name, int level, int maxHp, int hp, int xp) {
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.hp = hp;
        this.xp = xp;
    }



    @Override
    public String toString() {
        return name;
    }
}
