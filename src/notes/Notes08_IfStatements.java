package notes;

import java.util.Scanner;

/*
 * IF STATEMENTS
 * 
 * This includes
 *   boolean operators:
 *   if
 *   else if
 *   else
 *   .equals()  for Strings
 *   
 * Boole
 *   The guy who in the 1800's spent his life studying true/false algebra
 */

public class Notes08_IfStatements {

	public static void main(String[] args) {
		
		int x = 5, y = 10;
		boolean isMP1 = true;
		Scanner inKey = new Scanner(System.in);
		/*
		 * Condition
		 *   A statement that boils down to 
		 *   true or false
		 *   
		 * 
		 * Conditional Operators List
		 *   >  greater than
		 *   <  less than
		 *   >=
		 *   <=
		 *   ==  checks if they are equal
		 *   !=  not equal
		 *   &&  and  Both the left and right are true
		 *   ||  or  either the left or right are true
		 * 
		 * 
		 * Precedence: Order of Operations
		 *   
		 */
		
		//basic if statement
		//it MUST have an if.  else if and else are optional
		//if must come first
		//else must come last.
		if (x == 5) { //NO SEMICOLON
			System.out.println("It's a fiver");
		}
		else if (x < y) {
			System.out.println("x < y");
		}
		else { //no condition  (catch all)
			System.out.println("It's else");
		}
		
		//multiple if's, they're separate statements
		if (x == 5) { //NO SEMICOLON
			System.out.println("It's a fiver");
		}
		if (x < y) {
			System.out.println("x < y");
		}
		else { //no condition  (catch all)
			System.out.println("It's else");
		}
		
		
		
		
		
		//If's with scanners
		//get input
		System.out.print("Gimme a number: ");
		int num1 = inKey.nextInt();
		if (num1 == x * y - 1) {
			System.out.println("What did you do?");
		}
		else if (num1 == 15) {
			System.out.print("Who do you like best... Wolverine or Deadpool? (enter 1 or 2)");
			int z = inKey.nextInt();
			if (z == 1) {
				System.out.println("Knives out!");
			}
			else if (z == 2) {
				System.out.println("Oh you naughty you!");
			}
		}
		else if (num1 == 4 || num1 == 7) {
			System.out.println("Pththththththth!!!!!");
		}
		else if (num1 > 1000000) {
			System.out.println("Whoah there nelly!!!!!");
		}
		else if (num1 >= 100 && num1 <201 ) { //between 100 and 200 inclusive
			System.out.println("In the 100's!!!!!");
		}
		else if (num1 < 0 || num1 > 1000) {  //outside 0 and 1000 exlusive
			System.out.println("Outside");
		}
		else {
			System.out.println("Nope");
		}
		
		//using a boolean variable
		
		
		//Strings have a method to compare them
		//.equals()
		//String.equals(String)
		System.out.print("Enter the password");
		String password = inKey.next();
		if ("Inferno".equals(password)) {
			System.out.println("Your in!!");
		}
		else if ("password".equals(password)) {
			System.out.println("Worst password ever!!");
		}
		else {
			System.out.println("Go away...");
		}
		
		
		//or you can use variables
		
		
		
		
		
		//Inclusive ranges
		
		
		
		
		
		
	}
	
	
	
	
	
}
