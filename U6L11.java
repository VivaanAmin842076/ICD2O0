public class U6L11 {
    public static void main(String[] args) {
     
        long startEmoji = 0x1F600;
        long endEmoji = 0x1F64F;


        for (long x = startEmoji; x <= endEmoji; x++) {
       
            String emoji = new String(Character.toChars((int) x));
        
            System.out.printf("%x\t%s\t", x, emoji);

            if ((x - startEmoji + 1) % 8 == 0) {
                System.out.println();
            }
        }
    }
}
