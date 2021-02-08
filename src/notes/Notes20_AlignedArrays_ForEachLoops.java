package notes;

/*
 * Notes: Aligned Arrays and For Each Loops
 *
 * 
 */
public class Notes20_AlignedArrays_ForEachLoops {

	public static void main(String[] args) {
		
		/*
		 * Aligned Arrays
		 * 	Definition: 
		 * 		Arrays with information at the same index refers
		 * 		to the same thing
		 * 
		 * 	Usefulness:
		 * 
		 * 
		 * 
		 * 3 arrays that store a person's name, 
		 *   age and whether they like pink or not. 
		 */
		String[] name = {"Ethan", "Sarah", "Anthika", "Isaiah", "Amy"};
		int[] age = {3, 25, 85, 32, 12};
		boolean[] likesPink = {true, true, false, false, true};
		
		/*
		 * How do I use these?
		 * 
		 * 1 - search throguh 1 array looking for something
		 * 2 - use that items index, to get info in other arrays
		 * 
		 */
		
		//find "Isaiah" and print out his data
		int indexIsaiah = 0;
		for(int i = 0; i < name.length; i++) {
			if (name[i].equals("Isaiah")) {
				indexIsaiah = i;
			}
		}
		System.out.println("Isaiah is at index " + indexIsaiah);
		System.out.println("Isaiah is "+ age[indexIsaiah] + " years old.");
		if (likesPink[indexIsaiah]) {
			System.out.println("Isaiah likes pink.");
		}
		else {
			System.out.println("Isaiah does not like pink.");
		}
		
		//print out everyone that likes pink
		//search through likesPink for true, and 
		//print the name at that index
		for(int i = 0; i < likesPink.length; i++) {
			if(likesPink[i]) {
				System.out.println(name[i] + " likes pink!");
			}
		}
		
		/*
		 * For Each Loops
		 * 		Quick ways to go through lists
		 * 		goes in index order
		 * 
		 * Pros:
		 * 		Very efficient for the computer
		 * 
		 * Cons:
		 * 		DOES NOT keep track of index
		 * 		DO NOT use to change information
		 */
		System.out.println();
		for (String str : name) {
			System.out.println(str);
		}
		
		
	}
	
}
