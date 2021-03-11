package notes;

import java.util.Arrays;

/*
 * Notes - CHARS
 * 
 * Another "primitive data type", just like int, double, and booleans 
 *   (not Strings).  Chars hold 1 character as an integer.  The number
 *   represents the letter's UNICODE VALUE.
 *   
 * Why not use a String?  SPEED!!!
 * 
 * ASCII Table   https://theascii.com/ascii-table/ 
 * 
 * 
 */


public class Notes21_Chars {

	public static void main(String[] args) {
		
		
		/*
		 * Declaring Chars
		 * 
		 * Use single quotes 'a' NOT
		 * 	 double quotes are for Strings "a"
		 * 
		 */
		char x = 'a';
		System.out.println(x);
		
		
		char a = '⚽';
		System.out.println(a + "\uD83E\uDD13 \uD83D\uDC5C");
		
		//What happens when I add 10 to a k?
		x = 'k';
		x += 10;
		System.out.println(x);
		
		
		
		//How would I capitalize any lower case letter?
		x -= 32;
		System.out.println(x);
		
		
		/*
		 * EQUALITY
		 * 
		 * Chars are NOT Strings, so we don't
		 *   need the .equals() method.
		 * 
		 * They're primitive data types
		 * 
		 * Use ==
		 * 
		 */
		if (x == 'a') {
			System.out.println("It's an 'a'");
		}
		else if (x == 'U') {
			System.out.println("It's an 'U'");
		} 
		
		if (x == 85) {
			System.out.println("It's an 'U'");
		}
		
		
		
		
		
		
		/*
		 * Char Methods
		 * 
		 * .charAt(<int>)
		 * 		returns the character at a given index
		 * 
		 * .toCharArray()
		 * 		returns a String as an array of chars
		 * 
		 * .isLetter()
		 * 		returns true if the given String or char is a letter
		 * 
		 * .nextChar()  DOES NOT EXIST!!!
		 * 		do this...
		 * 		.next().charAt(0)
		 * 
		 */
		
		String greeting = "Howdy Y'all!";
		
		//.charAt(<int>)
		char c1 = greeting.charAt(3);
		System.out.println("Index 3 = '" + c1 + "'");
		System.out.println("Index 5 = '" + greeting.charAt(5) + "'");
	
		
		
		
		
		
		
		
		
		//toCharArray()
		char[] charArr = greeting.toCharArray();
		System.out.println("Index 6 = '" + charArr[6] + "'");
		//prints out an array in [] with commas
		System.out.println(Arrays.toString(charArr));
		
		
		
		
		
		
		
		
		
		
		
		
		//isLetter()
		System.out.println("'r' is a letter = " + Character.isLetter('r'));
		
		//lets check all the chars in charArr
		for (int i = 0; i < charArr.length; i++) {
			if (Character.isLetter(charArr[i])) {
				System.out.println("'" + charArr[i] + "' is a letter");
			}
			else {
				System.out.println("'" + charArr[i] + "' is not a letter");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Type Casting
		 * 
		 */
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
