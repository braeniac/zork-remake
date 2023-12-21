
import items.Sword;
import player.Player;

import java.util.Scanner;

public class Main {

    public Main() {

        //create player
        Player player = new Player();

        Sword s = new Sword();
        player.addToInventory(s);

        player.dropFromInventory("A Sword");
        player.getInventory();


    }

    public static void main (String [] args) {
        new Main();
    }
}