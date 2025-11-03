import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Hangman {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Character> correctGuessedChars = new ArrayList<>();
    ArrayList<Character> wrongGuessedChars = new ArrayList<>();
    int lives = 10;
    String word = GetWord.word().toUpperCase();
    String hiddenWord = "_".repeat(word.length());
    char guessedChar;

    public void hangman() {

        do {
            System.out.println(lives+ConsoleStyling.RED+" ♥"+ ConsoleStyling.RESET);
            System.out.println(ConsoleStyling.GREEN+"Correct Guesses: "+correctGuessedChars+ConsoleStyling.RESET);
            System.out.println(ConsoleStyling.RED+"Wrong Guesses: "+wrongGuessedChars+ConsoleStyling.RESET);
            System.out.println(hiddenWord);
            System.out.print("Guess a letter: ");

            guessedChar = scanner.next().toUpperCase().charAt(0);

            if (correctGuessedChars.contains(guessedChar) || wrongGuessedChars.contains(guessedChar)) {
                System.out.println(ConsoleStyling.YELLOW+"This character has already been guessed"+ConsoleStyling.RESET);
            } else {
                checkChar();
            }
        } while (lives != 0 && hiddenWord.contains("_"));

        if(hiddenWord.contains("_")){
            System.out.println("Better luck next time. The hidden word was: "+word);
        }
        else {
            System.out.println("Smashed it! The hidden word was: "+word);
        }
    }

    public void checkChar() {
        boolean exists = false;

        if(!Character.isAlphabetic(guessedChar)){
            System.out.println(ConsoleStyling.RED+"Only alphabetic characters allowed!"+ConsoleStyling.RESET);
            return;
        }

        for (int i = 0; i < word.length(); i++) {
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
