package assignment10;

public class Question29 {

	public static void main(String[] args) {
	System.out.println(limit("abcd",2));
	System.out.println(limit("bla bla",3));

	}

	public static String limit(String str, int i) {
		
		return str.substring(0, i);
		
	}

}
