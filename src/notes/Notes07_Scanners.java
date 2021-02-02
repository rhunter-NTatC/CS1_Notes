package notes;

/* 
 * Necessary import statements
 *    These are the libraries Java needs to include in order
 *    to understand the methods and commands you're using
 */
import java.util.Scanner; //for all Scanners
import java.io.File;  //is so it can read the File

/*
 * Notes07: Scanners
 * 
 * This discusses scanning from the keyboard &
 *    scanning from a file
 *    
 * File Placement:
 *    The file must be placed in the
 *    ROOT PROJECT FOLDER.  Otherwise, you'll 
 *    need to put the full file path.
 *    - Right click the project folder
 *    - Choose New ==> File 
 *    - name it according to the Lab
 *       DONT FORGET the .txt
 *    - Then copy and paste whatever data the
 *       file needs.
 *    - Be sure to save EVERY time you change it.
 *       The program reads the last saved version.
 * 
 * 
 */




public class Notes07_Scanners {

	public static void main(String[] args) 
	//after public static...  BUT BEFORE the {
	throws Exception
	{
		
		/*
		 * DECLARING and INITIALIZING
		 * 
		 * Only do this 1 time. Then you can use 
		 *    the variable name as much as you need.
		 */
		Scanner inKey = new Scanner(System.in);//declares a keyboard scanner
		
		//scan from file
		Scanner inFile = new Scanner(new File("input.txt"));//declare a file scanner
		
		
		/* 
		 * Scanning from a keyboard
		 * 
		 * Methods:
		 *   next() grabs the next String.  Stops at a space
		 *     only a single word
		 *   nextInt(): grabs the next integer
		 *   nextDouble(): grabs the next Double
		 *   nextBoolean(): grabs the next boolean
		 *   nextLine(): This grabs an entire line
		 *      up to a return
		 *   
		 * 
		 * Burning a line:
		 *   
		 * 
		 * Prompting the user:
		 *   Telling the user what you want or need
		 * 
		 */
		
		System.out.print("Enter you name: ");
		String name = inKey.next();
		System.out.println("Hello " + name + ", I'm Hal!");
		
		System.out.print("Enter the height of the square: ");
		double height = inKey.nextDouble();
		double area = height * height;
		System.out.println("The area of that square: " + area);
		
		
		inKey.nextLine(); //burning a line
		System.out.println("Enter you favorite quote: ");
		String quote = inKey.nextLine();
		System.out.println(quote);
		
		
		
		//burn a line
		
		
		
		
		/* 
		 * Scanning from a file
		 * 
		 * Cursor: You MUST scan throguh it in order!!!
		 * 
		 * 
		 */
		int num1 = inFile.nextInt();
		int num2 = inFile.nextInt();
		int num3 = inFile.nextInt();
		int num4 = inFile.nextInt();
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
		
		inFile.nextLine();
		String line = inFile.nextLine();
		System.out.println(line);
		
		/*
		 * What's the difference between using a print
		 * and printf when prompting the user?
		 */
		
		
	}
	
	
}
