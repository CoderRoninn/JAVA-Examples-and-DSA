package drawing_a_pyramid_with_numbers;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number;
		System.out.println("Enter a number:");
		number = scanner.nextInt();
		
		int i, j;
		
		for(i=0; i<number; i++) {
			for(j=0; j<=i; j++) {
				System.out.print(i+1 + "");
			}
			System.out.println();
		}
		scanner.close();
	}
}