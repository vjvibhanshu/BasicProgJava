package StringReverse;

import java.util.Scanner;

public class CountNumberOfCharactersInString {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a string : ");
			String input = sc.nextLine().toLowerCase(); //make all letters of input to lower case 
			
			System.out.print("Enter character for counting occurances : ");
			  char search = sc.next().charAt(0);             // Character to search is 'a'.
			  
			  int count=0;
			  for(int i=0; i<input.length(); i++)
			  {
			      if(input.charAt(i) == search)
			      count++;
			  }
			  
			  System.out.println("The Character '"+search+"' appears "+count+" times.");
	}
}
