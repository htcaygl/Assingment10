package assignment10;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = scan.nextLine();

		scan.close();

		int countJava = 0;
		int countPython = 0;

		while (word.contains("java")) {

			word = word.replaceFirst("java", "");
			countJava++;
		}

		while (word.contains("python")) {

			word = word.replaceFirst("python", "");
			countPython++;
		}
		
		if(countJava==countPython)
			System.out.println("true");
		else
			System.out.println("false");
		

	}

}
