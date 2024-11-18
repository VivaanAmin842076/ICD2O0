import java.util.Scanner;
import java.util.Random;

public class U6L7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctNumber = random.nextInt(10) + 1;
        int guess = 0;
        boolean isCorrect = false;
        int attempts = 0;

        while (!isCorrect && attempts < 5) {
            System.out.print("Guess a number between 1 and 10: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == correctNumber) {
                isCorrect = true;
                System.out.println("Right answer!");
            } else {
                System.out.println("Incorrect. Try again.");
            }
        }

        if (!isCorrect) {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + correctNumber + ".");
        }

        scanner.close();
    }
}
