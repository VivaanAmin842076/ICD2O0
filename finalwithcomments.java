/*
Vivaan Amin Student 842076
Date: 16 Jan 2025
Course: Grade 10 Comp Sci
Title: Credit River Credit
Description: A program which outputs a series of numbers based on the
information on a given file and a series of mathematical calculations
VARIABLE DICTIONARY: 
 filePath: A string that holds the path to the ledger file.
- customerCount: An integer that counts the number of customers processed.
- totalBalance: A double that holds the total balance of all customers.
- maxBalance: A double that holds the maximum balance found.
- minBalance: A double that holds the minimum balance found.
- maxAccount: A string that holds the account number with the highest balance.
- minAccount: A string that holds the account number with the lowest balance.
- finalBalance: A double that holds the calculated final balance for each customer.
*/

package Creditrivercredit; // Package declaration

import java.util.Scanner; // Importing Scanner for input handling
import java.io.File; // Importing File to read from a file

public class Creditrivercredit { // Main class definition

    // Basic function to calculate the final balance
    public static double calculateFinalBalance(double startingBalance, double purchase, double payment) {
        // Calculate final balance based on starting balance, purchase, and payment
        return (startingBalance - payment) + purchase;
    }

    public static void main(String[] args) { // Main method
        String filePath = "ledger.dat"; // Define the file path for the ledger

        // Initialize variables for customer count and balance calculations
        int customerCount = 0; // Count of customers processed
        double totalBalance = 0; // Total balance of all customers
        double maxBalance = Double.MIN_VALUE; // Initialize max balance to the smallest possible value
        double minBalance = Double.MAX_VALUE; // Initialize min balance to the largest possible value
        String maxAccount = ""; // Account number with the highest balance
        String minAccount = ""; // Account number with the lowest balance

        // File existence check and error message
        File ledgerFile = new File(filePath); // Create a File object for the ledger
        if (!ledgerFile.exists()) { // Check if the file exists
                 // Print error message if the file is not found
            System.out.println("Error: The required file '" + filePath + "' was not found.");
            System.out.println("Note: This program requires no user input. Please ensure the file is in the correct path.");
            return; // Exit the program if the file is not found 
        }
      
        // Try to read the file
        try (Scanner fileScanner = new Scanner(ledgerFile)) { // Create a Scanner to read the file
            // Reading each line (each customer's data)
            while (fileScanner.hasNextLine()) { // Loop while there are more lines in the file
                String line = fileScanner.nextLine(); // Read the next line

                try (Scanner lineScanner = new Scanner(line)) { // Create a Scanner for the current line
                    lineScanner.useDelimiter(","); // Set the delimiter to a comma

                    // Read customer data
                    String accountNumber = lineScanner.next().trim(); // Read the account number and trim whitespace
                    double startingBalance = lineScanner.nextDouble(); // Read the starting balance
                    double purchase = lineScanner.nextDouble(); // Read the purchase amount
                    double payment = lineScanner.nextDouble(); // Read the payment amount

                    // Calculate the final balance using the basic function
                    double finalBalance = calculateFinalBalance(startingBalance, purchase, payment);

                    // Update total balance and customer count
                    totalBalance += finalBalance; // Add final balance to total balance
                    customerCount++; // Increment the customer count

                    // Update max and min balances
                    if (finalBalance > maxBalance) { // Check if the final balance is greater than the current max
                        maxBalance = finalBalance; // Update max balance
                        maxAccount = accountNumber; // Update account number for max balance
                    }
                    if (finalBalance < minBalance) { // Check if the final balance is less than the current min
                        minBalance = finalBalance; // Update min balance
                        minAccount = accountNumber; // Update account number for min balance
                    }

                    // Print account details
                    System.out.printf("Account: %s | Final Balance: %.2f\n", accountNumber, finalBalance); // Print account info
                } catch (Exception e) { // Catch any exceptions that occur while processing the line
                    System.out.println("Error processing line: " + line); // Print error message for the line
                }
            }

            // Check if any customers were processed
            if (customerCount > 0) { // If at least one customer was processed
                // Calculate and display summary
                double averageBalance = totalBalance / customerCount; // Calculate average balance
                System.out.printf("\nAverage Balance: %.2f\n", averageBalance); // Print average balance
                System.out.printf("Account with highest balance: %s | Final Balance: %.2f\n", maxAccount, maxBalance); // Print max balance account
                System.out.printf("Account with lowest balance: %s | Final Balance: %.2f\n", minAccount, minBalance); // Print min balance account
          
            } else { // If no customers were processed (customerCount is 0)
                System.out.println("No valid data found in the file."); // Print message indicating no valid data was found
            } // End of the else block

        } catch (Exception e) { // Catch any exceptions that occur during file processing
            // Print error message along with the exception message for debugging
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        } // End of the catch block

    } // End of the main method
} // End of the Main class
