
import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	
	public static void showRecord(int[][]arr) {
		for (int index = 0; index < arr.length;index ++) {
		System.out.println(Arrays.toString(arr[index]));
	}
}


     public static void acceptRecord(int[][]arr) {
    	Scanner sc = new Scanner(System.in);
    	for(int row=0;row<arr.length;row++) {
    		for(int col=0;col<arr[row].length;col++){
    			
    			System.out.println("Enter value");
    			arr[row][col]=sc.nextInt();
    		}
    	}
    }
    public static void displayRecord(int[][]arr) {
    	for (int[] i :arr) {
    		for(int element : i) {
    			System.out.print(element + " ");
    		}
    		System.out.println();
    	}
    }
    public static void main(String[] args) {
    	int arr[][]=new int[4][];
    	arr[0]=new int[4];
    	arr[1]=new int[3];
    	arr[2]=new int[2];
    	arr[3]=new int[1];
    	
    	Program1.acceptRecord(arr);
    	Program1.showRecord(arr);
    	Program1.displayRecord(arr);
    }
}

    


    
    	
    	
    		
    		
    	
   