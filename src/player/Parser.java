package player;

import world.Room;

import java.util.Arrays;

public class Parser {

    private Action action;

    public Parser(final Action action) {
        this.action = action;
    }

    public String parseInput (final String input, final Room room) {

        String[] inputSplit = input.split("\\s+");
        int size = inputSplit.length;

        if (size == 1) {
            String verb = inputSplit[0];
            action.performAction(verb, room);
        } else if (size == 2) {
            String verb = inputSplit[0];
            String direct = inputSplit[1];
            action.performAction(verb, direct, room);
        } else if (size == 3) {
            String verb = inputSplit[0];
            String direct = inputSplit[1];
            String prep = inputSplit[2];
            action.performAction(verb, direct, prep, room);
        } else {
            String verb = inputSplit[0];
            String direct = inputSplit[1];
            String prep = inputSplit[2];
            String indirect = inputSplit[3];
            action.performAction(verb, direct, prep, indirect, room);
        }

        return input;
    }

}
