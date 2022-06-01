package IntegerPrograms;
import java.util.Scanner;

public class PrimeNumber {
	
	// Check for number prime or not
    static boolean isPrime(int n)
    {
        if (n <= 1)  // Check if number is less than equal to 1
            return false;
        else if (n == 2) // Check if number is 2
            return true; 
        else if (n % 2 == 0) // Check if n is a multiple of 2
            return false; 
        for (int i = 3; i <= Math.sqrt(n); i += 2) // If not, then just check the odds
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		 if (isPrime(num))
	            System.out.println(num + " is prime number");
	 
	        else
	            System.out.println(num + " is not prime number");
	}
}
