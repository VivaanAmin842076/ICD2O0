import java.util.Scanner;

class U5L6 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String greeting;

        // Prompt for a single word greeting
        System.out.print("Hi. Please enter a greeting in one word: ");
        greeting = kbd.next(); // Read the first word
        System.out.printf("You said: %s.\n", greeting);
        
        // Consume the leftover newline character
        kbd.nextLine(); 

        // Prompt for a multi-word greeting
        System.out.print("Hi. Please enter a greeting in more than one word: ");
        greeting = kbd.nextLine(); // Read the entire line
        System.out.printf("You said: %s.\n", greeting);
        
        // Close the scanner
        kbd.close();
    }
}
