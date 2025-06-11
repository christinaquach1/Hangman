import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    HangmanDisplay display = new HangmanDisplay();
    Scanner scanner = new Scanner(System.in);
    boolean playAgain = true;

    // Keep playing games until player wants to quit
    while (playAgain) {
      // Start a new game
      HangmanGame game = new HangmanGame();
      game.playGame();

      // Ask if they want to play again
      System.out.print("\nDo you want to play again? (y/n): ");
      String response = scanner.nextLine().toLowerCase();

      // Simple check for yes/no
      if (response.equals("y") || response.equals("yes")) {
        System.out.println("\nStarting new game...\n");
      } else {
        playAgain = false;
        System.out.println("Thanks for playing Hangman!");
      }
    }

    scanner.close();
  }
}
