package Movement;

import java.util.ArrayList;

import GameMap.woods_interface;

public class Move {
    String currentLocation;
    String inputLocation;

    public String getCurrentLocation() {
        System.out.println("Which direction would you like to go?");
       // String direction = reader.readLine();
      //  pt.setCurrentLocation(buter.get(pt.getCurrentLocation()).setCurrentLocation(direction)); // looks a bit funky so needs good explantation
      //  System.out.println(pt.getCurrentLocation());
        return currentLocation;
    }
    public static void setCurrentLocation(String currentLocation) {
  
    }
    public String getInputLocation() {
        return inputLocation;
    }
    public void setInputLocation(String inputLocation) {
        this.inputLocation = inputLocation;
    }
}
