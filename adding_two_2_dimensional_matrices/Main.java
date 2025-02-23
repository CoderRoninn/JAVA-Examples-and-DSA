package adding_two_2_dimensional_matrices;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i,j;
		int row1, column1, row2, column2;
		
		System.out.println("Enter the number of the rows of the first matrix:");
		row1 = scanner.nextInt();
		System.out.println("Enter the number of the columns of the first matrix:");
		column1 = scanner.nextInt();
		
		System.out.println("Enter the number of the rows of the second matrix:");
		row2 = scanner.nextInt();
		System.out.println("Enter the number of the columns of the second matrix:");
		column2 = scanner.nextInt();
		
		int array[][] = new int[row1][column1];
		int array2[][] = new int[row2][column2];
		
		if((row1 != row2) || (column1 != column2)) {
			System.out.println("The dimensions aren't equal.");
			return;}
		
		for(i=0; i<row1; i++) {
			for(j=0; j<column1; j++) {
				System.out.println("Enter the element [" +(i+1) + "]["+(j+1) +"]" );
				array[i][j] = scanner.nextInt();
			}
			
		}
		
		for(i=0; i<row2; i++) {
			for(j=0; j<column2; j++) {
				System.out.println("Enter the element[" +(i+1) + "][" +(j+1) +"]");
				array2[i][j] = scanner.nextInt();
			}
		}
		
		int result[][] = new int[row1][column1];
		
		for(i=0; i<row1; i++) {
			for(j=0; j<column1; j++) {
				result[i][j] = array[i][j] + array2[i][j];
			}
		}
		
		System.out.println("-----RESULT MATRİX-----");
		
		for(i=0; i<row1; i++) {
			for(j=0; j<column1; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
 	}

}
