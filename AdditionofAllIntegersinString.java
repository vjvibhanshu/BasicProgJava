package StringReverse;

public class AdditionofAllIntegersinString {
	static String extractInt(String str)
    {
        // Replacing every non-digit number with a space(" ") 
        str = str.replaceAll("[^\\d]", " ");
  
        // Remove extra spaces from the beginning and the ending of the string
        str = str.trim();
  
        // Replace all the consecutive white spaces with a single space
        str = str.replaceAll(" +", " "); //replaceAll(String regex, String replacement), regex is regular expression
  
        if (str.equals(""))
            return "-1";
  
        return str;
    }
	
	public static void main(String[] args) {		
		String str = "English75Maths90Science70SStudies80";
        
        String[] splitArray = extractInt(str).split(" ");
        int[] numbers = new int[splitArray.length];
        
        // parsing the String argument as a signed decimal integer object and storing that integer into the array
        for (int i = 0; i < splitArray.length; i++) {
        	numbers[i] = Integer.parseInt(splitArray[i]);
        }
        
        int addition=0;        
        for(int i=0; i<numbers.length; i++)
        {
        	addition += numbers[i];
        }
        System.out.println("Addition = " + addition);
	}
}
