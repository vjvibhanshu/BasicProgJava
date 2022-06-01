package StringReverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ConvertStringUsingArrayList {

	public static void main(String[] args) {
		String input = "I love Programming";
		char[] hello = input.toCharArray();
		List<Character> trail1 = new ArrayList<>();
		
		for(char c : hello)
		{
			trail1.add(c);
		}
		
		Collections.reverse(trail1);
		ListIterator li = trail1.listIterator();
		while(li.hasNext()) 
		{
			System.out.print(li.next());
		}
	}
}
