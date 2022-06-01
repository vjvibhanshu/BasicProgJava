package PatternPrinting;

public class ReversePyramidPattern {

	public static void printStars(int n){
        int i, j;
        
        //outer loop to handle number of rows n in this case
        for ( i = 1; i <= n; i++)
        {
          //inner loop to handle number spaces values changing acc. to requirement
          for ( j = 1; j < i; j++)
            {
        	  //printing spaces
                System.out.print(" ");
            }
          //inner loop to handle number of columns values changing acc. to outer loop
          for ( j = i; j <= n; j++)
            {
        	//printing stars
                System.out.print("* ");
            }  
            System.out.println();
        }
   }
    
	public static void main(String[] args) {
		int n = 5;
        printStars(n);
	}
}
