package StringReverse;

public class ConvertStringtoCharArrayExample2 {

	public static void main(String[] args) {
		String input="I love Programming";
		
		//convert String to character array by using toCharArray
		char[] tempArray = input.toCharArray();
		int left, right=0;
		right=tempArray.length-1;
		
		for(left=0; left<right; left++, right--)
		{
			//swap values of left and right
			char temp= tempArray[left];
			tempArray[left]=tempArray[right];
			tempArray[right]=temp;
		}
		
		for(char c: tempArray)
		{
			System.out.print(c);
		}
		System.out.println();
	}
}
