package finding_how_many_of_30_random_numbers_between_0_and_100_have_2_digits;

import java.util.Random;


public class Main{
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int array[] = new int[30];
		int i, count = 0;
		
		for(i=0; i<30; i++)
		   {
			array[i] = random.nextInt(100);
			if(array[i] > 9 && array[i] <100)
			  {
			   count +=1;
			   System.out.println("The random value of " + i +". index in the array is: " + array[i]);
			  }
		   }
		
		System.out.println("There are: " + count + " numbers between 10 and 100.");
		
		
	}
}