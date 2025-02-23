package drawing_a_pyramid_with_asterisks;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number, i, j;
		System.out.println("Enter a number");
		number = scanner.nextInt();
		
		for(i=0; i<number; i++)
		{
		 for(j=0; j<=i; j++)
		    {
		     System.out.print("*");
			}
		 System.out.println();
			
		}
		
		scanner.close();
		
	
	}
}
