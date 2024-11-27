import java.math.BigInteger;
import java.util.Scanner;

public class Task2Progress2 {
    public static void main(String[] args) {
        // Variable Dictionary
        // n: The current number in the Collatz sequence (BigInteger)
        // highestValue: The highest value reached during the sequence (BigInteger)
        // count: The number of terms in the sequence
        // sequence: A string that holds the Collatz sequence
        // originalN: The original input number for output purposes (BigInteger)
        // continueInput: A string to determine if the user wants to continue

        Scanner scanner = new Scanner(System.in);
        char resp;

        do {
            BigInteger n;

            // Input validation loop
            while (true) {
                System.out.print("Enter a whole number > 0 (or 0 to exit): ");
                if (scanner.hasNextBigInteger()) {
                    n = scanner.nextBigInteger();
                    if (n.equals(BigInteger.ZERO)) {
                        System.out.println("Thank you for your time.");
                        scanner.close(); // Close the scanner before exiting
                        return; // Exit the program
                    }
                    if (n.compareTo(BigInteger.ZERO) > 0) {
                        break; // Valid positive number
                    } else {
                        System.out.println("Please enter a positive whole number.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a whole number.");
                    scanner.next(); // Clear the invalid input
                }
            }

            BigInteger highestValue = n;
            int count = 0;
            String sequence = ""; 
            BigInteger originalN = n;

            while (!n.equals(BigInteger.ONE)) {
                sequence += n + "; ";
                
                count++;
                if (n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                    n = n.divide(BigInteger.TWO);
                } else {
                    n = n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
                }

                if (n.compareTo(highestValue) > 0) {
                    highestValue = n;
                }
            }
            sequence += 1; 
            if (sequence.length() > 0) {
                sequence = sequence.trim();
                if (sequence.endsWith(";")) {
                    sequence = sequence.substring(0, sequence.length() - 2);
                }
            }

            System.out.println("The Collatz sequence for n = " + originalN + " is: " + sequence);
            System.out.println("Number of terms = " + count);
            System.out.println("Highest value reached = " + highestValue);
            System.out.print("Do you want to do another? (y/n): ");
            resp = scanner.next().toLowerCase().charAt(0);
         
        } while (resp == 'y');

        scanner.close(); // Close the scanner
    }
}
