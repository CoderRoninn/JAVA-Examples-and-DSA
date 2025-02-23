package finding_exponential_values_using_a_function;

import java.util.Scanner;

public class Main {
	
	public static float result(float a, float b) {
		
		int i;
		float result = 1;
		
		for(i=0; i<b; i++)
		   {
			result *= a;
		   }
		return result;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float x, y;
		System.out.println("Enter the base of number:");
		x = scanner.nextFloat();
		System.out.println("Enter the exponent of number:");
		y = scanner.nextFloat();
		
		System.out.println("The result is: " + result(x, y));
		scanner.close();
	}

}
