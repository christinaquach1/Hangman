
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    // Game components
    private WordBank wordBank;                    // Where we get words from
    private HangmanDisplay display;               // Handles all the drawing
    private String currentWord;                   // The word player is guessing
    private ArrayList<Character> guessedLetters;  // All letters guessed so far
    private ArrayList<Character> correctGuesses;  // Only the correct letters
    private int wrongGuesses;                     // How many wrong guesses
    private final int MAX_WRONG_GUESSES = 6;      // Game over limit
    private Scanner scanner;                      // For user input

    // Constructor - set up a new game
    public HangmanGame() {
        this.wordBank = new WordBank();
        this.display = new HangmanDisplay();
        this.guessedLetters = new ArrayList<>();
        this.correctGuesses = new ArrayList<>();
        this.wrongGuesses = 0;
        this.scanner = new Scanner(System.in);
        this.currentWord = wordBank.getRandomWord().toLowerCase();
    }

    // Check if game is over (too many wrong guesses or word complete)
    public boolean isGameOver() {
        return wrongGuesses >= MAX_WRONG_GUESSES || isWordGuessed();
    }

    // Check if player has guessed the entire word
    public boolean isWordGuessed() {
        // Loop through each letter in the word
        for (char letter : currentWord.toCharArray()) {
            if (!correctGuesses.contains(letter)) {
                return false;  // Found a letter not guessed yet
            }
        }
        return true;  // All letters have been guessed
    }

    // Process a letter guess from the player
    public void makeGuess(char guess) {
        guess = Character.toLowerCase(guess);
        
        // Check if already guessed this letter
        if (guessedLetters.contains(guess)) {
            System.out.println("You already guessed that letter!");
            return;
        }
        
        // Add to list of guessed letters
        guessedLetters.add(guess);
        
        // Check if the guess is correct
        if (currentWord.contains(String.valueOf(guess))) {
            correctGuesses.add(guess);
            System.out.println("Good guess!");
        } else {
            wrongGuesses++;
            System.out.println("Wrong guess!");
        }
    }

    // Show the current state of the game
    public void displayGameState() {
        display.drawHangman(wrongGuesses);
        System.out.println("\nWord: " + getDisplayWord());
        System.out.println("Guessed letters: " + guessedLetters);
        System.out.println("Wrong guesses: " + wrongGuesses + "/" + MAX_WRONG_GUESSES);
    }

    // Build the word display with blanks and revealed letters
    public String getDisplayWord() {
        StringBuilder displayWord = new StringBuilder();
        // Loop through each letter in the word
        for (char letter : currentWord.toCharArray()) {
            if (correctGuesses.contains(letter)) {
                displayWord.append(letter).append(" ");  // Show the letter
            } else {
                displayWord.append("_ ");                 // Show blank
            }
        }
        return displayWord.toString().trim();
    }

    // Main game loop - keeps running until game is over
    public void playGame() {
        System.out.println("Welcome to Hangman!");
        System.out.println("Guess the word letter by letter.");
        
        // Keep playing until game ends
        while (!isGameOver()) {
            displayGameState();
            System.out.print("\nEnter your guess: ");
            String input = scanner.nextLine();
            
            // Simple check - just need one letter
            if (input.length() == 1) {
                makeGuess(input.charAt(0));
            } else {
                System.out.println("Please enter a single letter!");
            }
        }
        
        // Game is over - show final results
        displayGameState();
        
        if (isWordGuessed()) {
            System.out.println("\nCongratulations! You won!");
        } else {
            System.out.println("\nGame Over! The word was: " + currentWord);
        }
    }
}
