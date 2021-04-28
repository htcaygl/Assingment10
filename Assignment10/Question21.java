package assignment10;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = scan.next();
		System.out.print("Enter number: ");
		int num = scan.nextInt();

		scan.close();

		String con = "";
		String c = "";

		for (int i = 0; i < num; i++) {

			con += word.charAt(i);
		}

		//System.out.println(con);
		int count = 0;

		while (word.contains(con)) {			
			word = word.replaceFirst(con, "");
			count++;
		}

		if (count == 1) {
			System.out.println(false);
			System.out.println(con + " appears once only");

		} else {
			System.out.println(count);
			if (count == 2) 
				c = "twice";
			else if (count == 3) {
				c = "three times";
				
			}
			System.out.println(con +" appears "+ c);
		}
	}

}
