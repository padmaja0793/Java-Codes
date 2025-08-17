public class pattern1 {
    public static void main(String args[]) {
        int rows  = 5;
        int col = 5;

       for (int i = 1; i <= rows; i++) {
            // inner loop for columns
            for (int j = 1; j <= col; j++) {
                System.out.print("* "); // print star with space
            }
            System.out.println(); // move to next line after each row
        }
    }
}