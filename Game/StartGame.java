import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Combat.Combat;
import GameMap.woods_00;
import GameMap.woods_01;
import GameMap.woods_02;
import GameMap.woods_interface;
import Inventory.Inventory;
import LoadMaps.LoadWoods.Load_Woods;
import Movement.Move;
import StartingClass.MentalTune;
import StartingClass.PhysicalTune;
import Story.Story;
import GUI.gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.List;
import javax.swing.*;

public class StartGame {
  public static void main(String[] args) throws IOException {
   // EventQueue.invokeLater(new Runnable()
      //  {
        //    public void run()
        //    {
                //gui.createAndShowGUI();
        //    }
       // });

    StartGame gameStart = new StartGame();
    woods_00 woods = new woods_00();

    gameStart.CreateCharacter();
    gameStart.play();
    
  }

  //Object[] arr = new Object[6];
  //woods_01[] arty = new woods_01[6];
  Object[] arty = new Object[6];

  woods_00 woor = new woods_00();
  woods_01 woot = new woods_01();

  
  String currentLocation;
  boolean quit = false;
  PhysicalTune pt = new PhysicalTune();
  MentalTune mt = new MentalTune();
  Inventory inventory = new Inventory();

    Load_Woods lw = new Load_Woods(); // load maps into game

    ArrayList<woods_interface> buter = new ArrayList<>();
    ArrayList<Integer> woodsMap1 = new ArrayList<>();
    ArrayList<Object> woodsMapa = new ArrayList<Object>();
    ArrayList<Class> woodsMapaa = new ArrayList<>();

    woods_00 youd = new woods_00();
    woods_01 youd1 = new woods_01();
    woods_02 youd2 = new woods_02();


    BufferedReader reader = new BufferedReader(
    new InputStreamReader(System.in));

    private void CreateCharacter() throws IOException {


        buter.add(youd);
        buter.add(youd1);
        buter.add(youd2);
        buter.get(0).description();



      Inventory inventory = new Inventory();
      //Woods woods = new Woods();
      //GameMap gameMap = new GameMap();
      Story story = new Story();

      // Call first dialogue of the game
      story.CharacterCreation();

      // Reading data using readLine
      String choice = reader.readLine();

      // Select class based on player input
      if (choice.equalsIgnoreCase("physical"))
      {
       // PhysicalTune pt = new PhysicalTune();
        pt.setCurrentLocation(0); // set initial location
        pt.getPlayerClass();
      }
      else {
      //  MentalTune mt = new MentalTune();
        mt.setCurrentLocation(0);
        mt.getPlayerClass();
      }
    }

    // game loop
    private void play() throws IOException {
      boolean play = true;
      while(play) {

      buter.get(pt.getCurrentLocation()).storyEvent(); // play story events as you enter the map

      // case may be better
      System.out.println("interact, look, search, inventory, quit, move");
      String choice = reader.readLine();


      if (choice.equalsIgnoreCase("options")) {
        options();
      }

      if (choice.equalsIgnoreCase("look")) {
        look();
      }

      if (choice.equalsIgnoreCase("move")) {
        moveCharacter();
      }

      if (choice.equalsIgnoreCase("inventory")) {
        inventory();
      }

      if (choice.equalsIgnoreCase("search")) {
        search();
      }

      if (choice.equalsIgnoreCase("quit")) {
        play = false;
      }


     // Combat.combat();
      //show available options
      //look around
      //interact
      //inventory
      //quit  with break?
      //save
    }
  }

  public void moveCharacter () throws IOException {
         // to its own method
        // calls the setLocation method of the player, and based upon you current location which is tied to a map
        // calls the correct method from the map and passes in your directional choice as a string
        // then returns the current integer to set a new player location if successful
        // debug 
        System.out.println("Which direction would you like to go?");
        String direction = reader.readLine();
        pt.setCurrentLocation(buter.get(pt.getCurrentLocation()).setCurrentLocation(direction)); // looks a bit funky so needs good explantation
        System.out.println(pt.getCurrentLocation());
  }

  public void look () {
       buter.get(pt.getCurrentLocation()).description();
  }

  public void options () {
    System.out.println("interact, look, inventory, search, quit, move");
  }

  public void inventory () throws IOException {
    // needs while loop
    System.out.println("use, equip, unequip, show inventory, look at, return");
    System.out.println(pt.equippedItems()); // show all equipped items at top of loop
    String choice = reader.readLine();

    if (choice.equalsIgnoreCase("show inventory")) {
      inventory.showInventory();
    }

    if (choice.equalsIgnoreCase("use")) {
      // TODO
    }

    if (choice.equalsIgnoreCase("equip")) {
      inventory.showInventory();
      System.out.println("Which item would you like to equip?");
      String equip = reader.readLine();
      inventory.equipItem(equip);
    }

    if (choice.equalsIgnoreCase("unequip")) {
      // TODO
    }

    if (choice.equalsIgnoreCase("look at")) {
      // TODO

    }

    if (choice.equalsIgnoreCase("return")) {
      // TODO
    }
  }

  public void search () {
    inventory.addToInventory(buter.get(pt.getCurrentLocation()).getItem());
  }
}