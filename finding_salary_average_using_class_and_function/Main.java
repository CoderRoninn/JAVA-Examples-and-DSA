package finding_salary_average_using_class_and_function;

import java.util.Scanner;

class Employee{
	String name;
	String surname;
	int age;
	float wage;
}

public class Main {
	
	public static float calculate_average(Employee x[], int size) {
		int i;
		float sum = 0;
		
		for(i=0; i<size; i++) {
			sum += x[i].wage;
		}
		float average = sum / size;
		return average;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		Employee employees[] = new Employee[3];
		
		for(i=0; i<3; i++) {
			employees[i] = new Employee();
			System.out.println("Enter the wage of " + (i+1) + ". employee:");
			employees[i].wage = scanner.nextFloat();
		}
		
		float average = calculate_average(employees, 3);
		System.out.printf("The average wage is: %.2f\n", average);  // printf for %.2f
		
		scanner.close();
		
		
	}

}
