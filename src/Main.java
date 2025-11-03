import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set up scanner
        Player_Choice();
    }

    public static void Player_Choice() {
        Scanner scanner = new Scanner(System.in);
        String[] options = {"MiniGames", "Exit"};
        boolean running = true;

        while(running) {
            // Print out banner
            ConsoleStyling.bannerPrint();

            System.out.println("--Main Menu--");
            for (int i = 0; i < options.length; i++) {
                System.out.println("\u001B[32m" + (i + 1) + ". " + options[i] + "\u001B[0m");
            }
            System.out.print("\nEnter your choice: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(ConsoleStyling.RED + "Invalid choice. Make sure to enter a number.");
                scanner.nextLine();
                Utils.sleep(2000);
                continue;
            }

            switch (choice) {
                case 1:
                    ConsoleStyling.bannerPrint();
                    mini_game_menu();
                    break;
                case 2:
                    System.out.println("Goodbye ;)");
                    running = false;
                    break;
                default:
                    System.out.println(ConsoleStyling.RED + choice + " is not a valid option." + ConsoleStyling.RESET);
                    Utils.sleep(2000);
                    ConsoleStyling.bannerPrint();
                    break;
            }
        }
    }


    public static void mini_game_menu(){
        Scanner scanner = new Scanner(System.in);
        String[] mini_games = {"Hangman", "Return Main Menu"};
        boolean running = true;

        while(running) {
            System.out.println("--MiniGames--");
            for (int i = 0; i < mini_games.length; i++) {
                System.out.println("\u001B[32m" + (i + 1) + ". " + mini_games[i] + "\u001B[0m");
            }
            System.out.print("\nEnter your choice: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(ConsoleStyling.RED + "Invalid choice. Make sure to enter a number.");
                scanner.nextLine();
                Utils.sleep(2000);
                ConsoleStyling.bannerPrint();
                continue;
            }

            switch (choice) {
                case 1:
                    ConsoleStyling.bannerPrint();
                    Hangman game = new Hangman();
                    game.hangman();
                    break;
                case 2:
                    System.out.println("Goodbye ;)");
                    running = false;
                    break;
                default:
                    System.out.println(ConsoleStyling.RED + choice + " is not a valid option." + ConsoleStyling.RESET);
                    Utils.sleep(2000);
                    ConsoleStyling.bannerPrint();
                    break;
            }
        }
    }
}
