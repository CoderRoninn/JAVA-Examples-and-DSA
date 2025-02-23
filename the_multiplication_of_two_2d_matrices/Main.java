package the_multiplication_of_two_2d_matrices;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i, j, k;
		int row1, column1, row2, column2;
		
		System.out.println("Enter the sizes of first matrix:");
		row1 = scanner.nextInt();
		column1 = scanner.nextInt();
		
		System.out.println("Enter the sizes of second matrix:");
		row2 = scanner.nextInt();
		column2 = scanner.nextInt();
		
		int matrix1[][] = new int[row1][column1];
		int matrix2[][] = new int[row2][column2];
		
	
		if(column1 != row2) {
			System.out.println("Error.");
			return;
		}
		
		for(i=0; i<row1; i++) {
			for(j=0; j<column1; j++) {
				System.out.println("Enter the element [" +(i+1)+"][" +(j+1)+"]");
				matrix1[i][j] = scanner.nextInt();
			} 
		}
		
		for(i=0; i<row2; i++) {
			for(j=0; j<column2; j++) {
				System.out.println("Enter the element [" + (i+1) +"]["+(j+1)+"]");
				matrix2[i][j] = scanner.nextInt();
			}
		}
		
		int sum = 0;
		int result[][] = new int[row1][column2];
		
		
		for(i=0; i<row1; i++) {
			for(j=0; j<column2; j++) {
				sum = 0;
				for(k=0; k<row2; k++) {
					sum += matrix1[i][k] * matrix2[k][j];
				}
				result[i][j] = sum;
			}
		}
		
		System.out.println("-----RESULT MATRİX-----");
		
		for(i=0; i<row1; i++) {
			for(j=0; j<column2; j++) {
				System.out.print(result[i][j] +" ");
			}
			System.out.println();
		}
		
			
	}

}
