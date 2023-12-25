package player;

import items.Item;
import world.Room;

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
        action = new Action(inventory, droppedItems, inventoryWeight);
        parser = new Parser(action);
    }

    //player action

    public void makeAction (final Room room) {
        System.out.print("> ");
        String userInput = this.input.nextLine();
        String performAction = parser.parseInput(userInput, room);
        this.moves++;
        System.out.println("\nMoves: " + this.moves + " Score: " + this.score + "\n");
    }


    public static void main (String [] args) {
        new Player();
    }
}
