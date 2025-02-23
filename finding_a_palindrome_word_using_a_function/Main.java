package finding_a_palindrome_word_using_a_function;

import java.util.Scanner;

public class Main {
	
	public static int is_palindrome(String x) {
		
		int i = 0;
		int j = x.length() - 1;
		
		while(j > i) 
		{
		 if(x.charAt(i) != x.charAt(j))
		 {
			 return -1;
		 }
		 i++;
		 j--;
		}
		
		return 1;
}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String my_string;
		System.out.println("Enter a word:");
		my_string = scanner.nextLine();
		
		int result = is_palindrome(my_string);
		
		if(result == -1)
		  {
		   System.out.println("The word you entered isn't a palindrome word.");
		  }else {
		    System.out.println("The word you entered is a palindrome word.");
		   }
		
		scanner.close();
		
		
	}

  
}
