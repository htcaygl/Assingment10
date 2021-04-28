package assignment10;

public class Question26 {

	public static void main(String[] args) {
		System.out.println(uniqueChars("java"));
		System.out.println(uniqueChars("mama"));
		System.out.println(uniqueChars("spoon"));

	}

	public static String uniqueChars(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if(!result.contains("" + ch))

				result += ch;

		}
		
		return result;

	}

}
