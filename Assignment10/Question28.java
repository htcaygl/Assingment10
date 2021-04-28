package assignment10;

public class Question28 {

	public static void main(String[] args) {
		System.out.println(clean("one two three","two"));
		System.out.println(clean("foo bar","foo"));
		System.out.println(clean("he said bla bla bla","bla"));

	}

	public static String clean(String text, String badWord) {


		text=text.replaceAll(badWord, "").trim().replace("  ", " ");
		
		return text;
	}

}
