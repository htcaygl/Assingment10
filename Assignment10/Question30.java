package assignment10;

public class Question30 {

	public static void main(String[] args) {
		System.out.println(at3("longword", "foo"));
		System.out.println(at3("blabla", "a"));

	}

	public static String at3(String s1, String s2) {

		return s1.substring(0, 3).concat(s2) + s1.substring(3);

	}

}
