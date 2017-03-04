package logicalprograms;

public class PalindromeExample {
	public String palindromeString(String input){
		//String output= null;// we should not give null
		String output= "";
		for(int i=input.length()-1;i>=0;i--){
			output= output+input.charAt(i);
			
		}
		return output;
	}

	public long palindromeNumber(long input) {
		long palindrome = input;
		long result = 0;
		while (palindrome != 0) {
			long reminder = palindrome % 10;
			result = (result * 10) + reminder;
			palindrome = palindrome / 10;
		}
		return result;
	}
	public static void main(String[] args) {
		long input = -1234;
		PalindromeExample palindromeExample = new PalindromeExample();
		long output = palindromeExample.palindromeNumber(input);
		if (input == output) {
			System.out.println("palindrome "+output);
		} else {
			System.out.println("not palindrome"+output);
		}
		String inputstring ="amma";
	String outputstring	=palindromeExample.palindromeString(inputstring);
			if (inputstring.equals(outputstring)) {//difference b/w "==" and .equals()?
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
