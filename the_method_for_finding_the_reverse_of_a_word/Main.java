 package the_method_for_finding_the_reverse_of_a_word;
 
import java.util.Scanner;

 public class Main{
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 String word;
		 System.out.println("Enter a word: ");
		 word = scanner.nextLine();
		 
		 int length = word.length();
		 char array[] = word.toCharArray();
		 int i;
		 
		 for(i=0; i<length/2; i++) {
			 char temp = array[i];
			 array[i] = array[length-1-i];
			 array[length-1-i] = temp;
		 }
		 
		 String reversed_word = new String(array);
		 
		 System.out.println("Reversed word: " + reversed_word);
		 scanner.close();
		 
	 }
 }