import java.util.Scanner;

public class TextBasedGame {

    public static void main(String[] args) {
        StartGame();
    }


    public static void StartGame() {
        System.out.println(" ");
        System.out.println("Welcome to my game!");
        System.out.println("To win, you must find all the items.");
        System.out.println("Good luck!");
        System.out.println(" ");
        System.out.println("Press 0 to begin.");

        int begin;

        Scanner console = new Scanner(System.in);
        begin = console.nextInt();
        if (begin == 0) {
            Action.Menu();
        } else {
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
    }
}
