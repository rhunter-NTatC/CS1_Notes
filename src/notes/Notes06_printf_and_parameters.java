package notes;

/*
 * Notes: printf() and method parameters
 */

public class Notes06_printf_and_parameters {

	public static void main(String[] args) {
		
		/* printf()
		 * 
		 * format for a flag: only the % and conversion character are necessary
		 *     %[flags][width][.precision]conversion-character
		 * 
		 * Conversion Characters
		 * d	: decimal integer (int, long)
		 * 		  In this case, decimal stands for 10 as in base 10
		 * 		  There's also binary (base 2), octal
		 * f	: floating-point number (float, double)
		 * c	: char – Capital C will uppercase the letter
		 * s	: string – Capital S will uppercase all letters in the string
		 * n	: newline – printf() specific newline character- use %n instead of \n 
		 * %%	: Use this to print a percent (or \% works as well).  Otherwise it 
		 *		  expects a variable.
		 * 
		 * Width
		 * This specifies the minimum number of characters to be printed.  
		 * It will print more if the variable is longer.  This is very 
		 * useful in lining up numbers and text.
		 * 
		 * 
		 * Flags:
		 * -	: left-justify the variable (default is to right-justify)
		 * +	: adds a plus (+) or minus (-) to the numerical value 
		 * 	 	  (all negatives get a minus)
		 * 0	: forces all values to be zero-padded (add zeros to left of number) 
		 * 		  (default is blanks)
		 * ,	: adds commas to large numbers (numbers >= 1,000)
		 *  	: ¬space will display a minus sign if negative or space if positive
		 * 
		 */
		
		int x = 4, y = 234;
		String name = "Robert";
		double gpa = 2.56787678;
		System.out.printf("%s is in %dth grade with a gpa of %.3f%n", name, x, gpa);
		
		//example with width modifier
		//example with function or formula in variable section
		System.out.printf("%8d%8d%8d%n", x, x, y);
		System.out.printf("%8d%8d%8d%n", y, x, x);
		System.out.printf("%8d%8d%8d%n%n", x, x * y, x);
		
		//- flag for the left justified
		System.out.printf("%-8d%-8d%-8d%n", x, x * -1, y);
		System.out.printf("%-8d%-8d%-8d%n", y, x, x);
		System.out.printf("%-8d%-8d%-8d%n", x, x * y, x);
		
		
		
		/*
		 * PARAMETERS
		 * You can send variables to your methods.
		 * They go in the parenthesis
		 */
		printGreeting(name);
		printGreeting("Isaiah" + " and " + "Roger Ramjet");
		printRectangleArea("#1", 2.453, 8.295394);
	}
	
	//go outside the main method for all customs.
	public static void printGreeting(String n) {
		System.out.printf("Hello, my name is %s.%n", n);
	}
	//example with multiple parameters
	public static void printRectangleArea(String name, double base, double height) {
		System.out.printf("Rectangle %s with a base of %.2f and height of %.2f %nhas an area of %.2f%n", name, base, height, base * height);
		
	}
	
	
}
