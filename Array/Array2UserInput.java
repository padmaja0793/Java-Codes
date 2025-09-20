import java.util.Scanner;

class Array2UserInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Array declare
        int[] numbers = new int [7];


        //user kadun input ghene
        System.out.println("Enter 7 numbers :");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        //Array print karne
        System.out.println("You enterd :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
