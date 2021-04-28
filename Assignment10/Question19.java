package assignment10;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = scan.next();
		scan.close();

		int count = 0;

		for (int i = 0; i < word.length(); i++) {

			if (word.contains("java")) {
				count++;
				word = word.replaceFirst("java", "");
			}
		}
		
		System.out.println(count);
	}

}
