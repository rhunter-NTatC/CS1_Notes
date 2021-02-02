package notes;

/*
 * Notes: Data Types - declaring and initializing
 * 
 * int: any integer -2.4 billion < x < 2.4 billion  (32bit)
 * long: and integer -1.9 quintillion < x < 1.9 quintillion  (64bit)
 * double: decimals: +/- 16 numbers with a decimal in there somewhere (64 bit)
 * boolean: true or false
 * 
 * 
 * 
 */

public class Notes03b_DataTypes {

	public static void main(String[] args) {
		
		//declare int
		int numApples;
		double pi;
		//initialize
		numApples = 7;
		pi = 3.14159;
		
		//declare and initialize in one line
		int numTrees = 4;
		double gpa = 3.5;
		double sample = numTrees + gpa;
		boolean isRaining = false;
		
		System.out.println("There are " + numTrees + " trees.");
		System.out.println(sample);
		//declare and initialize multiple variables on 1 line.
		//They MUST be the same data type
		int x = 4, y = 5, z = 6;
		boolean isTrue = false, isHot = true, isCold = false;
		
	}
	
}
