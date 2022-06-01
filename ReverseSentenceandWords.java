package StringReverse;

public class ReverseSentenceandWords {

	public static void main(String[] args) {
		String words[] = "I will not win this Game".split(" ");
		String answer = "";
		
		for(int i=words.length-1; i>=0; i--)
		{
			answer += words[i] + " ";
		}
		System.out.println("Reversed String = " +answer);	
		
	}
}
