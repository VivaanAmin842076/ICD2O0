import java.util.Scanner;

public class Task2progress {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
           System.out.print("Enter a whole number > 0 (or 0 to exit): ");
            int n = scanner.nextInt();
            
            if (n == 0) {
                System.out.println("Thank you for your time.");
                break;
            }

            if (n < 1) {
                System.out.println("Please enter a positive whole number.");
                continue;
            }
    
             if (n < 1) {
                System.out.println("Please enter a positive whole number.");
                continue;
            }

            int highestValue = n;
            int count = 0;
            
           while (n != 1) {
                sequence.append(n).append("; ");
                count++;
                if (n % 2 == 0) {
                    n = n / 2;
                }

                else {
                    n = 3 * n + 1;
                }
               
                if (n > highestValue) {
                    highestValue = n;
                }
            }
            sequence.append(1); // Append the last value (1)
            count++; // Count the last term (1)

            // Output the results
            System.out.println("The Collatz sequence for n = " + highestValue + " is: " + sequence);
            System.out.println("Number of terms = " + count);
            System.out.println("Highest value reached = " + highestValue);

            System.out.print("Do you want to do another? (yes/no): ");
            continueInput = scanner.next();
        }
        scanner.close();
    }
}
