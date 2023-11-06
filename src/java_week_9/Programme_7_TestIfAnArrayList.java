package java_week_9;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_TestIfAnArrayList {

    public static void emptyList(){
        ArrayList<String> m1 = new ArrayList<String>();
        m1.add("Blue");
        m1.add("Gray");
        m1.add("Purple");
        m1.add("Black");
        System.out.println("Original array list : " + m1);
        System.out.println("Checking the above array list is empty or not! " + m1.isEmpty());
        m1.removeAll(m1);
        System.out.println("Array list after remove all elements " + m1);
        System.out.println("Checking the above array list is empty or not! " + m1.isEmpty());
    }

    public static void main(String[] args) {
        emptyList();
    }

}
