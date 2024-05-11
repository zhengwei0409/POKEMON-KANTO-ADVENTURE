package CLI;
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

    public static void MomTalking(String name) {
        System.out.printf("""
            MOM:    "Oh, %s! You're leaving on your adventure with Pokémon? How
            exciting! I know you've always dreamed of this day. Remember, the bond
            you share with your Pokémon is the most important thing. Take care of
            them, and they'll take care of you. Don't worry about me; I'll be just
            fine here. I can't wait to hear all about your adventures and the new
            friends you're going to make. Remember, no matter how far you go, I'm
            always here for you. Be brave, be kind, and everything will turn out
            just fine. I'm so proud of you already! Now, go on, your adventure
            awaits! Oh, and don’t forget to change your underwear every day! Safe
            travels, my dear!"\n""", name);
    }
}
