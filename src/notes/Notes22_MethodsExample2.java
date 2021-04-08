package notes;

/*
 * Notes22 Methods Example #2
 * 
 * This is the exact same progression as
 * example #1.  Now it's passing an integer
 * around.
 * 
 * Try to follow the logical progression
 *  
 */

public class Notes22_MethodsExample2 {

	public static void main(String[] args) {
		int x = 10;
		for (int i = 0; i < 7; i++) {
			x = start(x);
			x = next(x);
			for (int j = 0; j < 4; j++) {
				x = repeated(x);
			}
		}
	}

	public static int start(int num1) {
		num1 *= 5;
		System.out.println("   Start num1 = " + num1);
		return num1;
	}
	
	public static int next(int num2) {
		num2 -= 2; 
		System.out.println("      Next num2 = " + num2);
		return num2;
	}
	
	public static int repeated(int num3) {
		num3 += 5;
		System.out.println("         Repeated num3 = " + num3);
		num3 = repeatedAgain(num3, (int) (num3 * 1.8) );  
		num3 = repeatedAgain(num3, (int) (num3 * 1.8) );
		return num3;
	}
	
	public static int repeatedAgain(int num4, int num5) {
		int num6 = num5 - num4;
		System.out.println("            Repeated Again num6 = " + num6);
		return num6;
	}
	
	
}
