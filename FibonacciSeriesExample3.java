package FibonacciSeries;

public class FibonacciSeriesExample3 {

	//function to find the fibonacci series
	static int fib(int n)
	{
		//Declare an array to store fibonacci numbers
		//1 extra to handle case, n=0
		int f[] = new int[n+2];
		int i;
		
		//0th and 1st number of the series are 0 and 1
		f[0] = 0;
		f[1] = 1;
		
		for(i=2; i<=n; i++)
		{
			//Add the previous 2 numbers in the series and store it
			f[i] = f[i-1] + f[i-2];
		}
		
		//nth fibonacci number
		return f[n];
	}
	public static void main(String[] args) {
		//Given number n
		int n=10;
		
		//print first 10 terms
		for(int i=0; i<n; i++) {
			System.out.print(fib(i) + " ");
		}
	}
}
