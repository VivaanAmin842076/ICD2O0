import java.util.Scanner;

class U6L2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First number
        System.out.print("Please input the first number: ");
        double num1 = scanner.nextDouble();

        // Input: Second number
        System.out.print("Please input the second number: ");
        double num2 = scanner.nextDouble();

        // Input: Operator
        System.out.print("Please input an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform calculation based on the operator
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            // Check for division by zero
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return; // Exit the program
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return; // Exit the program
        }

        // Output the result
        System.out.printf("%.1f %c %.1f = %.1f%n", num1, operator, num2, result);
    }
}
