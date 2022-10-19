package StartingClass;

import Inventory.Inventory;

public class PhysicalTune {
    Inventory inventory = new Inventory();
    final String ANSI_PURPLE = "\033[0;35m";
    final String ANSI_RESET = "\u001B[0m";
    int currentLocation = 0;
    String name;
    String className = "Physical";
    
    public int getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }
    int health = 100;
    //xp multi

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void getPlayerClass() {
        System.out.println(ANSI_PURPLE  + "Physical" + ANSI_RESET);
    }

    public String equippedItems () {
        return inventory.toString(); // return all equipped items
    }
}