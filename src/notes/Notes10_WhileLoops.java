package notes;

/*
 * Notes: While Loops
 * 
 * All Loops need 3 things
 *   test variable: This is what the condition is watching
 *   test condition: some to check each iteration
 *   variable update: you need to change the test variable IN the code block
 *   
 * Basically:
 *   As long as the condition is true
 *   the code block will keep looping
 * 
 * 
 * Parts:
 *   int i = 0;     	//declare test variable
 *   while (i < 5){		//test condition
 *      				//code block
 *      i++;			//variable update
 *   }
 * 
 * Note:
 *   i is normally used as a counter becuase it
 * 
 * 
 */

public class Notes10_WhileLoops {

	public static void main(String[] args) {
		
		
		//create test variable
		int i = 0;
		
		//Lets create while loops to create the following items
		System.out.println("Print the numbers 0 to 10");
		while (i <= 10) {
			System.out.print(i);
			i++;
		}
		
		
		
		System.out.println("\n\nPrint the numbers 10 to -5 with spaces");
		int j = 10;
		while (j > -6) {
			System.out.print(j + " ");
			j--;
		}
		
		
		
		
		System.out.println("\n\nPrint the even numbers from 0 to 10 with spaces.");
		i = 0;
		while (i < 11) {
			System.out.print(i + " ");
			i += 2;
		}
		
		
		
		
		
		
		System.out.println("\n\nPrint the even number from 0 to 10 with spaces.");
		System.out.println("BUT use an if statement to remove the odds.");
		i = 0;
		while (i < 11) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		
		
		
		
		
		
		System.out.println("\n\nPrint the multiples of 3 between 5 and 23 on different lines");
		i = 5;
		while (i <= 23) {
			if (i % 3 == 0){
				System.out.print(i + " ");
				
			}
			i++;
		}
		
		
		
		
		
		System.out.println("\n\nPrint the numbers 0 to 10 with spaces and commas");
		i = 0;
		
		while (i < 10) {
			System.out.print(i + ", ");
			
			i++;
		}
		System.out.print("10");
		
		
		
		
	}
	
}
