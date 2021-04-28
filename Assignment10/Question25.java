package assignment10;

public class Question25 {

	public static void main(String[] args) {
		System.out.println(mergeString("12345", "abcde"));
		System.out.println(mergeString("wooden", "spoon"));
		System.out.println(mergeString("java", "selenium"));

	}

	public static String mergeString(String s1, String s2) {

		int i = s1.length();
		int j = s2.length();
		String output = "";

		if (i > j) {

			for (int k = 0; k < j; k++) {
				output += s1.charAt(k) + "" + s2.charAt(k);

			}

			output += s1.substring(j);

			return output;
		} else if (i < j) {

			for (int k = 0; k < i; k++) {
				output += s1.charAt(k) + "" + s2.charAt(k);

			}

			output += s2.substring(i);

			return output;
		} else {
			for (int k = 0; k < i; k++) {
				output += s1.charAt(k) + "" + s2.charAt(k);

			}
			return output;

		}

	}

}
