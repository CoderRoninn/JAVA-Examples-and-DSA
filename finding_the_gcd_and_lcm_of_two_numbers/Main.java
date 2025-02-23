package finding_the_gcd_and_lcm_of_two_numbers;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x, y, gcd = 0, lcm = 0, i;
		System.out.println("Enter first number");
		x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter second number");
		y = scanner.nextInt();
		
		int a = (x > y) ? y : x;
		
		for(i=2; i<=a; i++) 
		   {
			if((x % i == 0) && (y % i == 0))
			  {
			   gcd = i;
			  }
		   }
		
		if(gcd == 0) 
		  {
		   System.out.println("GCD is: 1");
		   lcm = x * y;
		   System.out.println("LCM is: " + lcm);
		  }
		else
		{
		 System.out.println("GCD is: " + gcd);
		 lcm = (x * y) / gcd;
		 System.out.println("LCM is: " + lcm);
		}
		
		scanner.close();	
		
	}

    
}
