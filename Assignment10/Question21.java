package Self;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = scan.next();
		System.out.print("Enter number: ");
		int num = scan.nextInt();

		scan.close();

		int count = 0;
		String again = word.substring(0, num);

		while (word.contains(again)) {
			word = word.replaceFirst(again, "");
			count++;
		}

		if (count != 1) {
			System.out.println(true);
			System.out.println(again + " appears " + count + " times");
		} else {
			System.out.println(false);
			System.out.println(again + " appears once only");
		}

	}

}
