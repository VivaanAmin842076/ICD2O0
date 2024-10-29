/*
 * This program lists all factors of the number 24, including 24 itself.
 * ... but it has a few "issues" ...
 * The expected output should be: 1 24 2 12 3 8 4 6
 */

class U5L3 {

    public static void main(String[] args) {
        int n = 24;
        int max = (int) Math.sqrt(n);

        for (int i = 1; i <= max; i++) {
            if (n % i == 0) { 
                System.out.print(i + " "); 
                int f2 = n / i;
                if (f2 != i) {
                    System.out.print(f2 + " ");
                }
            }
        }
        System.out.println();
    }
}
