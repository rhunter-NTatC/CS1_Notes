package notes;

/*
 * Notes: printf() and method parameters
 * formatted print statement.
 */

public class Notes06b_printf_and_parameters {

	public static void main(String[] args) {
		
		/* 
		 * RULES FOR printf()
		 * 
		 * format for a delimiter: only the % and conversion character are necessary
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
		
		//prints "Robert is in 4th grade with a gpa of 2.568"
		System.out.printf("%s is in the %dth grade with a gpa of %.1f%n", 
				name, x, gpa);
		
		/* 
		 * Example with width modifier
		 * useful for spacing lists
		 */
		System.out.printf("%8d %8d %8d%n", x, y + 5, x);
		System.out.printf("%8d %8d %8d%n", x, x * y, x);
		System.out.printf("%8d %8d %8d%n", y, x, x);
		
		/*
		 * FLAGS
		 */
		System.out.printf("%-8d %-8d %-8d%n", x, y + 5, x);
		System.out.printf("%08d %08d %08d%n", x * y, y + 5, x);
		System.out.printf("%-8d %-8d %-8d%n", x * x * x, y + 5, x);
		
		System.out.printf("%,d%n", x * x * x * x * x * x * x * x * x * x * x);
		
		/*
		 * PARAMETERS
		 * You can send variables to your methods.
		 * They go in the parenthesis
		 */
		example1("Robert");
		example2(name, x, gpa);
	}
	
	//Remember: Go outside the main method for all custom methods
	
	//Example: only one parameter
	public static void example1(String name) {
		System.out.printf("Hi my name is %s!%n", name);
	}
	public static void example2(String name, int x, double gpa) {
		System.out.printf("%s is in the %dth grade with a gpa of %.1f%n", name, x, gpa);
	}
	
	
	//Example: multiple parameters
	

	
}
