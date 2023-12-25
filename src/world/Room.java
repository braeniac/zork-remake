package world;

import items.Item;

import java.util.Map;

public class Room {

    private String name;
    private String[] description;
    private Map<Boolean, String[]>  canGoNorth;
    private Map<Boolean, String[]>  canGoSouth;
    private Map<Boolean, String[]>  canGoEast;
    private Map<Boolean, String[]>  canGoWest;
    private Item[] items;
    private boolean enter;

    public Room() {
        this.name = "Not a Room";
        this.description = new String[]{"This is not actually a room"};
        this.items = null;
    }

    public Room (final String name,
                 final String[] description,
                 final Map<Boolean, String[]> canGoNorth,
                 final Map<Boolean, String[]> canGoSouth,
                 final Map<Boolean, String[]> canGoEast,
                 final Map<Boolean, String[]> canGoWest,
                 final Item[] items,
                 final boolean enter) {
        this.name = name;
        this.description = description;
        this.canGoNorth = canGoNorth;
        this.canGoSouth = canGoSouth;
        this.canGoEast = canGoEast;
        this.canGoWest = canGoWest;
        this.items = items;
        this.enter = enter;
    }


    public String getName() {
        return this.name;
    }

    public String[] getDescription() {
        return description;
    }

    public Item[] getItems() {
        return this.items;
    }

    public boolean canYouEnter() {
        return this.enter;
    }

    public void grantEntry(final boolean key) {
        this.enter = key;
    }

}
