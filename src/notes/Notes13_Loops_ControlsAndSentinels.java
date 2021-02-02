package notes;

import java.util.Random;
import java.util.Scanner;

/*
 * Notes Sentinels and Control
 * 
 * Sentinels
 * A loop that is stopped by some sort of scanner or random event.
 * The variable is waiting for and event so it can stop the loop.
 * 
 * 
 * Control Commands
 *   Commands that can change a loop's behavior.
 *   break; - stops the loop completely
 *   continue; - stops that iterations loop
 * 
 */


public class Notes13_Loops_ControlsAndSentinels {

	public static void main(String[] args) {
		
		
		/*
		 * break Examples
		 * 
		 */
		System.out.println("A loop from 1 to 10 the stopped at 7");
		int i = 1;
		while (i <= 10) {
			if (i == 7) {
				break;
			}
			System.out.print(i + "  ");
			i++;
		}
		
		
		System.out.println("\n\nAn infinite loop that uses an if to stop.");
		while (true) {
			if (i == 35) {
				break;
			}
			System.out.print(i + "  ");
			i++;
		}
		
		
		
		
		
		/*
		 * continue Examples
		 * 
		 */
		System.out.println("\n\nA loop that skips every fifth multiple.");
		i = 1;
		while (i <= 30) {
			if (i % 5 == 0) {
				i++;
				continue;
			}
			System.out.print(i + "  ");
			i++;
		}
		
		
		
		System.out.print("\n\nA loop that skips even random numbers.");
		i = 1;
		while (i <= 30) {
			int num = new Random().nextInt(10);
			System.out.print(num + "   ");
			if (num % 2 == 0) {
				i++;
				System.out.println();
				continue;
			}
			System.out.println(num);
			i++;
		}
		
		
		
		/*
		 * Sentinel Examples
		 * from user
		 * 
		 */
		System.out.println("\n\nThis loops until the user enters a 0.");
		//create a while loop with "true" in the condition.
		int input = -1;
		while (true) {
			System.out.print("Enter a number: ");
			input = new Scanner(System.in).nextInt();
			if (input == 0) {
				System.out.println("Goodbye");
				break;
			}
		}
		
		
		
		
		//this has 2 controls, a counter and an sentinel
		System.out.println("\n\nThis loops until the user enters a 0 or 10 inputs total.");
		input = -1;
		int count = 0;
		while (count < 10) {//loops 10 times
			System.out.print("Enter a number: ");
			input = new Scanner(System.in).nextInt();
			if (input == 0) {
				System.out.println("Goodbye");
				break;
			}
			count++;
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
