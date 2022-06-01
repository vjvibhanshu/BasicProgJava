package StringReverse;

public class StringReverseusingStringBuilder {

	public static void main(String[] args) {
		String input = "I love Programming";
		StringBuilder input1 = new StringBuilder();
		
		//append a string into StringBuilder input1
		input1.append(input);
		
		//reverse StringBuilder input1
		input1.reverse();
		
		//print reversed string
		System.out.println(input1);
	}
}
