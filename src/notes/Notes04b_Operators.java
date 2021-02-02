package notes;

/*
 * Notes: Operators
 * + add
 * - subtract
 * * multiply
 *  / divide
 * % modulus, the remainder AFTER division
 * 
 * 
 * Incrmentors
 * ++  adds 1
 * --  subtracts 1
 * 
 * Unary Operators:  Take the right and apply it to the left
 * +=
 * -=
 * *=
 *  /=
 * %=
 * 
 * 
 * 
 */


public class Notes04b_Operators {

	public static void main(String[] args) {
		
		//BASIC OPERATORS
		
		int x = 2, y = 17, z = 4;
		double a = 1.2, b = 3.4, c = 4.5;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", x = " + x + ", y = " + y + ", z = " + z);
		
		x = 4;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", x = " + x + ", y = " + y + ", z = " + z);
		x = y * z;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", x = " + x + ", y = " + y + ", z = " + z);
		x = 19;
		y = x % z;  // 19 / 4 is 4 remainder 3
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", x = " + x + ", y = " + y + ", z = " + z);
		
		
		//Integer Division.  NO DECIMALS!!!!!
		y = x / z; // 19 / 4 is 4 remainder 3
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", x = " + x + ", y = " + y + ", z = " + z);
		
		a = 19.0 / 4;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", x = " + x + ", y = " + y + ", z = " + z);
		
		
		//Incrementors (adds or subtracts 1)
		z++;
		y--;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", x = " + x + ", y = " + y + ", z = " + z);
		
		//UNARY operators
		b *= 2;  //multiply b by 2 and store it in b
		c -= 15;  //subtract 15 from c and store it in c
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", x = " + x + ", y = " + y + ", z = " + z);

		
		
		
	}

}
