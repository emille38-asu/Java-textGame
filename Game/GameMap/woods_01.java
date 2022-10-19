package GameMap;
import Movement.Move;
import java.util.HashMap;

import Items.items_interface;

public class woods_01 implements woods_interface {
  final int currentLocation = 1; // woods_01

  @Override
  public String description() {
    // TODO Auto-generated method stub
    System.out.println("You are further in the woods");
    return null;
  }

  @Override
  public String currentLocation() {
    System.out.println("You are in the woods_02");
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String storyEvent() {
    // TODO Auto-generated method stub
    // call story event method from story class
    return null;
  }

  @Override
  public int setCurrentLocation(String direction) {
    if (direction.equalsIgnoreCase("West")) {
      System.out.println("You backtrack west.");
      return 0; // woods_00
    }

    if (direction.equalsIgnoreCase("South")) {
      System.out.println("You trek south through the mud.");
      return 2; // woods_02 disabled for now
    } else {
      System.out.println("You cannot go in this direction");
    }
    return currentLocation; // stay in current location
  }

  @Override
  public items_interface getItem() {
    // TODO Auto-generated method stub
    return null;
  }
}