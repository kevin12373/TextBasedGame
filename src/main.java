import java.util.Scanner;

public class main {

    public static void GetCurrentRoom()
    {
        Room room = Room.ENTRANCE;
        String currentRoom = "";
        switch (room) {
            case ENTRANCE:
                currentRoom = "entrance";
                break;
            case KITCHEN:
                currentRoom = "kitchen";
                break;
            case DUNGEON:
                currentRoom = "dungeon";
                break;
            case LOUNGE:
                currentRoom = "lounge";
                break;
            case HALLWAY:
                currentRoom = "hallway";
                break;
        }
        System.out.println("You are currently in the " + currentRoom);
        System.out.println(" ");
        Action();
    }


    public static void Move() {
        int direction;
        String directionMoved = " ";

        Scanner console = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("What direction would you like to go?");
        System.out.println("1 - North");
        System.out.println("2 - East");
        System.out.println("3 - South");
        System.out.println("4 - West");

        direction = console.nextInt();

        if (direction == 1 | direction == 2 | direction == 3 | direction == 4) {
            switch (direction) {
                case 1:
                    directionMoved = "north";
                    break;
                case 2:
                    directionMoved = "east";
                    break;
                case 3:
                    directionMoved = "south";
                    break;
                case 4:
                    directionMoved = "west";
                    break;
            }
            System.out.println("You have moved " + directionMoved);
            System.out.println(" ");
            Action();
        } else {
            System.out.println("Not a valid direction.");
            Move();
        }
    }

    public static void Action() {
        int command;

        Scanner console = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("1 - Check what room you are in.");
        System.out.println("2 - Move in a direction.");
        command = console.nextInt();

        if (command == 1 | command == 2 | command == 3) {
            switch (command) {
                case 1:
                    GetCurrentRoom();
                    break;
                case 2:
                    Move();
                    break;
                case 3:
                    System.out.println("Thanks for playing!");
                    System.exit(0);
            }
        } else {
            System.out.println("Not a valid input.");
            System.out.println(" ");
            Action();
        }
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
            Action();
        } else {
            System.out.println("Thanks for playing!");
            System.exit(0); }
    }


    public static void main(String[] args) {
        StartGame();
    }
}

