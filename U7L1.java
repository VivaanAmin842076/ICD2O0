import java.util.Scanner;

class U7L1 {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Please enter an integer: ");
   int number = sc.nextInt();

   if (number >= 1000) {
     System.out.println(number + " has 4 or more digits.");
   } else if (number >= 100) {
     System.out.println(number + " has 3 digits.");
   } else if (number >= 10) {
     System.out.println(number + " has 2 digits.");
   } else {
     System.out.println(number + " has 1 digit.");
   }
 }
}
