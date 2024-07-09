
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ++, --, #):");
        String operator = scanner.next();

        double result = 0;
        double num2; // Declare num2 here

        switch (operator) {
            case "+":
                System.out.println("Enter another number:");
                num2 = scanner.nextDouble(); // Assign value to num2
                result = num1 + num2;
                break;
            case "-":
                System.out.println("Enter another number:");
                num2 = scanner.nextDouble(); // Assign value to num2
                result = num1 - num2;
                break;
            case "*":
                System.out.println("Enter another number:");
                num2 = scanner.nextDouble(); // Assign value to num2
                result = num1 * num2;
                break;
            case "/":
                System.out.println("Enter another number:");
                num2 = scanner.nextDouble(); // Assign value to num2
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            case "++":
                result = num1 + 1;
                break;
            case "--":
                result = num1 - 1;
                break;
            case "#":
                result = (int) num1; // convert to whole number
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}