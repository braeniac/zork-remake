package player;

import java.util.Arrays;

public class Parser {

    public String parseInput (final String input) {


        // input -> action type -> invoke perform action

        String[] inputSplit = input.split("\\s+");


        System.out.println(Arrays.toString(inputSplit)); //delete

        switch(inputSplit.length) {

            case 1:



            default:
                System.out.println("");
        }







        return input;
    }

}
