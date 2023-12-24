package world;

import items.Item;
public class ActI {
    private Room whiteHouse;
    private Item leaflet;
    private Item mailbox;
    private Item window;
    public ActI() {

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

        whiteHouse = new Room(
                "White house",
                new String[] {
                        "West of House",
                        "You are standing in an open field west of a white house, with a boarded front door.", "There is a small mailbox here."
                },
                true,
                true,
                true,
                true,
                new Item[]{ leaflet, mailbox, window });

    }

    public Room getRoom () {
        return whiteHouse;
    }
}
