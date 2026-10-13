import java.util.Scanner;
import java.util.InputMismatchException;

// A console calculator that performs basic arithmetic operations.
public class SimpleCalculator {
    public static void main(String[] args) {
        // Scanner reads input entered by the user.
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double first = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter the second number: ");
            double second = sc.nextDouble();

            double result;

            // Choose the calculation based on the operator.
            switch (operator) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    // Prevent division by zero.
                    if (second == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    result = first / second;
                    break;
                default:
                    System.out.println("Invalid operator. Use +, -, * or /.");
                    return;
            }

            System.out.printf("Result: %.2f%n", result);
        } catch (InputMismatchException e) {
            // This runs when the user enters text instead of a number.
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (ArithmeticException e) {
            // Show a clear message for arithmetic errors.
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
