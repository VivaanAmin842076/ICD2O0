import java.util.Scanner;

public class U6L3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a percentage mark (0-100): ");
        int mark = scanner.nextInt();

       
        if (mark < 0 || mark > 100) {
            System.out.println("Invalid input. Please enter a mark between 0 and 100.");
        } else {
            
            if (mark >= 80) {
                System.out.println("Your letter grade is: A");
            } else if (mark >= 70) {
                System.out.println("Your letter grade is: B");
            } else if (mark >= 60) {
                System.out.println("Your letter grade is: C");
            } else if (mark >= 50) {
                System.out.println("Your letter grade is: D");
            } else {
                System.out.println("Your letter grade is: F");
            }
        }

      
        scanner.close();
    }
}
