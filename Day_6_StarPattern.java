public class Day_6_StarPattern {
    public static void main(String[] args) {
       // int rows = 4; // Number of rows

        // Loop for each row
        for (int i = 1; i <= 4; i++) {
            // Print stars for each column in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}