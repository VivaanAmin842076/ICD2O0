/*
Vivaan Amin Student 842076
Date: 16 Jan 2025
Course: Grade 10 Comp Sci
Title: Credit River Credit
Description: A program which outputs a series of numbers based on the
information on a given file and a series of mathematical calculations
VARIABLE DICTIONARY: 
 
*/

package Creditrivercredit;

import java.util.Scanner; // Importing Scanner for input handling
import java.io.File; // Importing File to read from a file

public class Creditrivercredit {

    // Basic function to calculate the final balance
    public static double calculateFinalBalance(double startingBalance, double purchase, double payment) {
        return (startingBalance - payment) + purchase;
    }

    public static void main(String[] args) {
        String filePath = "ledger.dat";

        int customerCount = 0;
        double totalBalance = 0;
        double maxBalance = Double.MIN_VALUE;
        double minBalance = Double.MAX_VALUE;
        String maxAccount = "";
        String minAccount = "";

        // File existence check and error message
        File ledgerFile = new File(filePath);
        if (!ledgerFile.exists()) {
            System.out.println("Error: The required file '" + filePath + "' was not found.");
            System.out.println("Note: This program requires no user input. Please ensure the file is in the correct path.");
            return; // Exit the program
        }

        try (Scanner fileScanner = new Scanner(filepath)) {
            // Reading each line (each customer's data)
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                try (Scanner lineScanner = new Scanner(line)) {
                    lineScanner.useDelimiter(",");

                    // Read customer data
                    String accountNumber = lineScanner.next().trim();
                    double startingBalance = lineScanner.nextDouble();
                    double purchase = lineScanner.nextDouble();
                    double payment = lineScanner.nextDouble();

                    // Calculate the final balance using the basic function
                    double finalBalance = calculateFinalBalance(startingBalance, purchase, payment);

                    totalBalance += finalBalance;
                    customerCount++;

                    // Update max and min balances
                    if (finalBalance > maxBalance) {
                        maxBalance = finalBalance;
                        maxAccount = accountNumber;
                    }
                    if (finalBalance < minBalance) {
                        minBalance = finalBalance;
                        minAccount = accountNumber;
                    }

                    // Print account details
                    System.out.printf("Account: %s | Final Balance: %.2f\n", accountNumber, finalBalance);
                } catch (Exception e) {
                    System.out.println("Error processing line: " + line);
                }
            }

            if (customerCount > 0) {
                // Calculate and display summary
                double averageBalance = totalBalance / customerCount;
                System.out.printf("\nAverage Balance: %.2f\n", averageBalance);
                System.out.printf("Account with highest balance: %s | Final Balance: %.2f\n", maxAccount, maxBalance);
                System.out.printf("Account with lowest balance: %s | Final Balance: %.2f\n", minAccount, minBalance);
            } else {
                System.out.println("No valid data found in the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while processing the file.");
        }
    }
}

