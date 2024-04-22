public class Dialog {
    /*
     * This class is used for storing dialog used in the game ^ ^
     */

    public static void OakWelcomeDialog() {
        System.out.println("""
        OAK:    Hello there! Welcome to the world of Pokémon! My name is Oak! 
        People call me the Pokémon Prof! This world is inhabited by creatures
        called Pokémon! For some people, Pokémon are pets. Others use them for
        fights. Myself... I study Pokémon as a profession.\n""");
        System.out.println("OAK:    First, what is your name?");
    }

    public static void OakChoosePokemonDialog(String name) {
        System.out.printf("OAK:    Right! So your name is %s! Welcome to the world of Pokemon.\n" + 
        "It's time to choose your starting pokemon.", name);
        System.out.println();
    }
}
