
package creditrivercredit.java;

​​​​import java.util.Scanner; // Importing Scanner for input handling
import java.io.File; // Importing File to read from a file

public class CreditrivercreditJava {

    // Function to calculate the month's balance for a given customer
    public static double calculateBalance(double currentBalance, double purchase, double payment) {
        return (currentBalance - payment) + purchase; // Formula to calculate the month's balance
    }

    public static void main(String[] args) {

        String filePath = "C:/path/to/your/ledger.dat";

     
        int customerCount = 0;
        double totalBalance = 0;
        double maxBalance = Double.MIN_VALUE;
        double minBalance = Double.MAX_VALUE;
        String maxAccount = "";
        String minAccount = "";

        // Open the file and start processing
        Scanner fileScanner = new Scanner(new File(filePath));

        // Reading each line (each customer's data)
       while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

       
            try ( // Create a scanner for the current line and use comma (',') as the delimiter
                    Scanner lineScanner = new Scanner(line)) {
                lineScanner.useDelimiter(",");

           // Read customer data from the line
            String accountNumber = lineScanner.next().trim(); // Account number
           double startingBalance = lineScanner.nextDouble(); // Starting balance
           double purchase = lineScanner.nextDouble(); // Most recent purchase
           double payment = lineScanner.nextDouble(); // Most recent payment

            double finalBalance = calculateBalance(startingBalance, purchase, payment);

       
            totalBalance += finalBalance;
           customerCount++;

        
            if (finalBalance > maxBalance) {
               maxBalance = finalBalance;
                maxAccount = accountNumber;
           }
            if (finalBalance < minBalance) {
                minBalance = finalBalance;
                minAccount = accountNumber;
            }

     
            System.out.printf("Account: %s | Final Balance: %.2f\n", accountNumber, finalBalance);

            // Close the line scanner
            lineScanner.close();
        }


        if (customerCount > 0) {
            double averageBalance = totalBalance / customerCount;
            System.out.printf("\nAverage Balance: %.2f\n", averageBalance);
            System.out.printf("Account with highest balance: %s | Final Balance: %.2f\n", maxAccount, maxBalance);
            System.out.printf("Account with lowest balance: %s | Final Balance: %.2f\n", minAccount, minBalance);
        } else {
            System.out.println("No valid data found in the file.");
        }


       fileScanner.close();
   }
}
