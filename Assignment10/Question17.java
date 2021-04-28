package assignment10;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first character: ");
		String f = scan.next();
		System.out.print("Enter second character: ");
		String s = scan.next();

		scan.close();

		char fc = f.charAt(0);
		char sc = s.charAt(0);

		for (char i = fc; i <= sc; i++)

			System.out.print(i);

	}

}
