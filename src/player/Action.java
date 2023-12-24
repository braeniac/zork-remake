package player;

import items.Item;
import items.Sword;

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

    public void performAction(final String actionType) {

        Sword s = new Sword();
        inventory.add(s);

       if (actionType.equals("i")) {
           getInventory();
       }



    }

    //-------------------------------------------------------------------------- ACTIONS


    //movement commands



    //item commands


















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
