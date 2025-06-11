
import java.util.ArrayList;
import java.util.Random;

public class WordBank {
    private ArrayList<String> words;  // List of words for the game
    private Random random;            // Random number generator

    // Constructor - creates word bank and fills it with words
    public WordBank() {
        this.words = new ArrayList<>();
        this.random = new Random();
        initializeWords();
    }

    // Add all the words to our word bank
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

    // Pick a random word from our word bank
    public String getRandomWord() {
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    // Add a new word to the bank
    public void addWord(String word) {
        words.add(word.toUpperCase());
    }

    // Get how many words we have
    public int getWordCount() {
        return words.size();
    }
}
