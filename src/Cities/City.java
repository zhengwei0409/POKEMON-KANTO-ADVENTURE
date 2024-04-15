package Cities;

/*
 * This is the parent class of all cities and towns in the Kanto region
 */

public class City {
    protected String name;

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
