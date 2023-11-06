package java_week_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_Zone1Station {
    public static void main(String[] args) {

        // Create a HashMap to store station-line mappings for Zone 1 stations.
        Map<String, String> stationLines = new HashMap<>();
        stationLines.put("Oxford Circus", "Bakerloo, Central, Victoria");
        stationLines.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City");
        stationLines.put("Paddington", "Bakerloo, Circle, District, Hammersmith & City");

    Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.print("Enter a Zone 1 station name (or type 'exit' to quit):");
        String stationName = scanner.nextLine();
        if (stationName.equalsIgnoreCase("exit")) {
            break;
        }
        String lines = stationLines.get(stationName);

        if(lines != null){
            System.out.println("The following lines pass through" + stationName + " : " + lines );
        }else {
            System.out.println("the station" + stationName + " is not in Zone 1.");
        }
    }
        System.out.println("Thank you for using this station");
        scanner.close();
}


}
