package StringReverse;

import java.util.Scanner;

public class ReverseStringSimpleProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to reverse : ");
		String sentence = sc.nextLine();
		String reversesentence = "";
		
		for(int i=sentence.length(); i>0; i--)
		{
			reversesentence += sentence.charAt(i-1);
		}
		
		System.out.println("Reversed String : " +reversesentence);
	}

}
