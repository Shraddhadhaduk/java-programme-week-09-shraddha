package java_week_9;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {
    //Declare main method
    public static void main(String[] args) {
        reverseArray();

    }

    public static void reverseArray(){
        int[] a = {10,20,30,40,50};

    //print the original array using Arrays.toString() method
        System.out.println("Original array : " + Arrays.toString(a));

    //Iterate through the first half of the array and reverse its elements.
    for(int i = 0; i < a.length / 2; i++){

        //swap the elements at position i and length i-1.
        int temp = a[i];
        a[i] = a[a.length-i-1];
        a[a.length-i-1] = temp;
    }

    //print the reverse array using Array.toString() method.
        System.out.println("Reverse array : " + Arrays.toString(a));
    }

}
