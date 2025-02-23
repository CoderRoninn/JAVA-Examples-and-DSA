package finding_area_and_circumference_of_circle;

import java.util.Scanner;

public class Main{
	
	public static final double PI = 3.14;  // final is for constant variable  or we can use Math.PI
			
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double circumference, area, r;
		System.out.println("Enter the radius of circle:");
		r = scanner.nextDouble();
		
		area =  PI * r * r;  // Math.PI * r * r
		circumference = 2 * PI * r;
		
		System.out.println("The circumference of circle is:" + circumference);
		System.out.println("The area of circle is:" + area);
		
		scanner.close();
			
	}
		
	
}