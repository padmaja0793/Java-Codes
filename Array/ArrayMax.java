class ArrayMax {
    public static void main(String args[]) {
        int[] numbers = {10,20,50,30,56};

        int max = numbers[0];     //first element sharun chalto
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number = " + max);
    }

}
