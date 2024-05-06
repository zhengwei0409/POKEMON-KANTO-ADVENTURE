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
                    System.out.println("+----------------------------------------------------------------------+");
                    Dialog.OakWelcomeDialog();
                    System.out.println("+----------------------------------------------------------------------+");
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    userAccount.setName(name);
                    System.out.println("+----------------------------------------------------------------------+");
                    Dialog.OakChoosePokemonDialog(name);
                    System.out.println("+----------------------------------------------------------------------+");
                    System.out.println("[1] Bulbasaur [Grass - Level 1]");
                    System.out.println("[2] Squirtle [Water - Level 1]");
                    System.out.println("[3] Charmander [Fire - Level 1]");
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

                }
        
        
                // ==================================
                // Start Game
                // ==================================
                printMenu(userAccount, indexOfAccount);
                
                
                
                sc.close();
    }

    // Method 2 : use for decide whether override or start a new game
    public static String decideGame(String name) {
        return (name.equals("empty")) ? "new" : "Override";  //  ternary operator
    } 

    // method 3 : use for printing the CLI for game menu
    public static void printMenu(Account myAccount, int indexOfAccount) {
        City currentLocation = myAccount.getLastLocation();
        
        System.out.println("+----------------------------------------------------------------------+");
        System.out.printf("You are currently in %s:\n", currentLocation);
        System.out.println("+----------------------------------------------------------------------+");
        currentLocation.initialize();
        System.out.println("[1] Move to: ");

        if(currentLocation.getReachableCity().size() == 2) {
            System.out.printf("    a. %-17s    b. %-17s\n", currentLocation.getReachableCity().get(0), currentLocation.getReachableCity().get(1));
        } else if (currentLocation.getReachableCity().size() ==3) {
            System.out.printf("    a. %-17s    b. %-17s    c. %-17s\n", currentLocation.getReachableCity().get(0), currentLocation.getReachableCity().get(1), currentLocation.getReachableCity().get(2));
        } else {
            System.out.printf("    a. %-17s    b. %-17s    c. %-17s    d. %-17s\n", currentLocation.getReachableCity().get(0), currentLocation.getReachableCity().get(1), currentLocation.getReachableCity().get(2), currentLocation.getReachableCity().get(3));
        }
        

        if(currentLocation.equals("Pallet Town")) {
            System.out.println("[2] Talk to Mom [Your hometown has no Gym]");
        } else if (currentLocation.equals("Lavender Town")) {
            System.out.println("[2] PokeMaze");
        } else {
            System.out.printf("[2] Challenge Gym leader [%s - %s type]\n", currentLocation.getGymLeader().getName(), currentLocation.getGymLeader().getType());
        }

        System.out.printf("[3] Fight Wild Pokemon [%s, %s, %s are common]\n", currentLocation.getWildPokemon().get(0), currentLocation.getWildPokemon().get(1), currentLocation.getWildPokemon().get(2));

        System.out.println("[4] Player Options");
        System.out.println("    a.Show map    b.Show My Pokemon   c.Show My badges   d.Save and Exit");

        if(currentLocation.equals("Fuschia City")) {
            System.out.println("[5] Safari Zon");
        } else if (currentLocation.equals("Saffron City")) {
            System.out.println("[5] Rival’s Race");
        }

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
            case "1c":
                myAccount.setLastLocation(currentLocation.getReachableCity().get(2));
                printMenu(myAccount, indexOfAccount);
                break;
            case "1d":
                myAccount.setLastLocation(currentLocation.getReachableCity().get(3));
                printMenu(myAccount, indexOfAccount);
                break;
            case "2":
                if(currentLocation.equals("Pallet Town")) {
                    Dialog.MomTalking(myAccount.getName());
                } else if (currentLocation.equals("Lavender Town")) {
                    PokeMaze.playPokeMaze();
                } else {
                    Battle bt = new Battle(myAccount, currentLocation);
                    bt.challengeGymLeader();
                }
                printMenu(myAccount, indexOfAccount);
                break;
            case "3":
                Battle bt = new Battle(myAccount, currentLocation);
                bt.fightWildPokemon();
                printMenu(myAccount, indexOfAccount);
                break;
            case "4a":
                ShowMap.showMap(myAccount.getLastLocation().toString());
                printMenu(myAccount, indexOfAccount);
                break;
            case "4b":
                Pokemon myPokemon = myAccount.getPokemonTeam().get(0);
                myPokemon.printDetails();
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
            case "5":
                if(currentLocation.equals("Fuschia City")) {
                    SafariZone.playSafariZone();
                } else if (currentLocation.equals("Saffron City")) {
                    RivalRace.PlayRivalRace();
                }
                printMenu(myAccount, indexOfAccount);
            default:
                System.out.println("Invalid Command");
                System.exit(0);
                break;
        }
    }

    
}
