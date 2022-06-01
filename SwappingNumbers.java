package IntegerPrograms;

public class SwappingNumbers {

	public static void usingAdditionSubtraction() {
		System.out.println("Using Addition and Subtraction :");
		int x = 10;
        int y = 5;
		System.out.println("Before swaping:" + " x = " + x + ", y = " + y);
		
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:" + " x = " + x + ", y = " + y);
	}
	
	public static void usingMultiplicationDivision() {
		System.out.println("\nUsing Multiplication and Division :");
		int x = 10;
        int y = 5;
		System.out.println("Before swaping:" + " x = " + x + ", y = " + y);
 
        // Code to swap 'x' and 'y'
        x = x * y; // x now becomes 50
        y = x / y; // y becomes 10
        x = x / y; // x becomes 5
 
        System.out.println("After swaping:" + " x = " + x + ", y = " + y);
	}
	
	public static void main(String[] args) {
		usingAdditionSubtraction();
		usingMultiplicationDivision();
	}

}
