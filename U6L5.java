import java.util.Scanner;
import java.math.BigInteger;

public class U6L5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            BigInteger factorial = BigInteger.ONE; 
            
            for (int i = 2; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            
    
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        
        scanner.close();
    }
}
