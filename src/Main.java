
import player.Player;
import world.ActI;
import world.Room;

public class Main {

    private boolean newGame = true;
    private boolean gameOver = false;
    private Room currentRoom;
    private ActI actI;

    public Main() {

        Player player = new Player();
        if (newGame) {
            System.out.println("ZORK I: The Great Underground Empire");
            System.out.println(" ");
            newGame = false;
        }

        actI = new ActI();


        do {
            currentRoom = actI.getRoom();
            player.makeAction(currentRoom);
        } while (!gameOver);

    }

    public static void main (String [] args) {
        new Main();
    }
}