import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while(running){
            System.out.println(ConsoleHome.bannerPrint());
            System.out.println();

            System.out.print("Would you like to (p)lay or (e)xit? (p/e)");
            String continueOrExit = scanner.nextLine();


            switch(continueOrExit){
                case "e":
                    running = false;
                    break;
                case "p":
                    System.out.println(ConsoleHome.bannerPrint());
                    Execution();
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        }
    }

    public static void Execution(){
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            switch(name){
                case "Flamur":
                case "flamur":
                    System.out.println("dob");
                    break;
                default:
                    System.out.printf("%nWelcome to Hangman, %s!%n", name);
                    System.out.println("Still WIP! Press return to return to Main Menu...");
            }
            scanner.nextLine();
    }
}
