package Inventory;

import java.util.ArrayList;
import Items.items_interface;

public class Inventory {
    public items_interface torso;
    public items_interface left_hand;
    public items_interface right_hand;
    public items_interface accessory_1;
    public items_interface accessory_2;
    ArrayList<items_interface> items = new ArrayList<>();
    
    @Override
    public String toString() {
        return "Inventory [torso=" + torso + ", left_hand=" + left_hand + ", right_hand=" + right_hand
                + ", accessory_1=" + accessory_1 + ", accessory_2=" + accessory_2 + "]";
    }

    public void showInventory () {
        for (items_interface item : items) {
            System.out.println(((items_interface) item).getName());
        }
    }

    public items_interface getTorso() {
        return torso;
    }
    public void setTorso(items_interface torso) {
        this.torso = torso;
    }
    public items_interface getLeft_hand() {
        return left_hand;
    }
    public void setLeft_hand(items_interface left_hand) {
        this.left_hand = left_hand;
    }
    public items_interface getRight_hand() {
        return right_hand;
    }
    public void setRight_hand(items_interface right_hand) {
        this.right_hand = right_hand;
    }
    public items_interface getAccessory_1() {
        return accessory_1;
    }
    public void setAccessory_1(items_interface accessory_1) {
        this.accessory_1 = accessory_1;
    }
    public items_interface getAccessory_2() {
        return accessory_2;
    }
    public void setAccessory_2(items_interface accessory_2) {
        this.accessory_2 = accessory_2;
    }

    public void addToInventory (items_interface item) {
        items.add(item);
        System.out.println("Added " + item.getName());
    }

    public void equipItem (String choice) {
        int index;
        String slot;

        // search through inventory, find index of requested item, find its slot category, and equip it.
        // return previous item to inventory array
        for (items_interface item : items) {
            if (item.getName().equalsIgnoreCase(choice)) {
                index = items.indexOf(item);
                slot = items.get(index).getSlot();

                // if slot occupied, remove and place into inventory.
                // equip item, remove from array
                if (slot.equalsIgnoreCase("pants")) {

                    if (getTorso() != null) {
                        items.add(getTorso());
                    }

                    setTorso(items.get(index));
                    System.out.println("You have equipped " + items.get(index).getName());
                    items.remove(index);
                    break;
                }
            } else {
                System.out.println("You dont have that.");
            }
        }
    }
}
