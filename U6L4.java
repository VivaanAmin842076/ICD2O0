class U6L4 {
    public static void main(String[] args) {
        // Declare the words
        String word1 = "fortify";
        String word2 = "shellac";
        String word3 = "shellshock";

       
        String first, next, last;

       
        if (word1.compareTo(word2) < 0 && word1.compareTo(word3) < 0) {
            
            first = word1;
            if (word2.compareTo(word3) < 0) {
                next = word2;
                last = word3;
            } else {
                next = word3;
                last = word2;
            }
        } else if (word2.compareTo(word1) < 0 && word2.compareTo(word3) < 0) {
            
            first = word2;
            if (word1.compareTo(word3) < 0) {
                next = word1;
                last = word3;
            } else {
                next = word3;
                last = word1;
            }
        } else {
            
            first = word3;
            if (word1.compareTo(word2) < 0) {
                next = word1;
                last = word2;
            } else {
                next = word2;
                last = word1;
            }
        }

      
        System.out.println("The first word is: " + first);
        System.out.println("The next word is: " + next);
        System.out.println("The last word is: " + last);
    }
}
