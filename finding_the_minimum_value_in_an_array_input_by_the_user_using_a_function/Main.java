package finding_the_minimum_value_in_an_array_input_by_the_user_using_a_function;

import java.util.Scanner;

public class Main{
	
	public static int min_value(int array[]) {
		
		int min = array[0];
		int i;
		
		for(i=1; i<array.length; i++)
		   {
			if(min > array[i])
			  {
				min = array[i];
			  }
		   }
		return min;	
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n, i;
		System.out.println("Enter the size of array:");
		n = scanner.nextInt();
		
		int array[] = new int[n];
		
		for(i=0; i<array.length; i++) 
		   {
			System.out.println("Enter the element " +(i+1) + " of the array" );
			array[i] = scanner.nextInt();		
			}
		
		System.out.println("The min value of array is: " + min_value(array));  // or int min = Arrays.stream(array).min().orElseThrow();  import java.util.Arrays;  it is required to find the minimum  value
		
		scanner.close();                        
	}
}