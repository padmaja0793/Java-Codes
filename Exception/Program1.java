
import java.util.Scanner;
public class Program1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Enter num1 = ");
		num1 = sc.nextInt();
		System.out.println("Enter num2 = ");
		num2 = sc.nextInt();
		try {
		int result = num1/num2;
		System.out.println("Result = "+result);
	    }
		catch(ArithmeticException ex) {//ex= Ithe kahi pn write karu shkto eg.(x,y,z)
			System.out.println(ex.getMessage());
		}
	}
}

    //jevha aapan ekhadya integer la 0 ne divide krto tevha ArithmeticException yeto