import java.util.Scanner;

public class Task2Progress3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "y";

        do {
            System.out.print("Enter a whole number > 0: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
                continue;
            }

            int originalN = n;
            int terms = 0;
            int highestValue = n;
            String sequence = "";

       
            do {
                sequence += n + "; ";
                terms++;
                if (n > highestValue) {
                    highestValue = n;
                }
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = n * 3 + 1;
                }
            } while (n != 1);

            sequence += n + ".";

            // Output the results
            System.out.println("The Collatz sequence for n = " + originalN + " is:");
            System.out.println(sequence);
            System.out.println("Number of terms = " + (terms + 1));
            System.out.println("Highest value reached = " + highestValue);

            // Ask if the user wants to continue
            System.out.print("Do another? (y/n): ");
            response = scanner.next();
        } while (response.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}

