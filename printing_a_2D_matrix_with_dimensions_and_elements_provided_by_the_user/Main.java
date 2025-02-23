package printing_a_2D_matrix_with_dimensions_and_elements_provided_by_the_user;

import java.util.Scanner;

public class Main{ 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int row, column;
		int i, j;
		
		System.out.println("Enter the number of row:");
		row = scanner.nextInt();
		System.out.println("Enter the number of column:");
		column = scanner.nextInt();
		
	
		int matrix[][] = new int[row][column];
		
		for(i=0; i<row; i++)
		   {
			for(j=0; j<column; j++)
			   {
				System.out.println("Enter the element[" +(i+1)+ "][" +(j+1)+"]");
				matrix[i][j] = scanner.nextInt();
			   }
		   }
		
		System.out.println("The elements are:");
		
		for(i=0; i<row; i++)
		   {
			for(j=0; j<column; j++) 
			{
			 System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		   }
		
		scanner.close();
	}
}
