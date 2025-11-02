import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set up scanner
        Player_Choice();
    }

    public static void Game_Start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("%nWelcome to Hangman, %s!%n", name);
        System.out.println("Still " + ConsoleStyling.YELLOW + "WIP" + ConsoleStyling.RESET + "! Press return to return to Main Menu...");
        Player_Choice();
    }

    public static void Player_Choice() {
        Scanner scanner = new Scanner(System.in);
        String[] options = {"Play", "Hangman", "Exit"};

        // Print out banner
        System.out.println(ConsoleStyling.RED + ConsoleStyling.bannerPrint());
        System.out.println(ConsoleStyling.RESET);

        System.out.println("Choose an option: ");
        for (int i = 0; i < options.length; i++) {
            System.out.println("\u001B[32m" + (i + 1) + ". " + options[i] + "\u001B[0m");
        }


        System.out.print("Enter your choice: ");

        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(ConsoleStyling.RED + "Invalid choice. Exiting game");
            System.exit(1);
        }

        switch (choice) {
            case 1:
                System.out.println(ConsoleStyling.RED + ConsoleStyling.bannerPrint());
                System.out.println(ConsoleStyling.RESET);
                Game_Start();
                break;
            case 2:
                Hangman game = new Hangman();
                game.hangman();
                Game_Start();
            case 3:
                System.out.println("Goodbye ;)");
                break;
            default:
                System.out.println(ConsoleStyling.RED + choice + " is not a valid option.");
        }
    }
}
