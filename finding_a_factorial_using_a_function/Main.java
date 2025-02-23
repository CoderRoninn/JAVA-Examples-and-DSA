package finding_a_factorial_using_a_function;

import java.util.Scanner;

public class Main{
	public static int factorial(int number) {
		int i;
		int result = 1;
		
		for(i=1; i<=number; i++)
		   {
			result *= i;
		   }
		return result;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x;
		System.out.println("Enter a positive number:");
		x = scanner.nextInt();
		
		System.out.println("The factorial of number you entered is: " + factorial(x));
		
		scanner.close();
		
	}
}