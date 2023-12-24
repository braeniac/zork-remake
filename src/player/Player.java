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
    private ArrayList<Item> droppedItems ;
    private int inventoryWeight;


    public Player() {
        //inventory
        this.inventory = new ArrayList<Item>();
        this.droppedItems = new ArrayList<Item>();
        this.inventoryWeight = 0;

        //player points
        this.moves = 0;
        this.score = 0;

        //player essentials
        this.input = new Scanner(System.in);
        parser = new Parser();
        action = new Action(inventory, droppedItems, inventoryWeight);
    }

    //player action

    public void makeAction () {
        System.out.print("> ");
        String userInput = this.input.nextLine();
        String actionType = parser.parseInput(userInput);
        action.performAction(actionType);
        this.moves++;
        System.out.println("Moves: " + this.moves + " Score: " + this.score);
    }


    public static void main (String [] args) {
        new Player();
    }
}
