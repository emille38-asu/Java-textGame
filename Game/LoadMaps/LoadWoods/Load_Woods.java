package LoadMaps.LoadWoods;

import java.util.ArrayList;

import GameMap.woods_00;

public class Load_Woods {

    static ArrayList<woods_00> woods = new ArrayList<>();

    public void loadMap () {
       woods_00 woods_01 = new woods_00();

      // Woods.add(woods_01);
    }

    public static ArrayList<woods_00> getMap () {
        return woods;
    }

}
