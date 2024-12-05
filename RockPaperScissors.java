import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerWins = 0, computerWins = 0, ties = 0;

        System.out.print("How many games do you want to play? ");
        int numberOfGames = scanner.nextInt();
        scanner.nextLine();
        
        or (int i = 0; i < numberOfGames; i++) {
            System.out.print("Enter your choice (r = rock, p = paper, s = scissors): ");
            char playerChoice = scanner.nextLine().toLowerCase().charAt(0);
            int computerRandom = (int) (3 * Math.random());
          char computerChoice = (computerRandom == 0) ? 'r' : (computerRandom == 1) ? 'p' : 
    }
}
