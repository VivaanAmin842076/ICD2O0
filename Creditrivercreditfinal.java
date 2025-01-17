/*
Vivaan Amin Student 842076
Date: 16 Jan 2025
Course: Grade 10 Comp Sci
Title: Credit River Credit
Description: A program which outputs a series of numbers based on the
information on a given file and a series of mathematical calculations

VARIABLE DICTIONARY:
- ledgerFilePath: A string that holds the path to the ledger file.
- totalCustomers: An integer that counts the number of customers processed.
- cumulativeBalance: A double that holds the total balance of all customers.
- highestBalance: A double that holds the maximum balance found.
- lowestBalance: A double that holds the minimum balance found.
- accountWithHighestBalance: A string that holds the account number with the highest balance.
- accountWithLowestBalance: A string that holds the account number with the lowest balance.
- computedFinalBalance: A double that holds the calculated final balance for each customer.
*/

package Creditrivercreditfinal; // Package declaration

import java.util.Scanner; // Importing Scanner for input handling
import java.io.File; // Importing File to read from a file

public class Creditrivercreditfinal { // Main class definition

    // Basic function to calculate the final balance
    public static double calculateFinalBalance(double initialBalance, double purchaseAmount, double paymentAmount) {
        // Calculate final balance based on initial balance, purchase amount, and payment amount
        return (initialBalance - paymentAmount) + purchaseAmount; // Return the calculated final balance
    }

    public static void main(String[] args) { // Main method
        String ledgerFilePath = "C:\\Users\\842076\\OneDrive - Peel District School Board\\Documents\\NetBeansProjects\\Creditrivercredit\\src//ledger.dat";
        // Define the file path for the ledger

        // Initialize variables for customer count and balance calculations
        int totalCustomers = 0; // Count of customers processed
        double cumulativeBalance = 0; // Total balance of all customers
        double highestBalance = Double.MIN_VALUE; // Initialize highest balance to the smallest possible value
        double lowestBalance = Double.MAX_VALUE; // Initialize lowest balance to the largest possible value
        String accountWithHighestBalance = ""; // Account number with the highest balance
        String accountWithLowestBalance = ""; // Account number with the lowest balance

        // Create a File object for the ledger
        File ledgerFile = new File(ledgerFilePath); // Create a File object using the specified file path

        // Attempt to read the file regardless of its existence
        try (Scanner fileScanner = new Scanner(ledgerFile)) { // Create a Scanner to read the file
            // Reading each line (each customer's data)
            while (fileScanner.hasNextLine()) { // Loop while there are more lines in the file
                String line = fileScanner.nextLine(); // Read the next line from the file

                try (Scanner lineScanner = new Scanner(line)) { // Create a Scanner for the current line
                    lineScanner.useDelimiter("\\s+"); // Set the delimiter to whitespace

                    // Read customer data
                    String accountNumber = lineScanner.next().trim(); // Read the account number and trim whitespace
                    double initialBalance = lineScanner.nextDouble(); // Read the initial balance
                    double purchaseAmount = lineScanner.nextDouble(); // Read the purchase amount
                    double paymentAmount = lineScanner.nextDouble(); // Read the payment amount

                    // Calculate the final balance using the basic function
                    double computedFinalBalance = calculateFinalBalance(initialBalance, purchaseAmount, paymentAmount); // Call the function to calculate final balance

                    // Update cumulative balance and customer count
                    cumulativeBalance += computedFinalBalance; // Add final balance to cumulative balance
                    totalCustomers++; // Increment the customer count

                    // Update highest and lowest balances
                    if (computedFinalBalance > highestBalance) { // Check if the final balance is greater than the current highest
                        highestBalance = computedFinalBalance; // Update highest balance
                        accountWithHighestBalance = accountNumber; // Update account number for highest balance
                    }
                    if (computedFinalBalance < lowestBalance) { // Check if the final balance is less than the current lowest
                        lowestBalance = computedFinalBalance; // Update lowest balance
                        accountWithLowestBalance = accountNumber; // Update account number for lowest balance
                    }

                    // Print account details
                    System.out.printf("Account: %s | Final Balance: %.2f\n", accountNumber, computedFinalBalance); // Print account info
                } catch (Exception e) { // Catch any exceptions that occur while processing the line
                    System.out.println("Error processing line: " + line); // Print error message for the line
                }
            }

            // Check if any customers were processed
            if (totalCustomers > 0) { // If at least one customer was processed
                // Calculate and display summary
                double averageBalance = cumulativeBalance / totalCustomers; // Calculate average balance
                System.out.printf("\nAverage Balance: %.2f\n", averageBalance); // Print average balance
                System.out.printf("Account with highest balance: %s | Final Balance: %.2f\n", accountWithHighestBalance, highestBalance); // Print highest balance account
                System.out.printf("Account with lowest balance: %s | Final Balance: %.2f\n", accountWithLowestBalance, lowestBalance); // Print lowest balance account
            } else { // If no customers were processed (totalCustomers is 0)
                System.out.println("No valid data found in the file."); // Print message indicating no valid data was found
            } // End of the else block

        } catch (Exception e) { // Catch any exceptions that occur during file processing
            // Print error message along with the exception message for debugging
            System.out.println("An error occurred while processing the file: " + e.getMessage()); // Print error message
        } // End of the catch block

    } // End of the main method
} // End of the Main class
