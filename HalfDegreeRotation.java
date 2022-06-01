/*
 
           * 
         * * 
       * * * 
     * * * * 
   * * * * *
   
 */

package PatternPrinting;

public class HalfDegreeRotation {

	public static void printStars(int n)
    {
        int i, j;
 
        // outer loop to handle number of rows n in this case
        for(i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces values changing according to requirement
            for(j=2*(n-i); j>=0; j--)
            {
                System.out.print(" "); // printing spaces
            }
            
            //  inner loop to handle number of columns values changing according to outer loop
            for(j=0; j<=i; j++)
            {
                System.out.print("* "); // printing stars
            }
             
            System.out.println();  // ending line after each row
        }
    }
	
	public static void main(String[] args) {
		int n = 5;
        printStars(n);
	}

}
