package notes;

/*
 * String Methods
 * 
 * method name						  Return Type
 *   length()							int
 *   trim()								String
 *   substring(<int>)					String
 *   substring(<int>, <int>)			String
 *   toUpperCase()						String
 *   toLowerCase()						String
 *   indexOf(<String>)					int
 *   indexOf(<String>, <int>)			int
 *   lastIndexOf(<String)				int
 *   equals(<object>)					boolean
 *   equalsIgnoreCase(<String>)			boolean
 * 
 * 
 */

public class Notes17_StringMethods {

	public static void main(String[] args) {
	
		String name = "Robert", city = "Coppell", food = "hamburger";
		
		/*
		 * .length()
		 * Task:
		 *   States how many characters are in
		 *   the String.  SPACES count and ALL
		 *   punctuation.
		 * 
		 * Return Type: 
		 *   int
		 */
		System.out.println(".length() examples");
		System.out.println(name.length());
		int length = city.length();
		System.out.println("the lenght of city is: " + length);
		
		
		/*
		 * .trim()
		 * Task:
		 *   Removes all spaces at the beginning or
		 *   end of a string.  Useful for "trimming"
		 *   user inputs
		 * 
		 * Return Type: 
		 *   String
		 */
		System.out.println("\n.trim() examples");
		System.out.println("    Hello There    ".trim() + "!");
		
		
		
		/*
		 * .substring(<int>)
		 * .substring(<int>, <int>)
		 * Task:
		 *   grabs a piece of a String.  Useful for
		 *   rebuilding strings, or looking for things
		 *   inside of a string.
		 *   
		 *   .substring(<int>) grabs everything from that
		 *   index to the end
		 *   
		 *   .substring(<int>, <int>) grabs everything from 
		 *   the first int up to BUT NOT INCLUDING
		 *   the second int
		 *      
		 * Indexing:
		 *   "Robert"
		 *    012345
		 * 
		 * Return Type: 
		 * 	 String
		 */
		System.out.println("\n.substring() examples");
		System.out.println("Robert".substring(2));
		System.out.println("Robert".substring(1, 5));
		
		String name2 = "hunter";
		String name3 = name2.substring(0, 1).toUpperCase()
				     + name2.substring(1);
		System.out.println(name3);
		
		
		
		
		
		/*
		 * .toUpperCase()
		 * .toLowerCase()
		 * Task:
		 *   Makes everything upper or lower case
		 * 
		 * Return Type: 
		 *   String
		 */
		System.out.println("\n.toUpperCase() & toLowerCase() examples");
		String hey = "HELLO!!!";
		System.out.println(hey.toLowerCase());
		System.out.println("no way!!".toUpperCase());
		
		
		/*
		 * .indexOf(<String>)
		 * .indexOf(<String>, <int>)
		 * .lastIndexOf(<String>)
		 * Task:
		 *   .indexOf(<String>)
		 *   .indexOf(<String>)
		 *   .lastIndexOf(<String>)
		 * 
		 * Return Type: 
		 *   int
		 */
		System.out.println("\n.indexOf() examples");
		
		
		
		/*
		 * .equals(<Object>)
		 * .equalsIgnoreCase(<String>)
		 * Task:
		 *   We can't use == on Strings
		 * 
		 * Return Type: 
		 *   boolean
		 */
		System.out.println("\n.equals() examples");
		String x = "hi", y = "hi", z = "HI";
		
		//equals examples
		if (x.equals(y)) {
			System.out.println("#1 x == y");
		}
		if (x.equals(z)) {
			System.out.println("#2 x == z");
		} else {
			System.out.println("#2 x != z");
		}
		
		//ignore case examples
		if (x.equalsIgnoreCase(z)) {
			System.out.println("#3 x == z");
		} else {
			System.out.println("#3 x != z");
		}
		
		//Not equals example
		if (!x.equalsIgnoreCase("quit")) {
			System.out.println("#4 the ! flipped it!!");
		} else {
			System.out.println("#4 the ! did not flip it!!");
		}
		
		
		
		
		
		
		
		
	}
}



















