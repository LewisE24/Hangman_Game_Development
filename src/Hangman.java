import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Hangman {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Character> correctGuessedChars = new ArrayList<>();
    ArrayList<Character> wrongGuessedChars = new ArrayList<>();
    int lives = 10;
    String word = GetWord.word();
    String hiddenWord = "_".repeat(word.length());
    int wordLength = word.length();
    char guessedChar;

    public void hangman() {

//        System.out.println(word);
        do {
            System.out.println("Lives: "+lives+"/10");
            System.out.println("Correct Guesses: "+correctGuessedChars);
            System.out.println("Wrong Guesses: "+wrongGuessedChars);
            System.out.println(hiddenWord);
            System.out.print("Guess a letter: ");

            guessedChar = scanner.next().charAt(0);

            if (correctGuessedChars.contains(guessedChar) || wrongGuessedChars.contains(guessedChar)) {
                System.out.println("this character has already been guessed");
            } else {
                checkChar();
            }
        } while (lives != 0 && hiddenWord.contains("_"));
    }

    public void checkChar() {
        boolean exists = false;

        for (int i = 0; i < wordLength; i++) {
            if (word.charAt(i)==guessedChar){
                exists=true;
                hiddenWord = hiddenWord.substring(0, i) + guessedChar + hiddenWord.substring(i + 1);
            }
        }

        if(!exists){
            --lives;
            wrongGuessedChars.add(guessedChar);
        }
        else {
            correctGuessedChars.add(guessedChar);
        }
    }

    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.hangman();
    }
}
