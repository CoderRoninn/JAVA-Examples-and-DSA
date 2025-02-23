package drawing_a_hollow_square;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number, i, j;
		
		System.out.println("Enter a number");
		number = scanner.nextInt();
		
		for(i=0; i<number; i++)
		{
		 for(j=0; j<number; j++)
			{
			 if( i== 0 || i == number - 1 || j == 0 || j == number - 1) 
			   {
				System.out.print("*");
			   }
			 else 
			 {
			  System.out.print(" ");
			 }
			}
		 System.out.println();
		}
		
		scanner.close();
		
	}

}