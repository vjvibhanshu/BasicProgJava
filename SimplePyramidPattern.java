/*

* 
* * 
* * * 
* * * * 
* * * * * 

 */

package PatternPrinting;

public class SimplePyramidPattern {

	// Function to demonstrate printing pattern
    public static void printStars(int n)
    {
        int i, j;
 
        // outer loop to handle number of rows n in this case
        for(i=0; i<n; i++)
        { 
            //  inner loop to handle number of columns values changing according to outer loop   
            for(j=0; j<=i; j++)
            {
                System.out.print("* "); // printing stars
            }
 
            // ending line after each row
            System.out.println();
        }
   }
    
	public static void main(String[] args) {
		int n = 5;
        printStars(n);
	}
}
