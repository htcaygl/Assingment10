package assignment10;

public class Question31 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("Noon"));
		System.out.println(isPalindrome("I am not palindrome"));
		System.out.println(isPalindrome("wooden"));
		System.out.println(isPalindrome("Nurses Run"));

	}

	public static boolean isPalindrome(String str) {
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			result += str.charAt(i);
		}

		str=str.replaceAll(" ", "");
		result=result.replaceAll(" ", "");
		
		if (str.equalsIgnoreCase(result))
			return true;
		else
			return false;
 
	}

}
