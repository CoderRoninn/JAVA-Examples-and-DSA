package finding_the_distance_between_2_objects_using_a_function;

import java.util.Scanner;

public class Main {
	
	public static float distance(float a1, float b1, float a2, float b2) {
		return (float)Math.sqrt((a1 - a2) * (a1 - a2) +(b1 - b2) * (b1 - b2));
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float x1, x2, y1, y2;
		System.out.println("Enter the cordinates of the first object:");
		x1 = scanner.nextFloat();
		y1 = scanner.nextFloat();
		System.out.println("Enter the cordinates of the second object:");
		x2 = scanner.nextFloat();
	    y2 = scanner.nextFloat();
	    
	    System.out.println("The distance between 2 objects is: " +(distance(x1, y1, x2, y2)));
		
	}

}
