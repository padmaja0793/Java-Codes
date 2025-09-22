import java.util.Scanner;

class PrimeNum
{
    public static void main(String args[])
    {
        int n;
        int count = 0; //division counter

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        n=sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;// increment
            }
        }
        if(count == 2)// exactly 2 if no.is prime
        {
            System.out.println(n+" is a Prime number");
        }
        else 
        {
            System.out.println(n+ " is not a prime number");
        } 
    }
}