package assignment10;

public class Question27 {

	
	public static void main(String[] args) {
		System.out.println(coverString("java methods", "me"));
		System.out.println(coverString("Certified Wooden Spoon", "o"));
		System.out.println(coverString("hello hello", "ello"));
		System.out.println(coverString("apples", "pears"));

	}

	public static String coverString(String s1, String s2) {
		if (s1.contains(s2)) {

			String newS2 = "[" + s2 + "]";

			s1 = s1.replaceAll(s2, newS2);
		} else {

			s1 = "[" + s1 + "]";

		}

		return s1;

	}
	
}
