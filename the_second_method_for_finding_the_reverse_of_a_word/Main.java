package the_second_method_for_finding_the_reverse_of_a_word;

import java.util.Scanner;

public class Main{
	public static void reversed_word(String word) {
		
		int len = word.length();
		String reversed = "";
		
		int i;
		
		for(i=len-1; i>=0; i--) {
			reversed += word.charAt(i);
		}
		
		System.out.println("The reverse of the word you entered is: " + reversed);
		
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String word;
		System.out.println("Enter a word:");
		word = scanner.nextLine();
		
		reversed_word(word);
		
		scanner.close();
		
		
		
	}
	
}