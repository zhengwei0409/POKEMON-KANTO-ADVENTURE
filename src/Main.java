import java.util.Scanner;

import Cities.City;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {
        
        loadGame();

    }   

    // Method 1 : use for load game
    public static void loadGame() {
                // Scanner use for get input from user (most importance things in CLI program)
                Scanner sc = new Scanner(System.in);
                // Use for storing user account
                Account userAccount = new Account();
                // Storing the index of account user had chosen (so that later we know which row we need to save the account)
                int indexOfAccount = 0;
        
                // ==================================
                // Load Game
                // ==================================
                AsciiArt.displayLogo();
                System.out.println("+----------------------------------------------------------------------+");
                System.out.println("Welcome to Pokemon - Kanto Adventures");
                System.out.println("+----------------------------------------------------------------------+");
                System.out.println("[1] Load Game:");
                // get account name for each row (save1, save2 and save3)
                Database save1 = new Database(1);
                String name1 = save1.account.getName();
                Database save2 = new Database(2);
                String name2 = save2.account.getName();
                Database save3 = new Database(3);
                String name3 = save3.account.getName();
                System.out.printf("    a. Save 1 - %-10s   b. Save 2 - %-10s  c. Save 3 - %-10s\n", name1, name2, name3);
                System.out.println("[2] Start a new Adventure:");
                System.out.printf("    a. Save 1 - %-10s   b. Save 2 - %-10s  c. Save 3 - %-10s\n", decideGame(name1), decideGame(name2), decideGame(name3));
                System.out.println("[3] Exit");
                System.out.println("+----------------------------------------------------------------------+");
                System.out.print("Your choice: ");
                String userInput = sc.nextLine();
                System.out.println("+----------------------------------------------------------------------+");
        
                // use switch to execute the input (command) by user
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
                    System.out.println("[1] Bulbasaur [Grass - Level 5]");
                    System.out.println("[2] Squirtle [Water - Level 5]");
                    System.out.println("[3] Charmander [Fire - Level 5]");
                    System.out.println("+----------------------------------------------------------------------+");
                    System.out.print("Your choice: ");
                    userInput = sc.nextLine();
        
                    // assign the right pokemon chosen by the user
                    switch(userInput) {
                        case "1": 
                            userAccount.addPokemon(new Bulbasaur());
                            break;
                        case "2":
                            userAccount.addPokemon(new Squirtle());
                            break;
                        case"3":
                            userAccount.addPokemon(new Charmander());
                            break;
                        default:
                            System.out.println("Invalid Command");
                            System.exit(0);
                            break;
                    }
                    System.out.println("+----------------------------------------------------------------------+");
                    System.out.printf("OAK:    You chose %s, an amazing choice. Best of luck!\n", userAccount.getPokemonTeam().getFirst());
                    System.out.println("+----------------------------------------------------------------------+");
                }
        
        
                // ==================================
                // Start Game
                // ==================================
                System.out.printf("You are currently in %s:\n", userAccount.getLastLocation());
                
                printMenu(userAccount, indexOfAccount);
                
                
                
                sc.close();
    }

    // Method 2 : use for decide whether override or start a new game
    public static String decideGame(String name) {
        return (name.equals("empty")) ? "new" : "Override";  //  ternary operator
    } 

    // method 3 : use for printing the CLI for game menu
    public static void printMenu(Account myAccount, int indexOfAccount) {
        System.out.println("+----------------------------------------------------------------------+");
        City currentLocation = myAccount.getLastLocation();
        System.out.println("[1] Move to: ");
        System.out.printf("    a. %-17s    b. %-17s\n", currentLocation.getReachableCity().get(0), currentLocation.getReachableCity().get(1));

        if(currentLocation.equals("Pallet Town")) {
            System.out.println("[2] Talk to Mom [Your hometown has no Gym]");
        } else {
            // fight with gym leader
        }

        System.out.printf("[3] Fight Wild Pokemon [%s, %s are common]\n", currentLocation.getWildPokemon().get(0), currentLocation.getWildPokemon().get(1));

        System.out.println("[4] Player Options");
        System.out.println("    a.Show map    b.Show My Pokemon   c.Show My badges   d.Save and Exit");

        // if the city has extra feature then print [5] Extra Feature 

        // recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("+----------------------------------------------------------------------+");
        System.out.print("Your choice: ");
        String userInput = sc.nextLine();
        System.out.println("+----------------------------------------------------------------------+");

        exucuteInput(myAccount, userInput, indexOfAccount);

        sc.close();
    }

    // method 4 : use for execute command input by user
    public static void exucuteInput(Account myAccount, String userInput, int indexOfAccount) {
        City currentLocation = myAccount.getLastLocation();
        switch (userInput) {
            case "1a":
                myAccount.setLastLocation(currentLocation.getReachableCity().get(0));
                printMenu(myAccount, indexOfAccount);
                break;
            case "1b":
                myAccount.setLastLocation(currentLocation.getReachableCity().get(1));
                printMenu(myAccount, indexOfAccount);
                break;
            case "2":
                if(currentLocation.equals("Pallet Town")) {
                    Dialog.MomTalking(myAccount.getName());
                    printMenu(myAccount, indexOfAccount);
                } else {
                    // fight with gym leader
                    printMenu(myAccount, indexOfAccount);
                }
                break;
            case "3":
                // create a method for battle with wild pokemon
                printMenu(myAccount, indexOfAccount);
                break;
            case "4a":
                // create a method for showing the map
                printMenu(myAccount, indexOfAccount);
                break;
            case "4b":
                Pokemon myPokemon = myAccount.getPokemonTeam().get(0);
                System.out.println("Your Pokémon:");
                System.out.printf("%s - Level: %s\n", myPokemon.getName(), myPokemon.getLevel());
                System.out.printf("Type: %s\n", myPokemon.getType());
                System.out.printf("HP: %s\n", myPokemon.getHp());
                System.out.printf("XP: %s/%s\n", myPokemon.getCurrentXp(), myPokemon.getXp());
                System.out.println("Moves:");
                // [print the move]
                System.out.println("Strong Against:");
                for(String i : myPokemon.getStrength()) {
                    System.out.println("- " + i);
                }
                System.out.println("Weak Against:");
                for(String i : myPokemon.getWeakness()) {
                    System.out.println("- " + i);
                }
                printMenu(myAccount, indexOfAccount);
                break;
            case "4c":
                System.out.println("Your Badges:");
                for(String i : myAccount.getBadges()) {
                    System.out.println("- " + i);
                }
                printMenu(myAccount, indexOfAccount);
                break;
            case "4d":
                new Database(myAccount, indexOfAccount);
                loadGame();
                break;

            default:
                System.out.println("Invalid Command");
                System.exit(0);
                break;
        }
    }
}
