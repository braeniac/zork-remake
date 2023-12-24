package items;

public class Sword implements Item {

    private String name;
    private String description;
    private int weight;

    public Sword() {
        name = "sword";
        description="";
//        weight = ;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void perfomAction() {

    }

}
