
// Vivaan Amin, 842076
// Date: 6, December, 2024
// Course: Grade 10 computer science
// Title: Rock, Paper, Scissors
// Description: A program which allows you to play as many games as you want of rock-paper-scissors against a computer, and outputs the result

/*
 * Variable Dictionary:
 * playerWins: An integer that counts the number of rounds the player has won.
 * computerWins: An integer that counts the number of rounds the computer has won.
 * ties: An integer that counts the number of rounds that ended in a tie.
 * numberOfGames: An integer that stores the total number of games the player wants to play.
 * playerChoice: A character that stores the player's choice (Rock, Paper, or Scissors).
 * computerChoice: A character that stores the computer's randomly generated choice (Rock, Paper, or Scissors).
 * finalOutcome: A string that stores the overall result of the game (who is the overall winner).
 */

import java.util.Scanner; // Import the Scanner class for user input

public class RPSFInal { // Define the class RPS

    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        int playerWins = 0, computerWins = 0, ties = 0; // Initialize win counters

        System.out.print("How many games would you like to play? "); // Prompt for number of games
        int numberOfGames = scanner.nextInt(); // Read the number of games
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numberOfGames; i++) { // Loop for the number of games
            System.out.print("Your choice (Rock(r), Paper(p), Scissors(s)): "); // Prompt for player's choice
            char playerChoice = scanner.nextLine().toLowerCase().charAt(0); // Read and convert choice to lowercase
            char computerChoice = "rps".charAt((int) (Math.random() * 3)); // Randomly select computer's choice

            System.out.println("Computer chose: " + computerChoice); // Display computer's choice

            if (playerChoice == computerChoice) { // Check for tie
                System.out.println("It's a tie!"); // Inform about tie
                ties++; // Increment tie counter
            } else if ((playerChoice == 'r' && computerChoice == 's') || // Check if player wins
                       (playerChoice == 'p' && computerChoice == 'r') ||
                       (playerChoice == 's' && computerChoice == 'p')) {
                System.out.println("You win this round!"); // Inform about player's win
                playerWins++; // Increment player's win counter
            } else { // If not a tie or player's win, computer wins
                System.out.println("Computer wins this round!"); // Inform about computer's win
                computerWins++; // Increment computer's win counter
            }
        }

        // Final outcome
        System.out.println("\nFinal Outcome:"); // Print final outcome header
        System.out.println("Player Wins: " + playerWins); // Display player's total wins
        System.out.println("Computer Wins: " + computerWins); // Display computer's total wins
        System.out.println("Ties: " + ties); // Display total ties

        // Determine overall winner
        String finalOutcome; // Declare final outcome variable
        if (playerWins > computerWins) { // Check if player has more wins
            finalOutcome = "You are the overall winner!"; // Set final outcome for player win
        } else if (computerWins > playerWins) { // Check if computer has more wins
            finalOutcome = "Computer is the overall winner!"; // Set final outcome for computer win
        } else { // If wins are equal
            finalOutcome = "It's an overall tie!"; // Set final outcome for tie
        }

        System.out.println(finalOutcome); // Print the final outcome
        scanner.close(); // Close the scanner
    }
}
Explanation of Comments:
Each line of code has a brief comment explaining its purpose, making it easier for someone reading the code to understand what each part does.
The comments are concise and directly related to the code, providing clarity without overwhelming detail.
Feel free to run this code in your Java environment, and let me know if you need any further assistance or modifications!




Share
New
GPT-4o
Claude-Sonnet
Scroll to bottom
