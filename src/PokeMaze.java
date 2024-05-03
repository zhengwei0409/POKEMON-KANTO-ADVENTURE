import java.util.Scanner;
import java.util.Stack;

public class PokeMaze {


    private static final char[][] maze = {
        "# # # # # # # # # # # # # # # # #".toCharArray(),
        "# S . . . . # . . . . . . . . . #".toCharArray(),
        "# # # # # . # . # # # # # # # . #".toCharArray(),
        "# . . . # . # . # . . . . . # . #".toCharArray(),
        "# # # . # . # # # G # . # . # # #".toCharArray(),
        "# . . . # . . . # . . . # . . . #".toCharArray(),
        "# # # # # G # . # . # . # # # . #".toCharArray(),
        "# . . . . . . . . . # . . . . . #".toCharArray(),
        "# # # # # # # # # # # # # # # E #".toCharArray(),
    };

    public static void playPokeMaze() {
        int playerRow = 1;
        int playerCol = 2;

        Scanner scanner = new Scanner(System.in);
        char direction;

        Stack<String> path = new Stack<>();

        while (true) {
            displayMaze(playerRow, playerCol);
            System.out.print("Enter direction (u, d, l, r): ");
            direction = scanner.nextLine().charAt(0);

            // Update player position based on direction
            switch (direction) {
                case 'u':
                    if (maze[playerRow - 1][playerCol] != '#') {
                        maze[playerRow][playerCol] = '.'; // Clear the previous position
                        playerRow--;
                        path.push("up");
                    } else {
                        System.out.println("Invalid move. Try again.");
                    }
                    break;
                case 'd':
                    if (maze[playerRow + 1][playerCol] != '#') {
                        maze[playerRow][playerCol] = '.'; // Clear the previous position
                        playerRow++;
                        path.push("down");
                    } else {
                        System.out.println("Invalid move. Try again.");
                    }
                    break;
                case 'l':
                    if (maze[playerRow][playerCol - 2] != '#') {
                        maze[playerRow][playerCol] = '.'; // Clear the previous position
                        playerCol-=2;
                        path.push("left");
                    } else {
                        System.out.println("Invalid move. Try again.");
                    }
                    break;
                case 'r':
                    if ((maze[playerRow][playerCol + 2] != '#')) {
                        maze[playerRow][playerCol] = '.'; // Clear the previous position
                        playerCol+=2;
                        path.push("right");
                    } else {
                        System.out.println("Invalid move. Try again.");
                    }
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
            }
            
            // Check for Ghastly encounter
            if (maze[playerRow][playerCol] == 'G') {
                maze[playerRow][playerCol] = 'Y';
                displayMaze(playerRow, playerCol);
                System.out.println("Oh no! You encountered a Ghastly and got caught. \nGame Over.");
                break;
            }
            
            if(maze[playerRow][playerCol] == 'E'){
                maze[playerRow][playerCol] = 'Y';
                displayMaze(playerRow, playerCol);
                System.out.println("Congratulations! You've reached the end of the maze");
                break;
            }
            
            // Update player's position in the maze
            maze[playerRow][playerCol] = 'Y';
            
        }

    }

    private static void displayMaze(int playerRow, int playerCol) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (i == playerRow && j == playerCol) {
                    System.out.print('Y');
                } else {
                    char currentChar = maze[i][j];
                    if (currentChar != ' ') {
                        System.out.print(currentChar);
                    } else {
                        System.out.print(' '); // Print space for other characters
                    }
                }
            }
            System.out.println();
        }
    }

}
