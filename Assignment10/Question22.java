package assignment10;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = scan.nextLine();
		
		scan.close();

		if(word.contains("<html>"))
		{
			int n=word.indexOf("id=\"");	
						
			System.out.println(word.substring(n+4));
		}
		
		
	}

}
