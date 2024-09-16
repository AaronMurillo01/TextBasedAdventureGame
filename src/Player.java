// src/Player.java
import java.util.ArrayList;

public class Player {
    private String name;
    private int health;
    private ArrayList<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;  // Default health
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (health < 0) health = 0;
    }

    public void heal(int amount) {
        this.health += amount;
        if (health > 100) health = 100;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public boolean hasItem(String item) {
        return inventory.contains(item);
    }

    public void showInventory() {
        System.out.println("Inventory: " + (inventory.isEmpty() ? "Empty" : inventory));
    }

    @Override
    public String toString() {
        return "Player: " + name + ", Health: " + health;
    }
}

