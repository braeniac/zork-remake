package world;

import items.Item;
import java.util.HashMap;
import java.util.Map;
public class ActI {

    private Room whiteHouse;
    private Item leaflet;
    private Item mailbox;
    private Item window;
    private boolean initialEntry = true;

    public ActI() {

        Map<Boolean, String[]> canGoNorth   = new HashMap<>();
        Map<Boolean, String[]> canGoSouth   = new HashMap<>();
        Map<Boolean, String[]> canGoEast    = new HashMap<>();
        Map<Boolean, String[]> canGoWest    = new HashMap<>();


        leaflet = new Item("leaflet", new String[]{
                    "WELCOME TO ZORK",
                    "ZORK is a game of adventure, danger, and low cunning. In it you will explore some of the most amazing territory ever seen by mortals. No computer should be without one!"
                },
                2,
                "read",
                true);

        mailbox = new Item("mailbox", new String[]{
                    "Open the small mailbox reveals a leaflet."
                },
                0,
                "open",
                false);

        window = new Item("window", new String[]{
                    "With great effort, you open the window far enough to allow entry."
                },
                0,
                "open",
                false);

        canGoNorth.put(false, new String[]{"North of House","You are facing the north side of a white house. There is no door here, and all the windows are boarded."});
        canGoSouth.put(true, new String[]{"South of House", "You are facing the south side of a white house. There is no door here, and all the windows are boarded."});
        canGoEast.put(true, new String[]{"Behind House", "You are behind the white house. A path leads into the forest to the east. In one corner of the house there is a small window which is slightly ajar"});
        canGoWest.put(true, new String[]{"West of House", "You are standing in an open field west of a white house, with a boarded front door.", "There is a small mailbox here."});

        whiteHouse = new Room(
                "White house",
                new String[]{
                        "West of House",
                        "You are standing in an open field west of a white house, with a boarded front door.", "There is a small mailbox here."
                },
                canGoNorth,
                canGoSouth,
                canGoEast,
                canGoWest,
                new Item[]{ leaflet, mailbox, window },
                true);

        if (initialEntry) {
            for (int i=0 ; i<whiteHouse.getDescription().length; i++) {
                System.out.println(whiteHouse.getDescription()[i]);
            }
            initialEntry= false;
        }
    }

    public Room getRoom () {
        return whiteHouse;
    }

}
