package assignment10;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		scan.close();
		
		
		int fac=1;
		for(int i=1;i<=num;i++) {
			
			fac*=i;
		}
		
		System.out.println(num+"! =" +fac);

	}

}
