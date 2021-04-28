package assignment10;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = scan.next();
		System.out.print("Enter separator: ");
		String sep = scan.next();
		System.out.print("Enter number: ");
		int num = scan.nextInt();

		scan.close();
		String result = "";

		for (int i = 1; i < num; i++) {

			result += word.concat(sep);

		}
		result += word;

		System.out.println(result);
	}

}
