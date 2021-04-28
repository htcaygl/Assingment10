package assignment10;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = scan.nextLine();

		scan.close();

		String output = "";

		int i = word.indexOf("bread");
		int j = word.indexOf("bread", i + 1);

		if (i != -1 && j != -1) {
			output = word.substring((i + 5), j);

			System.out.println(output);
		}else 
			System.out.println("nothing");

	}

}
