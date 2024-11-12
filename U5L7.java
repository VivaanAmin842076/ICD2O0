import java.util.Scanner;

public class U5L7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // Open for keyboard input

        double a = 0;
        double b = 0;

        // Input for the first number
        System.out.print("Enter the first number (a): ");
        while (true) {
            try {
                a = kb.nextDouble(); // Read the first number
                break; // Exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                kb.nextLine(); // Clear the invalid input
            }
        }

        // Input for the second number
        System.out.print("Enter the second number (b): ");
        while (true) {
            try {
                b = kb.nextDouble(); // Read the second number
                break; // Exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                kb.nextLine(); // Clear the invalid input
            }
        }

        // Division and exception handling for division by zero
        try {
            double result = a / b; // Perform the division
            System.out.println("The result of " + a + " / " + b + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        kb.close(); // Close the scanner
    }
}
