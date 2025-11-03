public class ConsoleStyling {
    public static final String RESET = "\033[0m";
    public static final String BLACK = "\033[30m";
    public static final String RED = "\033[1;31m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";
    public static final String BLUE = "\033[34m";
    public static final String MAGENTA = "\033[35m";
    public static final String CYAN = "\033[36m";
    public static final String WHITE = "\033[37m";

    public static void bannerPrint(){

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println(RED);
        System.out.println("  _____      ____                           ");
        System.out.println(" |_   _|    / ___| __ _ _ __ ___   ___  ___ ");
        System.out.println("   | |_____| |  _ / _` | '_ ` _ \\ / _ \\/ __|");
        System.out.println("   | |_____| |_| | (_| | | | | | |  __/\\__ \\");
        System.out.println("   |_|      \\____|\\__,_|_| |_| |_|\\___||___/");
        System.out.println(RESET);
    }

}
