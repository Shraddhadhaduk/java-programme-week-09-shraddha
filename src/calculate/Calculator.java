package calculate;

/**
 * Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 */
public class Calculator {
    int a = 10;
    int b = 5;
    //Instance addition method

    public void addition(int a, int b){
        int result = a+b;
        System.out.println("Addition of " + a + " and " + b + " is : " + a+b );
    }
    //Instance subtraction method
    public void subtraction(int a, int b){
        int result = a-b;
        System.out.println("Subtraction of " + a + " and " + b + " is : " + (a-b));
    }
    //Instance division method
    public void division(int a, int b){
        int result = a/b;
        System.out.println("Division of " + a + " and " + b + " is : " + a/b);
    }
    //Instance multiplication method
    public void multiplication(int a, int b) {
        int result = a*b;
        System.out.println("Multiplication of " + a + " and " + b + " is : " + a*b);
    }

    public void calculateResult(int a, int b, char C){
        switch (C){
            case '+' :
                addition(a,b);
                break;
            case '-' :
                subtraction(a,b);
                break;
            case '/' :
                division(a,b);
                break;
            case '*' :
                multiplication(a,b);
                break;
        }

    }


}
