package fibonacci_series;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n, i, t1 = 0, t2 = 1, next = 0;
		
		System.out.println("How many elements will there be");
		n = scanner.nextInt();
		
		if(n == 1)
		  {
		   System.out.println("Fibonacci series: " + t1);
		   System.out.println("The last element is: " + t1);
		  }
		if(n == 2)
		  {
		   System.out.println("Fibonacci series: " + t1 + "," + t2);
		   System.out.println("The last element is:" + t2);
		   
		  }
		
		else
		{
		 System.out.print("Fibonacci series:" + t1 + "," + t2);
		 
		 for(i=2; i<n; i++)
		    {
			 next = t1 + t2;
			 System.out.print(","+ next);
			 t1 = t2;
			 t2 = next;
		    }
		 System.out.println("\nThe last element is: " + next);
		}
		
		scanner.close();
			
	}

}
