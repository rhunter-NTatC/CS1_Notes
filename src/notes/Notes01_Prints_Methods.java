package notes; //states what package it's in

/* Notes over Print Statments and Methods
 * 
 * Terms
 * Comment - Un-compiled bit of text. Solely to describe what's going on
 * Class - A Blueprint
 * Method - Set of statements that perform a specific task.
 * Access Modifiers (public and static) how other classes interact with your class
 * Return type (void) what the computer sends back
 */

public class Notes01_Prints_Methods {
	//main method - all programs start here
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");//prints a return after the String
		System.out.print("Hello World!\n");// \n is escape sequence for the return key
		System.out.println("Hello World!\n");
		
		printOuch();//run the printOuch() method
		
	}
	
	
	//custom method that prints ouch
	public static void printOuch() {
		System.out.println("OUCH!!!");
	}
	
}
