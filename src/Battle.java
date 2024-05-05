import java.util.Random;
import java.util.Scanner;

import Cities.City;
import Cities.GymLeader;
import Pokemons.Pokemon;
/*
 * this class is use for challenge gym leader & battle wild pokemon
 */
public class Battle {

    Account account;
    City currentLocation;
    Pokemon userPokemon;

    // constructor
    public Battle(Account account, City currentLocation) {
        this.account = account;
        this.currentLocation = currentLocation;
        userPokemon = account.getPokemonTeam().get(0);
    }
    
    // method for challenge gym leader
    public void challengeGymLeader() {
        GymLeader gymLeader = currentLocation.getGymLeader();
        Pokemon gymLeaderPokemon = gymLeader.getPokemon();
        System.out.println("+----------------------------------------------------------------------+");
        System.out.printf("You are about to challenge Gym Leader %s!\n",gymLeader);
        System.out.println("Prepare yourself for an intense battle!");
        System.out.println("Your Pokémon:");
        System.out.printf("%s - Level: %d\n", userPokemon, userPokemon.getLevel());
        System.out.println("+----------------------------------------------------------------------+");
        System.out.printf("Battle Start: Trainer %s vs. Gym Leader %s!\n", account.getName(), gymLeader);
        System.out.printf("%s sends out %s [Level %d]!\n", gymLeader, gymLeaderPokemon, gymLeaderPokemon.getLevel());

        
        boolean isWin = playBattle(gymLeaderPokemon);
        if(isWin) {
            if(!account.getBadges().contains(currentLocation.getGymLeader().getBadges()))
                account.addBadges(currentLocation.getGymLeader().getBadges());
        }
    }

    // method for challenge wild pokemon
    public void fightWildPokemon() {
        Random random = new Random();
        // generate a random wild pokemon to battle
        int wildPokemonIndex = random.nextInt(3);
        Pokemon wildPokemon = currentLocation.getWildPokemon().get(wildPokemonIndex);
        System.out.println("+----------------------------------------------------------------------+");
        System.out.println("You are about to fight with wild pokemon!");
        System.out.println("Prepare yourself for an intense battle!");
        System.out.println("Your Pokémon:");
        System.out.printf("%s - Level: %d\n", userPokemon, userPokemon.getLevel());
        System.out.println("+----------------------------------------------------------------------+");
        System.out.printf("Battle Start: Trainer %s vs. Wild Pokemon!\n", account.getName());
        System.out.printf("Fight with wild pokemon %s [Level %d]!\n", wildPokemon, wildPokemon.getLevel());
        System.out.println();

        playBattle(wildPokemon);
    }



    public boolean playBattle(Pokemon opponentPokemon) {

        Scanner sc = new Scanner(System.in);
        
        // determine whether user pokemon is Strong/Weak/Neutral against opponent's pokemon
        Boolean isStrong = null;
        for(String i : userPokemon.getStrength()) {
            if(i.equals(opponentPokemon.getType())) isStrong = true;
        }

        for(String i : userPokemon.getWeakness()) {
            if(i.equals(opponentPokemon.getType())) isStrong = false;
        }

        if(isStrong == null) {
            System.out.printf("%s is sent out! Its %s type is neutral against the opponent’s %s.\n", userPokemon, userPokemon.getType(), opponentPokemon);
        } else if(isStrong == false) {
            System.out.printf("%s is sent out! Its %s type is weak against the opponent’s %s.\n", userPokemon, userPokemon.getType(), opponentPokemon);
        } else {
            System.out.printf("%s is sent out! Its %s type is strong against the opponent’s %s.\n", userPokemon, userPokemon.getType(), opponentPokemon);
        }
        System.out.println();
        int roundNumber = 1;
        boolean isWin = false;
        int opponentPokemonHp = opponentPokemon.getHp();
        int userPokemonHp = userPokemon.getMaxHp();

        while (true) {
    
            // battle start
            System.out.printf("Round %d:\n", roundNumber);
            System.out.printf("%s's Moves:\n", userPokemon);
            System.out.println("1. " + userPokemon.getMove().getMove1());
            System.out.println("2. " + userPokemon.getMove().getMove2());
            System.out.println();
            
            System.out.printf("Which move will %s use?\n", userPokemon);
            System.out.printf("Your choice: ");
            String userInput = sc.nextLine();

            System.out.println("+----------------------------------------------------------------------+");

            int userDamage = 0;
            switch(userInput) {
                case "1": 
                    System.out.printf("%s used %s!\n", userPokemon, userPokemon.getMove().getMove1());
                    userDamage = userPokemon.getMove().getMove1Damage();
                    break;
                case "2":
                    System.out.printf("%s used %s!\n", userPokemon, userPokemon.getMove().getMove2());
                    userDamage = userPokemon.getMove().getMove2Damage();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            
            opponentPokemonHp -= userDamage;

            if(opponentPokemonHp > 0) {
                System.out.printf("%s's HP drops slightly. [%s HP: %d/%d]\n", opponentPokemon, opponentPokemon, opponentPokemonHp, opponentPokemon.getMaxHp());
                System.out.println();
                roundNumber++;
            } else {
                System.out.println("It's super effective!");
                System.out.printf("%s faints!\n", opponentPokemon);
                System.out.println();

                // Pokemon Mastery (levelling up)
                int xpGained = 5 * opponentPokemon.getLevel();
                System.out.printf("%s gained %dxp.\n", userPokemon,xpGained);
                int currentXp = userPokemon.getCurrentXp();
                currentXp += xpGained;

                while (currentXp >= userPokemon.getXp()) {
                    System.out.printf("%s [XP: %d/%d]\n",userPokemon, currentXp, userPokemon.getXp());
                    System.out.println();
                    System.out.printf("%s leveled up.\n", userPokemon);
                    System.out.printf("%s[Level %d --> Level %d]\n", userPokemon, userPokemon.getLevel(), userPokemon.getLevel()+1);
                    currentXp -= userPokemon.getXp();
                    userPokemon.setLevel(userPokemon.getLevel()+1);
                    if(userPokemon.getLevel() >= 10 && userPokemon.getLevel() < 30) {
                        userPokemon.setXp(200);
                    } else if(userPokemon.getLevel() >= 30) {
                        userPokemon.setXp(300);
                    }
                    userPokemon.getMove().setMove1Damage(userPokemon.getMove().getMove1Damage()+2);
                    userPokemon.getMove().setMove2Damage(userPokemon.getMove().getMove2Damage()+2);
                    userPokemon.setMaxHp(userPokemon.getMaxHp()+2);
                }
                userPokemon.setCurrentXp(currentXp);
                userPokemon.setHp(userPokemon.getMaxHp());
                isWin = true;
                break;
            }

            Random random = new Random();
            int opponentMoveIndex = random.nextInt(2);
            int opponentDamage = 0;
            String opponentMove;
            if(opponentMoveIndex==0) {
                opponentDamage = opponentPokemon.getMove().getMove1Damage();
                opponentMove = opponentPokemon.getMove().getMove1();
            } else {
                opponentDamage = opponentPokemon.getMove().getMove2Damage();
                opponentMove = opponentPokemon.getMove().getMove2();
            }
            
            
            userPokemonHp -= opponentDamage;
            if(userPokemonHp > 0) {
                System.out.printf("%s uses %s!\n", opponentPokemon, opponentMove);
                System.out.printf("%s takes some damage. [%s HP: %d/%d]\n", userPokemon, userPokemon, userPokemonHp, userPokemon.getMaxHp());
                System.out.println();
            } else {
                System.out.println("You have been defeated!");
                isWin = false;
                break;
            }
        }

        return isWin;

    } 
}
