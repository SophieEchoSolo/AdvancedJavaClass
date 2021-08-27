import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-251
 * Using recursion methods to reverse a string
 */

public class StringRecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string and I will print it back in reverse order: ");
		String sentence = input.next();
		
		System.out.println(stringReverse(sentence));
		
		input.close();

	}// end main
	
	public static String stringReverse(String s) {
		
		if (s.isEmpty()) {
			return s;
			
		}//end if
		
		else {
			
			return stringReverse(s.substring(1)) + s.charAt(0);
			
		}//end else
		
	}//end method stringReverse
	

}//end class

