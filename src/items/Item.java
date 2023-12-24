package items;

public class Item {

    private String name;
    private String[] description;
    private int weight;
    private String type;
    private boolean collectable;

    public Item(
            final String name,
            final String[] description,
            final int weight,
            final String type,
            final boolean collectable) {

        this.name = name;
        this.description = description;
        this.weight = weight;
        this.type = type;
        this.collectable = collectable;
    }

    public String getName() {
        return this.name;
    }

    public void getDescription() {
        for (String s : description)
            System.out.println(s);
    }

    public int getWeight() {
        return this.weight;
    }

    public String getType() {
        return this.type;
    }

    public boolean getCollectable() {
        return collectable;
    }


}
