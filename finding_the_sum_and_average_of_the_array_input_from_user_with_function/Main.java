package finding_the_sum_and_average_of_the_array_input_from_user_with_function;

import java.util.Scanner;


public class Main{
	
	public static int sum(int array[]) {
		
		int i, sum = 0;
		
		for(i=0; i<array.length; i++)
		   {
			sum += array[i];
		   }
		return sum;
		
	}
	
	public static float average(int array[]) {
		
		float average = (float)sum(array) / array.length;
		return average;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    int n, i;
	    System.out.println("Enter the size of array:");
	    n = scanner.nextInt();
	    
		int array[] = new int[n];
		
		for(i=0; i<n; i++)
		   {
			System.out.println("Enter the " + (i+1) + ". element of array:");
			array[i] = scanner.nextInt();
		   }
		
		System.out.println("The sum of the array is: " + sum(array));
		System.out.println("The average of the array is: " + average(array));
		
		
	}
	
}
