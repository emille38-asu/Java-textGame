package GameMap;

import java.util.ArrayList;

import Items.items_interface;

public interface woods_interface {
    ArrayList<String> possibleDirections = new ArrayList<>();
    ArrayList<String> possibleNpcs = new ArrayList<>();
    ArrayList<String> items = new ArrayList<>();


    String description();
    String currentLocation();
    String storyEvent();
    items_interface getItem();
    int setCurrentLocation(String location);
}
