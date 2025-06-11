
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create display object to show title
        HangmanDisplay display = new HangmanDisplay();
        System.out.println(display.getGameTitle());
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        
        // Outer loop for playing multiple games
        while (playAgain) {
            // Create new game instance
            HangmanGame game = new HangmanGame();
            
            // Play the game
            game.playGame();
            
            // Ask if user wants to play again
            System.out.print("\nDo you want to play again? (y/n): ");
            String response = scanner.nextLine().toLowerCase();
            
            // If/else statement to determine if user wants to continue
            if (response.equals("y") || response.equals("yes")) {
                System.out.println("\nStarting new game...\n");
                playAgain = true;
            } else {
                playAgain = false;
                System.out.println("Thanks for playing Hangman!");
            }
        }
        
        scanner.close();
    }
}
