package the_sum_of_the_digits_of_the_number;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, sum = 0;
		
		System.out.println("Enter a positive number");
		x = scanner.nextInt();
		
		while(x > 0) {
			int digit = x % 10;
			sum += digit;
			x /= 10;
		}
		System.out.println("The sum of the digits of the number is:" + sum);
		
		scanner.close();
		
	}
}