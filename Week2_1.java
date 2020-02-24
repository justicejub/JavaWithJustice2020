/**Week 2**/
// User input calculator,Boolean, if else,  While loops

import java.util.Scanner; //imports Scanner object

public class Week2_1 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in); //memorize: Scanner object

		System.out.println("Enter first number: ");
		int input1 = scan.nextInt(); //scans the next inputted integer
		System.out.println("Enter second number: ");
		int input2 = scan.nextInt(); //scans the next inputted integer
		
		int sum = input1 + input2;
		int diff = input1 - input2;
		int prod = input1 * input2;
		int div = input1 / input2;
		
		System.out.println(input1 + " + " + input2 + " = " + sum ); //concatination or combine print statements
		System.out.println(input1 + " - " + input2 + " = " + diff );
		System.out.println(input1 + " * " + input2 + " = " + prod );
		System.out.println(input1 + " / " + input2 + " = " + div );
		
		//** BOOLEAN **//
		boolean flag = true;
		boolean flag2 = false; //these are conditional boolean variables
		
		System.out.println();
		//** if and else **//
		
		int x = 5;
		int y = 5;
		
		//version1
		if (x > y){ // if CONDITIONAL STATE is true do whats inside the if statement
			System.out.println(x + " is greater than " + y);
		}
		
		

		//version 3
		if (x > y){ // if CONDITIONAL STATE is false ... it will continue to 
			System.out.println(x + " is greater than " + y);
		}
		else if (x > y){
			System.out.println(x + " is less than " + y);
		}
		else {
			System.out.println(x + " is equal to " + y);
		}
		
		
		// ** WHILE LOOPS** // 
		int i = 0;// 2
		
		while (i < 16) {
			System.out.print("*");
			i++; //increments the variable by +1
		}
		System.out.println();
		
		System.out.flush();
		System.out.println("test");
		
		//Try to make calculator run until a certain exit case is inputted

	}

}
