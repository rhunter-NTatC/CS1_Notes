package notes;

import java.util.Scanner;

/*
 * Notes22 Methods
 * 
 * The entire idea of a method is to write code once and
 * use it as many times as necessary.  It's also useful to
 * simplify your code to larger generic steps that are worked
 * out in separate methods.
 * 
 * This discusses the...
 *   - Parts of a method header
 *   - Parameters
 *   - return types
 *   
 *   
 * Parts of this header:
 * public static double getAverage(int x, int y)
 * 
 * public static
 *    Access Modifiers. 
 *        Don't worry about this.  We'll discuss
 *        them in AP.  Just know they need to
 *        be there.
 *        
 * double
 *    Return Type.
 *        The type of information returned to
 *        wherever the method is called from.  This
 *        can be ANY type of data: int, String, char,
 *        int[] and literally any type or object.
 * 
 * getAverage
 *    Method Name.
 *        How you refer to the method.  It needs to 
 *        have no spaces and start with a lower case 
 *        letter.  Otherwise it can be almost anything.
 *        
 * (int x, int y)
 *    Parameters.
 *        This is the information sent to the method.  It
 *        can have as many or few as necessary.  They can
 *        be any data or object type.  For each, you are 
 *        declaring a variable to hold individual pieces 
 *        of data.
 *        Also, when calling this method, you must give it
 *        the correct data types in the correct order.
 */

public class Notes22_Methods {

	/* 
	 * This programs takes in two coordinates and prints a line
	 */
	public static void main(String[] args) {

		while(true) {
			
			getEquation();  //run getEquation methods
			
			System.out.println("\nWould you like to calculate another? (Y to continue): ");
			String input = new Scanner(System.in).nextLine().toLowerCase();
			if (input.charAt(0) != 'y') {
				break; //quit loop
			}
			
		}
		
		System.out.println("\nGoodbye");

	}

	
	public static void getEquation() {
		double x1 = getCoordinate("x1");	// get x1
		double y1 = getCoordinate("y1");	// get y1
		double x2 = getCoordinate("x2");	// get x2
		double y2 = getCoordinate("y2");	// get y2

		double slope = getSlope(x1, y1, x2, y2);	// get slope

		double yIntercept = getIntercept(x1, y1, slope);	// get y intercept

		printEquation(slope, yIntercept);	// print results
		
	}
	
	
	
	//method to return a single coordinate scanned from the keyboard
	public static double getCoordinate(String str) {
		System.out.print("Enter the coordinate for " + str + ": ");
		double coordinate = new Scanner(System.in).nextDouble();
		return coordinate;
	}

	

	//method that returns the slope between 2 points
	public static double getSlope(double x1, double y1, double x2, double y2) {
		return (y2 - y1) / (x2 - x1);
	}


	
	//method that returns the y intercept given a point and a slope
	public static double getIntercept(double x, double y, double slope) {
		return y - slope * x;
	}


	
	//prints the equation of a line in slope-intercept given a slope and yIntercept
	public static void printEquation(double slope, double intercept) {
		System.out.printf("The equation:  y = %.2fx + %.2f", slope, intercept);
	}


}
