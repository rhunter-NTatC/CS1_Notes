package notes;

 /*
  * Notes22 Methods Example #1
  * 
  * This simply illustrates the run 
  * progression (what's happening next).
  * No data is passed or returned.
  * 
  * Try to follow the logical progression
  *  
  */

public class Notes22_MethodsExample1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i++) {	
			start();
			next();
			for (int j = 0; j < 4; j++) {
				repeated();
			}
		}
	}
	
	
	public static void start() {
		System.out.println("Start");
	}
	
	public static void next() {
		System.out.println("   Next");
	}
	
	public static void repeated() {
		System.out.println("      Repeated");
		repeatedAgain();
		repeatedAgain();
	}
	
	public static void repeatedAgain() {
		System.out.println("         Repeated Again");
	}
	
	
}
