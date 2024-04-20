import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Scanner use for get input from user (most importance things in CLI program)
        Scanner sc = new Scanner(System.in);
        // Use for storing user account
        Account userAccount = new Account();
        // Storing the index of account user had chosen
        int indexOfAccount = 0;
        // Game menu
        AsciiArt.displayLogo();
        System.out.println("+----------------------------------------------------------------------+");
        System.out.println("Welcome to Pokemon - Kanto Adventures");
        System.out.println("+----------------------------------------------------------------------+");
        System.out.println("[1] Load Game:");
        // get account name
        Database save1 = new Database(1);
        String name1 = save1.account.getName();
        Database save2 = new Database(2);
        String name2 = save2.account.getName();
        Database save3 = new Database(3);
        String name3 = save3.account.getName();
        System.out.printf("    a. Save 1 - %-10s   b. Save 2 - %-10s  c. Save 3 - %-10s\n", name1, name2, name3);
        System.out.println("[2] Start a new Adventure:");
        System.out.printf("    a. Save 1 - %-10s   b. Save 2 - %-10s  c. Save 3 - %-10s\n", determineGame(name1), determineGame(name2), determineGame(name3));
        System.out.println("[3] Exit");
        System.out.println("+----------------------------------------------------------------------+");
        System.out.print("Your choice: ");
        String userInput = sc.nextLine();
        System.out.println("+----------------------------------------------------------------------+");

        switch (userInput) {
            case "1a":
                userAccount = save1.account;
                indexOfAccount = 1;
                break;
            case "1b":
                userAccount = save2.account;
                indexOfAccount = 2;
                break;
            case "1c":
                userAccount = save3.account;
                indexOfAccount = 3;
                break;
            case "2a":
                indexOfAccount = 1;
                break;
            case "2b":
                indexOfAccount = 2;
                break;
            case "2c":
                indexOfAccount = 3;
                break;
            case "3":
                System.exit(0); // terminate the program
            default:
                System.out.println("Invalid Command");
                System.exit(0);
                break;
        }

        // if user account name field is empty, it means that it is a new game
        if(userAccount.getName().equals("empty")) {
            Dialog.OakWelcomeDialog();
            System.out.println("+----------------------------------------------------------------------+");
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            userAccount.setName(name);
            System.out.println("+----------------------------------------------------------------------+");
            Dialog.OakChoosePokemonDialog(name);
            System.out.println("+----------------------------------------------------------------------+");
            
        }

        System.out.println("User name: " + userAccount.getName());
        
        
        sc.close();


    }   

    // method for determine whether override or start a new game
    public static String determineGame(String name) {
        return (name.equals("empty")) ? "new" : "Override";  //  ternary operator
    } 
}
