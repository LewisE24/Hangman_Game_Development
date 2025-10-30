import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        UnsafeSSL.disableCertificateValidation();
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(ConsoleStyling.RED + ConsoleStyling.bannerPrint());
        System.out.println(ConsoleStyling.RESET);


        while(running){
            System.out.print("\nWould you like to (p)lay or (e)xit?: ");
            String continueOrExit = scanner.nextLine();

            switch(continueOrExit.toLowerCase()){
                case "e":
                case "exit":
                    running = false;
                    break;
                case "p":
                case "play":
                    System.out.println(ConsoleStyling.RED + ConsoleStyling.bannerPrint());
                    System.out.println(ConsoleStyling.RESET);
                    Game_Start(null);
                    break;
                default:
                    System.out.println(ConsoleStyling.RED + continueOrExit + ConsoleStyling.RESET + " is not a valid option. Please enter a valid option. " + ConsoleStyling.GREEN + "\n- p\n- e" + ConsoleStyling.RESET);
            }
        }
    }

    public static void Game_Start(String playerName){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The chosen word is : " + GetWord.word());
        if(playerName == null){
            System.out.print("Enter your name: ");
            playerName = scanner.nextLine();
        }
        System.out.printf("%nWelcome to Hangman, %s!%n", playerName);
        System.out.println("Still " + ConsoleStyling.YELLOW + "WIP" + ConsoleStyling.RESET + "! Press return to return to Main Menu...");
        scanner.nextLine();
        Game_Start(playerName);
    }
}
