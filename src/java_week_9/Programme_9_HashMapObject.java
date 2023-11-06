package java_week_9;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMapObject {
   //declaring a main method
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name = scanner.next();
        System.out.println("Enter an age : ");
        int age = scanner.nextInt();
        //add the key_value pair to map
        people();
        //closing the scanner object
        scanner.close();
    }

    public static void people() {

        // Create a HashMap to store String keys and Integer values
        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 25);
        people.put("Smith", 27);
        // Use a loop to add key-value pairs to the map
        for (int i = 1; i <= 1; i++) {
            System.out.println("Ages in the map : ");

            //Iterate through the value using a for each loop
            for (Integer age : people.values()) {
                System.out.println("Age : " + age);
            }
        }
    }
}