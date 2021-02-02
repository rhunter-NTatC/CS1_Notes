package notes;

/*
 * Notes: Do Loops, Counting and Accumulation
 * 
 * Do Loops  (Also called a Do-While loop)
 *   Just like a while loop, but the check
 *   is at the end.  This way it will ALWAYS
 *   run once.
 *   Parts:
 *      int i = 0;			//test variable
 *      do {				//do {   starts the loop
 *        code block
 *        i++;				//update test variable
 *      } while (i < 5);	//condition (With semicolon)
 * 
 * Counting:
 *   Tracking the number of times an
 *   event occurs during a loop.
 *   
 * Accumulation:
 *   Using a loop to add up (accumulate)
 *   a set of totals or events.
 * 
 * 
 */

public class Notes11_DoLoops_CountAndAccumulation {

	public static void main(String[] args) {
		
		//Do Loop examples
		//#1 - The condition will initially be true
		int i = 0;
		do {
			System.out.print(i + " ");
			i++;
			
		} while (i < 5);
		System.out.println();
		
		//#2 - The condition will initially be false
		i = 10;
		do {
			System.out.print(i + " ");
			i++;
			
		} while (i < 5);
		System.out.println();
		
		
		
		//Counting
		//requires a variable to keep track
		int count = 0;
		i = 0;
		while (i < 5) {
			count++;
			i++;
		}
		System.out.println("That looped " + count + " times.");
		
		
		count = 0;
		i = 127;
		while (i < 3457) {
			if (i % 7 == 0) {  //counts all multiples of 7
				count++;
			}
			i++;
		}
		System.out.println("There are " + count + " multiples of 7 between 127 and 3457.");
		
		
		
		//Accumulation
		//requires a variable to store the sum
		
		// adds all integers from 0 to 52
		int total = 0;
		i = 0;
		while (i < 53) {
			total += i;
			i++;
		}
		System.out.println("The sum of all integers from 0\nto 52 is " + total);
		
		// adds all even integers from 15 to 1036
		total = 0;
		i = 15;
		while (i < 1037) {
			if (i % 2 == 0) {
				total += i;
			}
			i++;
		}
		System.out.println("The sum of all even integers\nfrom 15 to 1036 is " + total);
	}
	
	
}
