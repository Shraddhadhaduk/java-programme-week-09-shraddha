package java_week_9;

import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_IterateArrayList {
    //creating and initializing the Arraylist
    //declaring object of integer
    public static void element(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Iterating using for loop
        for (int i = 0; i < numbers.size(); i++){
            //printing and display the elements in Arraylist
            System.out.print(numbers.get(i) + " ");
        }
    }

    //Declaring main method
    public static void main(String[] args) {

        element();
    }

}
