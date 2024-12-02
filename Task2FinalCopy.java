//Vivaan Amin Student 842076
//Date: 2 December, 2024
//Course: Grade 10 Comp Sci
//Title: Collatz Conjecture 
//Description: A program which outputs a series of numbers based on an algorithm.
/*
Variable Dictionary:
- scanner: Scanner object for reading user input from the console.
- response: String to store the user's response for continuing or exiting the program.
- n: Integer that holds the current number input by the user for generating the Collatz sequence.
- originalN: Integer that stores the original value of n for output purposes.
- terms: Integer that counts the number of terms in the Collatz sequence.
- highestValue: Integer that keeps track of the highest value reached during the Collatz sequence.
- sequence: String that accumulates the values in the Collatz sequence for output.
*/

import java.util.Scanner;

public class Task2FinalCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        String response = "y";

        do {
            System.out.print("Enter a whole number > 0: ");
            int n = scanner.nextInt(); // Read user input for the Collatz sequence

            if (n <= 0) { // Check if the input is valid
                System.out.println("Please enter a positive integer greater than 0.");
                continue; // Skip to the next iteration if input is invalid
            }

            int originalN = n; // Store the original input number for output
            int terms = 0; // Initialize term count
            int highestValue = n; // Set the highest value to the initial input
            String sequence = ""; // Initialize the sequence string

            do {
                sequence += n + "; ";
                terms++; 
                if (n > highestValue) { // Check if current number is the highest
                    highestValue = n; // Update highest value if current is greater
                }
                if (n % 2 == 0) { // Check if the number is even
                    n /= 2; // If even, divide by 2
                } else { // If the number is odd
                    n = n * 3 + 1; // Calculate 3n + 1
                }
            } while (n != 1); // Continue until n becomes 1

            sequence += n + "."; 

            // Output the results
            System.out.println("The Collatz sequence for n = " + originalN + " is:");
            System.out.println(sequence);
            System.out.println("Number of terms = " + (terms + 1)); // Include the last term
            System.out.println("Highest value reached = " + highestValue); // Print highest value

            // Ask if the user wants to continue
            System.out.print("Do another? (y/n): ");
            response = scanner.next(); // Get user's response
        } while (response.equalsIgnoreCase("y")); // Continue if response is 'y'

        System.out.println("Goodbye!"); // Farewell message
        scanner.close(); // Close the scanner
    }
    
