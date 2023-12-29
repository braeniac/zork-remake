package player;

import items.Item;
import world.Room;

import java.util.ArrayList;

public class Action {

    private ArrayList<Item> inventory ;
    private ArrayList<Item> droppedItems ;
    private int inventoryWeight;

    public Action(final ArrayList<Item> inventory,
                  final ArrayList<Item> droppedItems,
                  final int inventoryWeight) {
        this.inventory = inventory;
        this.droppedItems = droppedItems;
        this.inventoryWeight = inventoryWeight;


    }


    //1 word commands

    public void performAction(final String verb,
                              final Room room) {
        if (verb.equals("i") || verb.equals("inventory")) {
            getInventory();
        }
    }

    //2 word commands

    public void performAction(final String verb,
                              final String direct,
                              final Room room) {



    }

    public void performAction(final String verb,
                              final String direct,
                              final String prep,
                              final Room room) {
        System.out.println(verb + " " + direct + " " + prep);
    }



    public void performAction(final String verb,
                              final String direct,
                              final String prep,
                              final String indirect,
                              final Room room) {

        System.out.println(verb + " " + direct + " " + prep + " " + indirect);
    }


    //inventory
    public void getInventory() {
        System.out.println("You are carrying:");
        for (Item item : this.inventory) {
            System.out.println(" A " + item.getName().substring(0,1).toUpperCase() + item.getName().substring(1));
        }
    }

    public void addToInventory (final Item item) {
        int MAX_WEIGHT = 100;
        if (inventoryWeight <= MAX_WEIGHT) {
            this.inventory.add(item);
            this.inventoryWeight += item.getWeight();
            System.out.println("(Taken)");
        } else {
            System.out.println("You're holding too many things already!");
            System.out.println("Drop an item");
        }
    }


    public void dropFromInventory (final String name) {
        for (int i=0; i<this.inventory.size(); i++) {
            Item item = this.inventory.get(i);
            if (item.getName().equals(name)) {
                Item removed = this.inventory.remove(i);
                droppedItems.add(removed);
                System.out.println("(Dropped)");
            } else {
                System.out.println("Item does not appear to be in your inventory.");
            }
        }
    }

}
