package java_week_9;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElement {
    public static void elementList() {
        //Create a list and add some colour to the list
        List<String> retrieveElement = new ArrayList<String>();
        retrieveElement.add("Blue");
        retrieveElement.add("Pink");
        retrieveElement.add("White");
        retrieveElement.add("Red");

        //print the list
        System.out.println(retrieveElement);
        //retrieve the first and last element
        String element = retrieveElement.get(0);
        System.out.println("First element : " + element);
        element = retrieveElement.get(2);
        System.out.println("Third element : " + element);
    }


   //Declaring the main method
   public static void main(String[] args) {

        elementList();
   }
   }