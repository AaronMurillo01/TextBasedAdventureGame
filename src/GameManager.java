// src/GameManager.java
import java.util.Scanner;

public class GameManager {
    private Player player;
    private Location currentLocation;

    public GameManager() {
        player = new Player("Unknown");
        currentLocation = null;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        // Set player name
        System.out.println("Welcome, adventurer! What's your name?");
        String playerName = scanner.nextLine();
        player = new Player(playerName);
        System.out.println("Hello, " + player.getName() + "! Your journey begins.");

        // Create locations
        Location forest = new Location("Forest", "You are in a dark forest. Trees surround you on all sides.");
        Location cave = new Location("Cave", "The cave is cold and damp. You can hear water dripping.");
        Location village = new Location("Village", "You arrive at a peaceful village with people going about their day.");

        // Start adventure
        currentLocation = forest;
        while (player.getHealth() > 0) {
            System.out.println("\nYou are at: " + currentLocation.getName());
            currentLocation.describe();

            System.out.println("What would you like to do? (explore, inventory, move)");
            String action = scanner.nextLine().toLowerCase();

            switch (action) {
                case "explore":
                    exploreLocation();
                    break;
                case "inventory":
                    player.showInventory();
                    break;
                case "move":
                    currentLocation = chooseLocation(scanner, forest, cave, village);
                    break;
                default:
                    System.out.println("Invalid action.");
            }
        }

        System.out.println("Game over! You have fallen.");
    }

    private void exploreLocation() {
        System.out.println("You explore the area and find something useful!");
        player.addItem("Health Potion");
        player.heal(20);
        System.out.println("You gained 20 health. Current health: " + player.getHealth());
    }

    private Location chooseLocation(Scanner scanner, Location forest, Location cave, Location village) {
        System.out.println("Where would you like to go? (forest, cave, village)");
        String location = scanner.nextLine().toLowerCase();
        switch (location) {
            case "forest":
                return forest;
            case "cave":
                return cave;
            case "village":
                return village;
            default:
                System.out.println("Unknown location. Staying at the current location.");
                return currentLocation;
        }
    }
}
