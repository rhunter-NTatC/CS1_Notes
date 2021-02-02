package notes;

/*
 * Note over Data Types and their variables
 * 
 * int = and integer (No Decimals!!)  -2.14 billion < x < 2.14 billion
 * double = a decimal (floating points) -9 quinillion < x < 9 quintillion
 * boolean = true or false
 * 
 * 
 */

public class Notes03_DataTypes {
	
	public static void main(String[] args) {
		
		//declare and initialize just like Strings
		int numBoxes;  //an integer to store the number of boxes on my shelf
		numBoxes = 4;  //initializes numBoxed to 4
		double pi = 3.141597;  //a double to store pi
		boolean isRaining = false;  //a boolean to store if it's raining or not
		
		System.out.println(numBoxes);
		System.out.println();
		System.out.println(pi + "\n");
		System.out.println(isRaining);
		
		System.out.println(numBoxes + ""
				+ "" + pi);
		System.out.println(numBoxes + " not sure what this is for " + pi);
		
		
		numBoxes = 10;
		System.out.println(numBoxes + 17);
		
		//can declare and initialize multiple variables in one lin
		//BUT they must be the same data type
		int x = 1, y = 2, z = 3;
		String a = "hi", b = "bye";
		
	}
	
}
