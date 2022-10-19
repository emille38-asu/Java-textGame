package StartingClass;

public class MentalTune {
    final String ANSI_BLUE = "\033[0;34m";
    final String ANSI_RESET = "\u001B[0m";
    int currentLocation;
    String name;
    String className = "Physical";
    int health = 50;
    //xp multi

    public String getName() {
        return name;
    }
    public int getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
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
        System.out.println(ANSI_BLUE  + "Mental" + ANSI_RESET);
    }
}