package notes_blank_copies;

/*
 * Arrays Basics
 * 
 * What is an array?
 * A collection of data.  All of the same type.
 * 
 * 
 * Definitions:
 *   Element = 1 item in the array
 *   
 *   Immutable = CANNOT CHANGE!!! We can change the data, 
 *               but we can't change the size of the array.
 *   
 *   Index = just like string indexes. They refer to each element and start counting at 0.
 * 
 * 
 * Indexing:
 * 
 * 
 * In here we give examples of 
 *  - Declaring: creating the array
 *  
 *  - Instantiating: filling the array with values
 *  
 *  - Getting and Setting Values: 
 *  
 *  - Array Length: 
 *  
 *  - Traversing: looping through all the array's values
 *  
 *  - Scanning from a file: scanning values directly into an array
 * 
 * 
 * 
 */

import java.util.Scanner;
import java.io.File;

public class Notes19_Array_Basics {

	public static void main(String[] args) 
	throws Exception
	{
		
		/*
		 * Declaring and Instantiating empty arrays
		 * 
		 * Default values for 
		 *   int[] = 0
		 *   double[] = 0.0
		 *   boolean[] = false
		 *   char[] = 0  (null)
		 *   String[] = ""
		 * 
		 */

		// String[] with 10 empty strings
		String[] words = new String[10];
		
		// boolean[] with 5 false values
		boolean[] isCold = new boolean[5];
		
		
		
		
		
		/*
		 * Declaring and Instantiating filed arrays
		 * 
		 *  = { give values }
		 */

		// double[] with 8 pre-filled elements
		double[] averages = {2.4, 7, 4.9, 3.5, -3.2, 41, 2.3, 8};
		
		
		
		
		
		
		/*
		 * Getting and Changing Array Data
		 * 
		 * use the []s
		 */
		
		//from the words array above
		//place "hello" at index 3
		words[3] = "hello";
		System.out.println(words[3]);
		
		//get a substring of index 3
		System.out.println(words[3].substring(0,1));
		
		
		
		/*
		 * Array Length
		 * 
		 * .length NO PARENTHESIS!!!!
		 *         returns an int
		 *         
		 * .length is a PROPERTY, 
		 *         a value stored as part of the array.
		 *   
		 * .length() is a METHOD, 
		 *           a process that figures out the 
		 *           number of characters in a String
		 * 
		 * If you mix them up Eclipse WILL YELL AT YOU!!
		 * 
		 */
		
		
		
		//store the length into an integer
		int wordsLength = words.length;
		
		//print the length to the screen
		System.out.println("There are " + words.length + 
				" elements in the words array");
		System.out.println("There are " + averages.length + 
				" elements in the averages array");
		
		
		/*
		 * Traversing Arrays
		 * 
		 * looping through the array
		 */

		
		//print all the elements on separate lines
		for (int i = 0; i < averages.length; i++) {
			System.out.println(averages[i]);
		}
		
		
		
		//sum up all the values in an array
		double sum = 0.0;
		for (int i = 0; i < averages.length; i++) {
			sum += averages[i];
		}
		System.out.println("Sum of averages = " + sum);
		//find the average of the array above
		double average = sum / averages.length;
		System.out.println("Average of averages = " + average);
		
		
		
		//find max
		double max = Double.MIN_VALUE; //start low and replace with larger values
		for (int i = 0; i < averages.length; i++) {
			max = Math.max(max,  averages[i]);
		}
		System.out.println("Largest value in averages = " + max);
		
		
		double min = Double.MAX_VALUE;
		int minInt = Integer.MAX_VALUE;
		int maxInt = Integer.MIN_VALUE;
		
		
		/*
		 * Scanning an array in from a file
		 * 
		 * Note: The way you scan from a file depends
		 *       on how the file is set up.  This method
		 *       works with the files I will be giving you 
		 * 
		 */
		Scanner inFile = new Scanner(new File("notes19_input.txt"));
		
		
	}
		
}
