import java.util.Scanner;

public class birthyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int birthYear = scanner.nextInt();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        int doubleBirthYear = birthYear * 2;
        int addFive = doubleBirthYear + 5; 
        int multiplyBy50 = addFive * 50; 
        int addAge = multiplyBy50 + age;
        int subtract250 = addAge - 250;
        double finalResult = subtract250 / 100.0;

        System.out.println("The result is: " + finalResult);
        System.out.println("This result represents a value that is mathematically related to your age and birth year.");
    }
}
