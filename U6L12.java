import java.lang.Math;

class U6L12 {
    public static void main(String[] args) {
        for (int x = 1; x < 13; x++) { // Change > to < and make 12-13 so it prints 12 and make x=1
            double sr = Math.sqrt(x); // Add missing semicolon
            System.out.printf("%d %.4f\n", x, sr); // Change 'system' to 'System' and format to 4 decimals
        }
    }
}
