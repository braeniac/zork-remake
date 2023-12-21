package player;

import items.Item;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Player {

    private Scanner input;
    private Parser parser;
    private Action action;


    private int moves;
    private int score;

    private ArrayList<Item> inventory ;
    private int inventoryWeight;
    private int inventorySize;


    public Player() {
        //player essentials
        this.input = new Scanner(System.in);
        parser = new Parser();
        //inventory
        this.inventory = new ArrayList<Item>();
        this.inventoryWeight = 0;
        //player points
        this.moves = 0;
        this.score = 0;
    }

    //player action

    public String makeAction () {
        System.out.print("> ");
        String output = this.input.nextLine();
        //do something with the output
        this.moves++;
        return output;
    }


    //inventory
    public void getInventory() {
        System.out.println("You are carrying:");
        for (Item item : this.inventory) {
            System.out.println(" " + item.getName());
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
        this.moves++;
    }

    public void dropFromInventory (final String name) {
        for (int i=0; i<this.inventory.size(); i++) {
            Item item = this.inventory.get(i);
            if (item.getName().equals(name)) {
                Item removed = this.inventory.remove(i);
                System.out.println("(Dropped)");
            } else {
                System.out.println("Item does not appear to be in your inventory.");
            }
        }
        this.moves++;
    }



    public int getMoves() {
        return moves;
    }

    public int getScore() {
        return score;
    }

    public static void main (String [] args) {
        new Player();
    }
}
