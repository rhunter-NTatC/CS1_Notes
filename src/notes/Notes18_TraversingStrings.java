package notes;

import java.util.Scanner;

/*
 * NOTES 18 - TRAVERSING STRINGS
 * 
 * Traversing: Looking through an object or collection
 * one piece at a time.
 * 
 */

public class Notes18_TraversingStrings {
	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		String string1 = "Banana Phone";
		String string2 = "Peter Piper picked a peck of pickeled peppers";
		
		/*
		 * Basic Traversing
		 * check for 1 character at a time
		 * 
		 */
		System.out.println("Basic Traversing Examples");
		
		/* set up a for loop where i = index
		 * int i = 0: that's the start
		 * i < string1.length(): finds how long the string is and stops at the end
		 */
		for(int i = 0; i < string1.length(); i++) {
			System.out.println(string1.substring(i, i+1));
		}
		
		
		
		
		/*
		 * Search for a single character
		 * 
		 */
		System.out.println("\rSearch for Characters Examples");
		
		//count the number of "p"s in a string
		int count = 0;
		for (int i = 0; i < string2.length(); i++) {
			if (string2.substring(i, i+1).equalsIgnoreCase("p")) {
				count++;
			}
		}
		System.out.println("There are "+ count + " p's in " + string2);
		
		
		//state the index of each "p"
		System.out.print("The p's are at index: ");
		for (int i = 0; i < string2.length(); i++) {
			if (string2.substring(i, i+1).equalsIgnoreCase("p")) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//change a character
		String newString = "";
		for (int i = 0; i < string2.length(); i++) {
			if (string2.substring(i, i+1).equalsIgnoreCase("p")) {
				newString += "@";
			}
			else if (string2.substring(i, i+1).equalsIgnoreCase("e")) {
				newString += "%";
			}
			else {
				newString += string2.substring(i, i+1);
			}
		}
		System.out.println(newString);
		
		
		/*
		 * Check for multiple characters at a time
		 * 
		 */
		System.out.println("\rCheck Multiple Characters Examples");
		count = 0;
		String string3 = "Mississississippi";
		for (int i = 0; i < string3.length()-1; i++) {
			if (string3.substring(i, i+2).equalsIgnoreCase("ss")) {
				count++;
			}
		}
		System.out.println("There are "+ count + " ss's in " + string3);
		
		
		
		
		/*
		 * Search for multiple characters at a time
		 * 
		 */
		System.out.println("\rSearch for Characters Examples");
		
		//count the "pe"s in string2 
		
		
		
		
		
		
	}
}












