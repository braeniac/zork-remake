package world;

import items.Item;

public class Room {

    private String name;
    private String[] description;
    private boolean canGoNorth;
    private boolean canGoSouth;
    private boolean canGoEast;
    private boolean canGoWest;
    private Item[] items;

    public Room() {
        this.name = "Not a Room";
        this.description = new String[]{"This is not actually a room"};
        this.canGoNorth = false;
        this.canGoSouth = false;
        this.canGoEast = false;
        this.canGoWest = false;
        this.items = null;
    }
    public Room (final String name,
                 final String[] description,
                 final boolean canGoNorth,
                 final boolean canGoSouth,
                 final boolean canGoEast,
                 final boolean canGoWest,
                 final Item[] items) {
        this.name = name;
        this.description = description;
        this.canGoNorth = canGoNorth;
        this.canGoSouth = canGoSouth;
        this.canGoEast = canGoEast;
        this.canGoWest = canGoWest;
        this.items = items;
    }

    public String getName() {
        return this.name;
    }

    public void getDescription() {
        for (String s : this.description) {
            System.out.println(s);
        }
    }

    public Item[] getItems() {
        return items;
    }

}
