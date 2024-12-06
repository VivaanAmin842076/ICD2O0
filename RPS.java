// Vivaan Amin, 842076
// Date: 6, Demeber, 2024
// Course: Grade 10 computer science
// Title: Rock, Paper, Scissors
// Description: A program which allows you to play as many games as you want of rock apper scissors against a computer, and outputs the result
 
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


import java.util.Scanner;

public class RPS {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerWins = 0, computerWins = 0, ties = 0;

        System.out.print("How many games would you like to play? ");
        int numberOfGames = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfGames; i++) {
            System.out.print("Your choice (Rock(r), Paper(p), Scissors(s)): ");
            char playerChoice = scanner.nextLine().toLowerCase().charAt(0);
            char computerChoice = "rps".charAt((int) (Math.random() * 3));

            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((playerChoice == 'r' && computerChoice == 's') ||
                       (playerChoice == 'p' && computerChoice == 'r') ||
                       (playerChoice == 's' && computerChoice == 'p')) {
                System.out.println("You win this round!");
                playerWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }
        }

        // Final outcome
        System.out.println("\nFinal Outcome:");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);

        // Determine overall winner
        String finalOutcome;
        if (playerWins > computerWins) {
            finalOutcome = "You are the overall winner!";
        } else if (computerWins > playerWins) {
            finalOutcome = "Computer is the overall winner!";
        } else {
            finalOutcome = "It's an overall tie!";
        }

        System.out.println(finalOutcome);
        scanner.close();
    }
}
