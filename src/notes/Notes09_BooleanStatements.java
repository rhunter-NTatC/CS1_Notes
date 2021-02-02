package notes;

import java.util.Scanner;

/*
 * NOTES:
 * Examples of complex boolean arrangements.
 * 
 * 
 */

public class Notes09_BooleanStatements {
	
	public static void main(String[] args) {
		
		boolean isOctober = true, isApril = false;
		//basic ifs with booleans
		if (isOctober) {
			System.out.println("It must be October.");
		}
		else if(isApril) {
			System.out.println("It must be April.");
		}
		else {
			System.out.println("Not sure what month it is.");
		}
		
		
		
		
		//&& and || with booleans
		if (isOctober && isApril) {
			System.out.println("This will never run.");
		}
		else if(isOctober || isApril) {
			System.out.println("This happens 1 of 6 times.");
		}
		else {
			System.out.println("Not sure what month it is.");
		}
		
		
		
		
		
		//! with booleans
		if (!isOctober) {
			//!true
			//false
			System.out.println("It must not be October.");
		}
		else if(!isOctober || !isApril) {
			//!true   ||   !false
			//false   ||   true
			System.out.println("Will this one ALWAYS be true?");
		}
		else {
			System.out.println("This line will never print.");
		}
		
		
		
		
		
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		double input = inKey.nextDouble();
		if (input >= 50 && input <= 100) { //NO!!!  50 <= input <= 100
			System.out.println("Input is bewteen 50 and 100 inclusive.");
		}
		else if (input < 0 || input > 500) {
			System.out.println("Input is not between 0 and 500 inclusive");
		}
		else if (input > 0 && input < 50 && input % 2 == 0) {
			System.out.println("It's even and between 0 and 50 exclusive");
		}
		else {
			System.out.println("Everything else.");
		}
		
		
		
		
		
		System.out.print("Enter an integer: ");
		input = inKey.nextInt();
		System.out.print("Enter either \"true\" or \"false\": ");
		boolean inputBool = inKey.nextBoolean();
		if (input > 0 && input % 3 == 0 && !inputBool) {
			System.out.println("input is a positive multiple of 3 and it's false.");
		}
		else if (input < 0 && input % 9 == 0 && inputBool) {
			System.out.println("Input is a negative multiple of 9 and it's true.");
		}
		else if (input == 0) {
			if (inputBool) {
				System.out.println("They enterd 0 and true.");
			}
			else if(!inputBool) {
				System.out.println("They entered 0 and false.");
			}
			
		}
		else {
			System.out.println("Everything else.");
		}
		
		
		
		
		
		
	}
	

}
