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
public class Notes05b_Concatenation {

	public static void main(String[] args) {
		
		int x = 1, y = 2, z = 3;
		//It turns the x into a String and then smooshes them together
		System.out.println("x = " + x);
		//since they're both ints
		//first it adds
		//then it changes it to a String a prints
		System.out.println(x + y);
		//1st turns x into a String
		//2nd smooshes "x = " and "1"
		//3rd changes y into a String
		//last Smooshes "x = 1" and "2"
		System.out.println(x + y + " hello " + z + z);
		//Just like above EXCEPT it does parenthesis first!
		System.out.println("x = " + (x + y));
		
		String name = "Robert", greeting = "Hello, my", greeting2 = " name is ";
		System.out.println(greeting + greeting2 + name + ". I am " + 
				(z * y) + " years old.");
		
		
		
		
		
	}
	
}
