package items;

public class Leaflet implements Item{

    private String name;
    private String description;
    private int weight;

    public Leaflet() {
        name = "A Leaflet";
        description= "";
        weight=2;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void perfomAction() {

    }

}
