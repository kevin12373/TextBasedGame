import java.util.Scanner;

public class Action {

    private static Room room = Room.ENTRANCE;

    public static void Menu() {
        int command;

        Scanner console = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("What would you like to do?");
        System.out.println("1 - Check what room you are in.");
        System.out.println("2 - Move in a direction.");
        System.out.println("3 - Quit.");
        command = console.nextInt();

        if (command == 1 | command == 2 | command == 3) {
            switch (command) {
                case 1 -> System.out.println("You are currently in the " + getRoom());
                case 2 -> {
                    System.out.println(" ");
                    System.out.println("What direction would you like to go?");
                    System.out.println("1 - North");
                    System.out.println("2 - East");
                    System.out.println("3 - South");
                    System.out.println("4 - West");
                    ReadKey();
                }
                case 3 -> {
                    System.out.println("Thanks for playing!");
                    System.exit(0);
                }
            }
            Menu();
            System.out.println(" ");

        } else {
            System.out.println("Not a valid input.");
            System.out.println(" ");
        }
    }

    public static void Move(int direction) {

        String directionMoved;
        if (direction == 1) {
            directionMoved = "north.";
            switch (room) {
                case ENTRANCE -> room = Room.HALLWAY;
                case HALLWAY -> room = Room.KITCHEN;
                default -> {
                    System.out.println("There is no room to the " + directionMoved);
                    System.out.println(" ");
                    Menu();
                }
            }
            System.out.println("You have moved " + directionMoved);
            System.out.println("You are now in the " + room);
            System.out.println(" ");

        } else if (direction == 2) {
            directionMoved = "east.";
            switch (room) {
                case LOUNGE -> room = Room.HALLWAY;
                case HALLWAY -> room = Room.DUNGEON;
                default -> {
                    System.out.println("There is no room to the " + directionMoved);
                    System.out.println(" ");
                    Menu();
                }
            }
            System.out.println("You have moved " + directionMoved);
            System.out.println("You are now in the " + room);
            System.out.println(" ");

        } else if (direction == 3){
            directionMoved = "south.";
            switch (room) {
                case KITCHEN -> room = Room.HALLWAY;
                case HALLWAY -> room = Room.ENTRANCE;
                default -> {
                    System.out.println("There is no room to the " + directionMoved);
                    System.out.println(" ");
                    Menu();
                }
            }
            System.out.println("You have moved " + directionMoved);
            System.out.println("You are now in the " + room);
            System.out.println(" ");

        } else if (direction == 4) {
            directionMoved = "west.";
            switch (room) {
                case DUNGEON -> room = Room.HALLWAY;
                case HALLWAY -> room = Room.LOUNGE;
                default -> {
                    System.out.println("There is no room to the " + directionMoved);
                    System.out.println(" ");
                    Menu();
                }
            }
            System.out.println("You have moved " + directionMoved);
            System.out.println("You are now in the " + room);
            System.out.println(" ");
        } else {
            System.out.println("Not a valid direction.");
            Move(direction);
        }
    }


    public static void ReadKey() {
        int direction;

        direction = new Scanner(System.in).nextInt();
        Move(direction);
    }


    public static Room getRoom() {
        return Action.room;
    }
}
