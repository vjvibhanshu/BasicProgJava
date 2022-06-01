package IntegerPrograms;

public class OccurancesofDigitsinInteger {

	// Function to count the occurrences of the digit D in N
	static int countOccurrances(int n, int d)
	{
	    int count = 0;
	 
	    // Loop to find the digits of N
	    while (n > 0)
	    {
	        // check if the digit is D
	        count = (n % 10 == d) ? count + 1 : count; //using Ternary conditional operator
	        n = n / 10;
	    }
	 
	    // return the count of the occurrences of D in N
	    return count;
	}
	
	public static void main(String[] args) {
		
		int d = 2;
	    int n = 214215421;
	 
	    System.out.println(countOccurrances(n, d));
	}

}
