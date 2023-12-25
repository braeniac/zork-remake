package world;

import items.Item;

import java.util.HashMap;
import java.util.Map;

public class ActII {

    private Room house;
    private Item lamp;
    private Item painting;
    private Item knife;
    private Item rope;
    private Item rug;
    private boolean initialEntry = true;


    public ActII() {

        Map<Boolean, String[]> canGoNorth   = new HashMap<>();
        Map<Boolean, String[]> canGoSouth   = new HashMap<>();
        Map<Boolean, String[]> canGoEast    = new HashMap<>();
        Map<Boolean, String[]> canGoWest    = new HashMap<>();
        Map<Boolean, String[]> canGoUp      = new HashMap<>();
        Map<Boolean, String[]> canGoDown    = new HashMap<>();

        canGoNorth.put(true, new String[]{
                "Studio",
                "This appears to have been an artist's studio. The walls and floors are splattered with paints of 69 different colors. Strangely enough, nothing of value is hanging here. At the south end of the room is an open door (also covered with paint). A dark and narrow chimney leads up from a fireplace; although you might be able to get up it, it seems unlikely you could get back down.",
                "Loosely attached to a wall is a small piece of paper."
        });

        canGoSouth.put(true, new String[]{
                "East of Chasm",
                "You are on the east edge of a chasm, the bottom of which cannot be seen. A narrow passage goes north, and the path you are on continues to the east."
        });

        canGoEast.put(true, new String[]{
                "Gallery",
                "This is an art gallery. Most of the paintings have been stolen by vandals with exceptional taste. The vandals left through either the north or west exits.",
                "Fortunately, there is still one chance for you to be a vandal, for on the far wall is a painting of unparalleled beauty"
        });

        canGoWest.put(true, new String[]{
                "Living Room",
                "You are in the living room. There is a doorway to the east, a wooden door with strange gothic lettering to the west, which appears to be nailed shut, a trophy case, and a large oriental rug in the center of the room.",
                "Above the trophy case hangs an elvish sword of great antiquity.",
                "A battery-powered brass lantern is on the trophy case."
        });
        

        //items
        knife = new Item("knife",
                null,
                12,
                "attack",
                true);

        rope = new Item("rope",
                null,
                18,
                "help",
                true);

        lamp = new Item("lamp", null,
                5,
                "switch",
                true);

        painting = new Item("painting", null,
                5,
                "",
                true);

        rug = new Item("rug",
                new String[]{"With a great effort, the rug is moved to one side of the room, revealing the dusty cover of a closed trap door."},
                100,
                "move",
                false);

        //set the room
        house = new Room(
                "house",
                new String[]{
                        "Kitchen",
                        "You are in the kitchen of the white house. A table seems to have been used recently for the preparation of food. A passage leads to the west and a dark staircase can be seen leading upward. A dark chimney leads down and to the east is a small window which is open. On the table is an elongated brown sack, smelling of hot peppers.",
                        "A bottle is sitting on the table.",
                        "The glass bottle contains:",
                        " A quantity of water"
                },
                canGoNorth,
                canGoSouth,
                canGoEast,
                canGoWest,
                canGoUp,
                canGoDown,
                new Item[]{ knife, rope, lamp, painting, rug },
                false);
    }


    public Room getRoom () {
        return house;
    }

}
