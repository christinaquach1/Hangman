
public class HangmanDisplay {
    private String[] hangmanStages;

    // Constructor - sets up the hangman ASCII art
    public HangmanDisplay() {
        initializeHangmanStages();
    }

    // Initialize all 7 stages of hangman drawing
    public void initializeHangmanStages() {
        hangmanStages = new String[7];
        
        // Stage 0: Empty gallows
        hangmanStages[0] = 
            "  +---+\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

        // Stage 1: Head
        hangmanStages[1] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

        // Stage 2: Body
        hangmanStages[2] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

        // Stage 3: Left arm
        hangmanStages[3] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|   |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

        // Stage 4: Right arm
        hangmanStages[4] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

        // Stage 5: Left leg
        hangmanStages[5] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " /    |\n" +
            "      |\n" +
            "=========";

        // Stage 6: Right leg (game over)
        hangmanStages[6] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " / \\  |\n" +
            "      |\n" +
            "=========";
    }

    // Draw hangman based on number of wrong guesses
    public void drawHangman(int wrongGuesses) {
        System.out.println(hangmanStages[wrongGuesses]);
    }

    // Display a message to the player
    public void displayMessage(String message) {
        System.out.println(">>> " + message);
    }
}
