
public class HangmanDisplay {
    private String[] hangmanStages;

    // Constructor
    public HangmanDisplay() {
        initializeHangmanStages();
    }

    // Method to initialize ASCII art stages
    public void initializeHangmanStages() {
        hangmanStages = new String[7];
        
        hangmanStages[0] = 
            "  +---+\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

        hangmanStages[1] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

        hangmanStages[2] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

        hangmanStages[3] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|   |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

        hangmanStages[4] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

        hangmanStages[5] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " /    |\n" +
            "      |\n" +
            "=========";

        hangmanStages[6] = 
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " / \\  |\n" +
            "      |\n" +
            "=========";
    }

    // Method with parameters
    public void drawHangman(int wrongGuesses) {
        if (wrongGuesses >= 0 && wrongGuesses < hangmanStages.length) {
            System.out.println(hangmanStages[wrongGuesses]);
        }
    }

    // Method with parameters
    public void displayMessage(String message) {
        System.out.println(">>> " + message);
    }

    // Method with return value
    public String getGameTitle() {
        return 
            "██╗  ██╗ █████╗ ███╗   ██╗ ██████╗ ███╗   ███╗ █████╗ ███╗   ██╗\n" +
            "██║  ██║██╔══██╗████╗  ██║██╔════╝ ████╗ ████║██╔══██╗████╗  ██║\n" +
            "███████║███████║██╔██╗ ██║██║  ███╗██╔████╔██║███████║██╔██╗ ██║\n" +
            "██╔══██║██╔══██║██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══██║██║╚██╗██║\n" +
            "██║  ██║██║  ██║██║ ╚████║╚██████╔╝██║ ╚═╝ ██║██║  ██║██║ ╚████║\n" +
            "╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝";
    }
}
