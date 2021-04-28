package assignment10;

public class Question16 {

	public static void main(String[] args) {

		// String word="xjavaxx";
		String word = "xxjavaxx";
		// String word="xjv";

		if (word.length() >= 4) {
			if (word.indexOf("java") == 0 || word.indexOf("java") == 1)
				System.out.println(true);
			else
				System.out.println(false);

		} else
			System.out.println("The string should be 4 and more characters.");

	}

}
