package notes;

/*
 * Notes on Operators
 * +  add
 * -  subtract
 * *  multiply
 *  / divide
 * %  modulus = The remainder of x / y
 * = this is a STORAGE command.  Take the right and store it in the left
 * 
 * Incrcmentor, raises or lowers a variable by 1
 * ++ raises it by 1
 * -- lowers it by 1
 * 
 * 
 * Unary Operators: combined shorthand
 * =+
 * =-
 * =*
 * =/
 * =%
 * 
 * 
 * Integer Division: DOES NOT ROUND!!!
 * It truncates the decimal: it just drops it.
 * 
 * 
 * 
 */

public class Notes04_Operators {

	public static void main(String[] args) {
		
		int x = 4, y = 7, z = 10;
		System.out.println(x + " " + y + " " + z);
		
		
		//operators
		z = z + 7;
		y = z - 3;
		System.out.println(x + " " + y + " " + z);
		x = z % y;
		System.out.println(x + " " + y + " " + z);
		
		//incrementors
		x++;
		y--;
		System.out.println(x + " " + y + " " + z);
		
		
		//unary operators
		x *= 2;  //x = x * 2
		y -= 2;
		z %= 5;
		System.out.println(x + " " + y + " " + z);
		
		y = y / z;  //5.5 but the integer drops (truncates) the decimal
		System.out.println(x + " " + y + " " + z);
		
		//don't forget to call your methods from the main method.
		newMethod();
		
		
	}
	
	//outside the main method
	//BUT inside the class
	public static void newMethod() {
		
	}
	
	
}
