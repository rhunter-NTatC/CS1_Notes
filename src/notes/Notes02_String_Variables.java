package notes;

/*
 * Notes over String Variables
 * 
 * Think of a variable as a shoe box.  It is nothing
 * more than a container of information.
 * This is NOT like your algebra class where a
 * variable can be a range of things.
 * 
 * String: is simply text.  Even if it holds a number.  That number
 * is text.
 * 
 */
public class Notes02_String_Variables {

	public static void main(String[] args) {
		
		//declare the variable
		//make the shoebox
		String greeting; //a String variable named greeting.
		//initialize: give it its first (initial) value
		greeting = "Hello Everybody";
		
		
		//I can do those 2 things in 1 line.
		String greeting2 = "We the people of the united state of america .......";
		
		//printing a String
		System.out.println(greeting + " " + greeting2);
		System.out.println(greeting2);
		
		/* 
		 * String Variable: is JUST the variable, not the text it holds.  
		 *      (Refers to the shoebox)
		 *      
		 * String Literal: The actual text between the quotes " ".  Literally
		 * 		the text the variable holds
		 */
		
	}
	
}
