import java.io.*;
import java.util.Scanner;

class U6L6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String choice = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.print("Choose a, b, or c: ");
            choice = kb.nextLine(); // Read input as a string
            valid = choice.equals("a") || choice.equals("b") || choice.equals("c");
        }
        
        System.out.printf("You chose: %s\n", choice);
    }
}
