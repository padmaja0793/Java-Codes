class ArraySum {
    public static void main(String args[]) {
        int[] numbers = {5,  15 , 25, 35, 25};

        int sum = 0;
        for ( int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
 
    System.out.println("Sum of array elements = " + sum);
    }
}