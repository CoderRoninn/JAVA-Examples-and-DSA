package finding_the_sum_and_average_of_the_array_input_from_user;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n, i;
		int sum = 0;
		float average = 0;
		
		System.out.println("Enter the size of array:");
		n = scanner.nextInt();
		
		int array[] = new int[n];
		
		for(i=0; i<array.length; i++)
		   {
			System.out.println("Enter the " +(i+1) +". element of array");
			array[i] = scanner.nextInt();
			sum += array[i];
		   }
		
		average = (float) sum / n;
		
		System.out.println("The sum of array is: " + sum);
		System.out.println("The average of array is: " + average);
		
		scanner.close();
	}
}
