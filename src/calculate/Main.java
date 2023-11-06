package calculate;
/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner declaration for reading input from consol
        Scanner scanner = new Scanner(System.in);
        char y;
        do {
            System.out.println("Enter the first number : ");
            int a = scanner.nextInt();
            System.out.println("Enter the second number : ");
            int b = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/ : ");
            char c = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            if (c == '+') {
                calculator.addition(a, b);
            } else if (c == '-') {
                calculator.subtraction(a, b);
            } else if (c == '/') {
                calculator.division(a, b);
            } else if (c == '*') {
                calculator.multiplication(a, b);
            } else {
                System.out.println("Invalid input");
            }
            System.out.println("Would you like to do more calculation Please enter 'Y' or 'N' : ");
            y = scanner.next().charAt(0);
        }
        while (y == 'Y' || y == 'Y');
        System.out.println("Program terminated.");
        //closing the scanner object
        scanner.close();
    }
}