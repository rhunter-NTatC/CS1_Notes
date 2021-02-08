package notes;

/*
 * Arrays Basics
 * 
 * What is an array?
 * A collection of data.  All of the same type.
 * 
 * 
 * Definitions:
 *   Element = 1 data piece
 *   
 *   Immutable = we can't change the array itself.  We can elements, but not size or type of array.
 *   
 *   Index = location of each element (starts at 0 just like String index)
 * 
 * 
 * Indexing:  Same as with Strings.  Starts at 0
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
		 *   char[] = 0  
		 *   String[] = null  (a value that's technically nothing)
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
		double[] nums = {1.2, 3.4, 3.4, 6.0, 3.5, 3, 2, -2.9};
		
		
		
		
		
		
		/*
		 * Getting and Changing Array Data
		 * 
		 * use the []s
		 */
		
		//from the words array above
		//place "hello" at index 3
		words[3] = "hello";
		System.out.println("Index 3 = " + words[3]);
		
		//get a substring of index 3
		System.out.println(words[3].substring(1,4));
		
		
		
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
		//print the length to the screen
		System.out.println(words.length);
		System.out.println(words[3].length());
		
		
		//store the length into an integer
		int wordsLength = words.length;
		System.out.println(wordsLength);
		
		
		
		
		/*
		 * Traversing Arrays
		 * 
		 * looping through the array
		 */

		
		//print all the elements on separate lines
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 1 == 0.5) {
				System.out.println(nums[i]);
			}
		}
		
		
		
		//sum up all the values in an array
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("The sum of everything in nums = " + sum);
		//find the average of the array above
		double average = sum / nums.length;
		System.out.println("The average of nums = " + average);
		
		
		//find max 
		double max = Double.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		System.out.println("The max of nums = " + max);
		
		
		
		/*
		 * Scanning an array from a file
		 * 
		 * Note: The way you scan from a file depends
		 *       on how the file is set up.  This method
		 *       works with the files I will be giving you 
		 * 
		 * 
		 * REMEMBER!!!
		 * At the top: 
		 * 		import java.io.File;
		 * after public static void main(String[] args) and before {
		 * 		throws Exception
		 * The file:
		 * 		Must be in the ROOT PROJECT FOLDER!!!!
		 *
		 */
		Scanner inFile = new Scanner(new File("notes19a_input.txt"));
		
		//first number is how many elements there are
		int length = inFile.nextInt();
		
		//create the array
		double[] nums1 = new double[length];
		
		//loop through the array, scanning one at a time
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = inFile.nextDouble();
		}
		
		//Just to show you they're there
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
