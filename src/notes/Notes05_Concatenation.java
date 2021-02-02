package notes;

/*
 * Notes: Concatenation
 * The process of building a String from different pieces.
 * 
 * We connect the pieces with a +
 * 
 * 
 * 
 */

public class Notes05_Concatenation {

	public static void main(String[] args) {

		int x = 1, y = 2, z = 4;
		//It turns the variable into a String and then combines the Strings
		System.out.println("x = " + x); 
		//Because they are the same data type, they will add first and then turn into a String
		System.out.println(x + y);
		//1st it turns the x into a String 
		//2nd it combines x with the String literal "x = "
		//3rd it turns the y into a String
		//last it combines the y with the String literal "x = 1"
		System.out.println("x = " + x + y);
		//1st adds x and y
		//last combines the 3 with the String literal "x = "
		System.out.println("x = " + (x + y));
		
		String nameF = "Robert", nameL = "Hunter";
		System.out.println(x + y + " " + nameF + " " + z); //prints "3 Robert 4"
		
		
	}

}
