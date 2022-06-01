package StringReverse;

public class ConvertingStringUsingStringBuffer {

	public static void main(String[] args) {
		String str = "I love Programming";

		//conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		
		//To reverse the string
		sbr.reverse();
		System.out.println(sbr);
	}
}
