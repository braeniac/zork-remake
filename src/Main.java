
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
        actI = new ActI();
        Room currentRoom = actI.getRoom();

        //game loop
        do {
            if (newGame) {
                System.out.println("ZORK I: The Great Underground Empire");
                newGame = false;
            }
            player.makeAction(currentRoom);
        } while (!gameOver);

    }

    public static void main (String [] args) {
        new Main();
    }
}