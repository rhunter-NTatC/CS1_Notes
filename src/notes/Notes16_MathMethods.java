package notes;

import java.util.Scanner;

/*
 * Math is a Java Class that has built in methods
 * that make calculating easier.
 * 
 * Here are the one's we'll be discussing.
 * 
 * For a complete list:
 * https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 * 
 * Method                     Input Types         Return Type
 *   Math.pow(<base>, <exp>)	int, double			double
 *   Math.min(<val>, <val>) 	int, double			depends on input
 *   Math.max(<val>, <val>)		int, double			depends on input
 *   Math.round(<val>)			double				int
 *   Math.ceil(<val>)			double				double
 *   Math.floor(<val>)			double				double
 * 	 Math.abs(<val>)			int, double			depends on input
 *   Math.log10(<val>)			int, double			double
 *   Math.sin(<val>)			int, double			double
 *   Math.cos(<val>)			int, double			double
 *   Math.tan(<val>)			int, double			double
 *   Math.toDegrees(<val>)		int, double			double
 *   Math.toRadians(<val>)		int, double			double
 *   Math.E						none				double
 * 	 Math.PI					none				double
 *   Math.random()				none				double
 *   Math.sqrt(<val>)			int, double			double
 *     The square root function
 */


public class Notes16_MathMethods {

	public static void main(String[] args) {
	
		Scanner inKey = new Scanner(System.in);
		
		/*
		 * Math.pow(<base>, <exp>)	int, double			double
		 */
		int x = 2, y = 3;
		System.out.println("2^3 power = " + Math.pow(x,  y));
		double z = Math.pow(2 + x,  4);
		System.out.println(z);
		
		/*
		 * Math.min(<val>, <val>) 	int, double			depends on input
		 * Math.max(<val>, <val>)	int, double			depends on input
		 * 
		 * Returns the larger or smaller of the 2 values
		 * 
		 * If the paramters are ints, then the return is an int
		 * otherwise it's a double
		 */
		System.out.println("The smaller of 2 and -5 is: " + Math.min(2,  -5));
		System.out.println("The larger of 2 and -5 is: " + Math.max(2,  -5));
		System.out.println("The smaller of 2 and -5 is: " + Math.min(2.0,  -5));
		
		//What if I have more than 2 things to compare?
		//nest the statements
		System.out.println("The smaller of 2, 9 and -5 is: " 
					+ Math.min(2, Math.min(9,  -5)));
		
		
		/*
		 * Math.round(<val>)		double				int
		 * rounds accordingly
		 * 
		 * Math.ceil(<val>)			double				int
		 * rounds up
		 * 
		 * Math.floor(<val>)		double				int
		 * rounds down
		 * 
		 */
		
		
		
		/*
		 * Math.abs(<val>)			int, double			depends on input
		 * 
		 * Absolute Value = it makes everything positive
		 * 
		 */
		
		
		/*
		 * Math.log10(<val>)		int, double			double
		 */
		
		
		
		/*
		 * Math.sin(<val>)			int, double			double
		 * Math.cos(<val>)			int, double			double
		 * Math.tan(<val>)			int, double			double
		 * Note: 
		 * 
		 * Math.toDegrees(<val>)	int, double			double
		 * Math.toRadians(<val>)	int, double			double
		 */
		
		
		
		/*
		 * Math.E					none				double
		 * Math.PI					none				double
		 * 
		 */
		System.out.println(Math.PI);
		
		
		/*
		 * Math.random()			none				double
		 */
		
		
		
		
		
		
	}
}
