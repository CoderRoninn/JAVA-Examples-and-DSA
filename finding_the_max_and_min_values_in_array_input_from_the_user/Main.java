package finding_the_max_and_min_values_in_array_input_from_the_user;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i, n, min, max;
		System.out.println("Enter the size of array:");
		n = scanner.nextInt();
		
		int array[] = new int[n];
		
		for(i=0; i<n; i++) {
			System.out.println("Enter the element at index " + (i+1));
			array[i] = scanner.nextInt();}
		
		min = max = array[0];
		
		for(i=1; i<n; i++) {
			 if(min >  array[i]) {
				 min = array[i];}
			   if(max < array[i]) {
				   max = array[i];}
		}
		
		System.out.println("The maximum value of array is: " +max);
		System.out.println("The minimum value of array is: " + min);
		scanner.close();
		
	}
}
