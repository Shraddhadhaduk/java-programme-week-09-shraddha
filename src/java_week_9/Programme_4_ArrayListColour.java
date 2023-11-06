package java_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ArrayListColour {

    String[] name = new String[4];

    public static void colour(){
        ArrayList<String> colourList = new ArrayList();
        colourList.add("Blue");
        colourList.add("Pink");
        colourList.add("BLack");
        colourList.add("White");

        for (String colour : colourList){
            System.out.print(colour + " ");
        }

    }

    public static void main(String[] args) {

        colour();
    }


}
