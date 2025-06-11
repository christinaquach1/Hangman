
import java.util.ArrayList;
import java.util.Random;

public class WordBank {
    private ArrayList<String> words;
    private Random random;

    // Constructor
    public WordBank() {
        this.words = new ArrayList<>();
        this.random = new Random();
        initializeWords();
    }

    // Method to initialize word list
    public void initializeWords() {
        words.add("JAVA");
        words.add("PROGRAMMING");
        words.add("COMPUTER");
        words.add("HANGMAN");
        words.add("REPLIT");
        words.add("CODING");
        words.add("ALGORITHM");
        words.add("VARIABLE");
        words.add("FUNCTION");
        words.add("ARRAYLIST");
        words.add("CONSTRUCTOR");
        words.add("METHOD");
        words.add("CLASS");
        words.add("OBJECT");
        words.add("INHERITANCE");
    }

    // Method with return value
    public String getRandomWord() {
        if (words.isEmpty()) {
            return "JAVA"; // fallback word
        }
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    // Method with parameters and return value
    public boolean addWord(String word) {
        if (word != null && !word.trim().isEmpty()) {
            words.add(word.toUpperCase().trim());
            return true;
        }
        return false;
    }

    // Method with return value
    public int getWordCount() {
        return words.size();
    }
}
