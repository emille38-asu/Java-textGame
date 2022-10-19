package GameMap;

import Movement.Move;

import java.util.ArrayList;
import java.util.HashMap;

import Items.items_interface;
import Items.Clothing.jeans;

public class woods_02 implements woods_interface {
  final int currentLocation = 0; // woods_00
  jeans jeans = new jeans();
  ArrayList<items_interface> items = new ArrayList<>();
  boolean hasPlayed = false;

  @Override
  public String description() {
    // TODO Auto-generated method stub
    System.out.println("The woods are getting thicker.  A light fog has descended.");
    possibleDirections.add("ko");
    return null;
  }

  @Override
  public String currentLocation() {
    System.out.println("You are in the woods");
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String storyEvent() {
    // boolean flag to show completion

    if (!hasPlayed) {
      System.out.println("Shuffling in the underbrush.  You not alone.");

      hasPlayed = true;
    }
    return null;
  }

  /*
   * Moves the player based upon adjacent map and it's corresponding integer
   */
  @Override
  public int setCurrentLocation(String direction) {
    if (direction.equalsIgnoreCase("East")) {
      System.out.println("You travel east.");
      return 3; // woods_03
    }

    if (direction.equalsIgnoreCase("North")) {
      System.out.println("You return north");
      return 1; // woods_03
    } else {
      System.out.println("The woods are too thick in this direction.");
    }
    return currentLocation; // stay in current location
  }

  @Override
  // TODO fix
  public items_interface getItem() {
    if (items.size() > 0) {
      System.out.println("A pair jeans.");
      items_interface newItem = items.get(0);
      items.remove(0);
      return newItem;
    } else {
      System.out.println("Nothing to be found here.");
    }
    return jeans;
  }
}