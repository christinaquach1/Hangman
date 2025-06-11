
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class HangmanGame {
    private WordBank wordBank;
    private HangmanDisplay display;
    private String currentWord;
    private ArrayList<Character> guessedLetters;
    private ArrayList<Character> correctGuesses;
    private int wrongGuesses;
    private final int MAX_WRONG_GUESSES = 6;
    private Scanner scanner;

    // Constructor
    public HangmanGame() {
        this.wordBank = new WordBank();
        this.display = new HangmanDisplay();
        this.guessedLetters = new ArrayList<>();
        this.correctGuesses = new ArrayList<>();
        this.wrongGuesses = 0;
        this.scanner = new Scanner(System.in);
        this.currentWord = wordBank.getRandomWord().toLowerCase();
    }

    // Method with parameters and return value
    public boolean isGameOver() {
        return wrongGuesses >= MAX_WRONG_GUESSES || isWordGuessed();
    }

    // Method with return value
    public boolean isWordGuessed() {
        for (char letter : currentWord.toCharArray()) {
            if (!correctGuesses.contains(letter)) {
                return false;
            }
        }
        return true;
    }

    // Method with parameters
    public void makeGuess(char guess) {
        guess = Character.toLowerCase(guess);
        
        if (guessedLetters.contains(guess)) {
            System.out.println("You already guessed that letter!");
            return;
        }
        
        guessedLetters.add(guess);
        
        if (currentWord.contains(String.valueOf(guess))) {
            correctGuesses.add(guess);
            System.out.println("Good guess!");
        } else {
            wrongGuesses++;
            System.out.println("Wrong guess!");
        }
    }

    // Method to display current game state
    public void displayGameState() {
        display.drawHangman(wrongGuesses);
        System.out.println("\nWord: " + getDisplayWord());
        System.out.println("Guessed letters: " + guessedLetters);
        System.out.println("Wrong guesses: " + wrongGuesses + "/" + MAX_WRONG_GUESSES);
    }

    // Method with return value
    public String getDisplayWord() {
        StringBuilder displayWord = new StringBuilder();
        for (char letter : currentWord.toCharArray()) {
            if (correctGuesses.contains(letter)) {
                displayWord.append(letter).append(" ");
            } else {
                displayWord.append("_ ");
            }
        }
        return displayWord.toString().trim();
    }

    // Main game loop method
    public void playGame() {
        System.out.println("Welcome to Hangman!");
        System.out.println("Guess the word letter by letter.");
        
        // Main game loop
        while (!isGameOver()) {
            displayGameState();
            System.out.print("\nEnter your guess: ");
            String input = scanner.nextLine();
            
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                makeGuess(input.charAt(0));
            } else {
                System.out.println("Please enter a single letter!");
            }
        }
        
        // Final game state
        displayGameState();
        
        if (isWordGuessed()) {
            System.out.println("\nCongratulations! You won!");
        } else {
            System.out.println("\nGame Over! The word was: " + currentWord);
        }
    }
}
