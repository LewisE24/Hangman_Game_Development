import java.io.Console;
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
            System.out.println(ConsoleStyling.RED + ConsoleStyling.bannerPrint());
            System.out.println(ConsoleStyling.RESET);

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
                try {
                    Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                } catch (InterruptedException r) {
                    r.printStackTrace();
                }
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println(ConsoleStyling.RED + ConsoleStyling.bannerPrint());
                    System.out.println(ConsoleStyling.RESET);
                    mini_game_menu();
                    break;
                case 2:
                    System.out.println("Goodbye ;)");
                    running = false;
                    break;
                default:
                    System.out.println(ConsoleStyling.RED + choice + " is not a valid option." + ConsoleStyling.RESET);
                    try {
                        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                    } catch (InterruptedException r) {
                        r.printStackTrace();
                    }
                    System.out.println(ConsoleStyling.RED + ConsoleStyling.bannerPrint());
                    System.out.println(ConsoleStyling.RESET);
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
                try {
                    Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                } catch (InterruptedException r) {
                    e.printStackTrace();
                }
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println(ConsoleStyling.RED + ConsoleStyling.bannerPrint());
                    System.out.println(ConsoleStyling.RESET);
                    Hangman game = new Hangman();
                    game.hangman();
                    break;
                case 2:
                    System.out.println("Goodbye ;)");
                    running = false;
                    break;
                default:
                    System.out.println(ConsoleStyling.RED + choice + " is not a valid option." + ConsoleStyling.RESET);
                    try {
                        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                    } catch (InterruptedException r) {
                        r.printStackTrace();
                    }
                    System.out.println(ConsoleStyling.RED + ConsoleStyling.bannerPrint());
                    System.out.println(ConsoleStyling.RESET);
                    break;
            }
        }
    }
}
