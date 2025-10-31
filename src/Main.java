import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    Game_Start();
                    break;
                default:
                    System.out.println(ConsoleStyling.RED + continueOrExit + ConsoleStyling.RESET + " is not a valid option. Please enter a valid option. " + ConsoleStyling.GREEN + "\n- p\n- e" + ConsoleStyling.RESET);
            }
        }
    }

    public static void Game_Start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("%nWelcome to Hangman, %s!%n", name);
        System.out.println("Still " + ConsoleStyling.YELLOW + "WIP" + ConsoleStyling.RESET + "! Press return to return to Main Menu...");
        scanner.nextLine();
        System.out.println(ConsoleStyling.RED + ConsoleStyling.bannerPrint());
        System.out.println(ConsoleStyling.RESET);
    }
}
