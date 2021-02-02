package notes;

import java.util.Scanner;

//Random Objects need this import
import java.util.Random;

/*
 * Notes Random Object
 * 
 * An object (think of it as a variable) that
 * has methods to create "pseudorandom" numbers.
 * 
 * 
 * Methods
 *   nextInt() - gets an random integer from all possibles -2.14 bill to +2.14 bill
 *   nextInt(<int>) - gets a random int from 0 to (but not including) the parameter
 *   nextDouble() - gets a random double from 0 to (but not including) 1
 * 
 * 
 * Things you'll need to know
 *   Scope - how many numbers to choose from?
 *   Starting Number - what is the first number?
 * 
 * 
 * 
 */



public class Notes12_RandomObjects {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		//declaring a random Object
		//
		Random rand = new Random();
		
		
		//nextInt
		int num1 = rand.nextInt();
		System.out.println(num1);
		
		
		
		//nextInt(<int>)
		int num2 = rand.nextInt(10); //random num 0 to 9
		System.out.println(num2);
		int i = 0;
		while (i < 50) {
			num2 = rand.nextInt(10); //random num 0 to 9
			System.out.println(num2);
			i++;
		}
		
		//using a user's input
//		System.out.print("Enter an integer: ");
//		int input = inKey.nextInt();
//		num1 = rand.nextInt(input);  //number from 0 to (but not including) input
//		System.out.println(num1);
		
		
		
		
		//nextDouble()
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble());
		
		
		//Using inputs to find a random number in a range
		//1st get the min and max
		System.out.print("Enter the minimum number: ");
		int min = inKey.nextInt();
		System.out.print("Enter the maximum number: ");
		int max = inKey.nextInt();
		//2nd use those to find your scope
		int scope = max - min + 1;
		
		
		//3rd create a random number
		//if you want, put it in a loop!
		i = 0;
		while (i < 50) {
			num2 = rand.nextInt(scope) + min; 
			System.out.println(num2);
			i++;
		}
		
		/* 
		 * If you don't know which is bigger?
		 * Use: 
		 *    Math.abs(<value>) - returns the absolute value (makes it positive)
		 *    Math.min(<value>, <value>) - returns the lower of 2 values
		 */
		System.out.print("Enter an integer: ");
		int x = inKey.nextInt();
		System.out.print("Enter a different integer: ");
		int y = inKey.nextInt();
		System.out.print("Enter a positive integer less than 100: ");
		int numTimes = inKey.nextInt();
		
		//scope
		scope = Math.abs(x - y) + 1;
		min = Math.min(x,  y);
		i = 0;
		while (i < 50) {
			num2 = rand.nextInt(scope) + min; 
			System.out.println(num2);
			i++;
		}
		
		
		
		
	}
	
}
