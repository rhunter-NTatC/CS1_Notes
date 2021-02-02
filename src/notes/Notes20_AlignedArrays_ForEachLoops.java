package notes;

/*
 * Notes: Aligned Arrays and For Each Loops
 * 
 * 
 * Aligned Arrays:
 * 	Definition:
 * 
 * 	Usefulness:
 * 
 * 
 * 
 * 
 * For Each Loops:
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
		
		//find "Isaiah
		int indexIsaiah = -1;
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals("Isaiah")) {
				indexIsaiah = i;
			}
		}
		System.out.println("Isiah is at index " + indexIsaiah);
		System.out.println("He is " + age[indexIsaiah] + " years old");
		if (likesPink[indexIsaiah]) {
			System.out.println("He likes pink.");
		} else {
			System.out.println("He does not like pink.");
		}
		
		
		//print out everyone that likes pink
		System.out.print("People who like pink: ");
		for (int i = 0; i < likesPink.length; i++) {
			if (likesPink[i]) {
				System.out.print(name[i] + " ");
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
