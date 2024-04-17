public class Main {
    public static void main(String[] args) {
        
        AsciiArt.displayLogo();
        System.out.println("+----------------------------------------------------------------------+");
        System.out.println("Welcome to Pokemon - Kanto Adventures");
        System.out.println("+----------------------------------------------------------------------+");
        // System.out.println("[1] Load Game:");
        // System.out.println("    a. Save 1 - empty       b. Save 2 - empty      c. Save 3 - empty");
        // System.out.println("[2] Start a new Adventure:");
        // System.out.println("    a. Save 1 - new    b. Save 2 - new        c. Save 3 - new");
        // System.out.println("[3] Exit");
        // System.out.println("+----------------------------------------------------------------------+");
        // System.out.print("Your choice: ");

        Database save1 = new Database(1);

        System.out.println(save1.account.getLastLocation());

    }   
}
