//Week 1: Printing, Primitive Types & Arithmetic Operators

import java.util.Scanner;
public class Week1 {

	public static void main(String[] args) {

		/**Printing**/
		
		System.out.println("hello world");
		System.out.print("justice");
		
		/**Primitive Types**/
		
		int x = 5;
		double y = 5.5;
		char z = 'a';
		
		/**Operators**/

		int num1 = 12;
		int num2 = 4;
		int sum = num1 + num2;
		int difference = num1 - num2;
		int division = num1 / num2;
		int multi = num1 * num2;
		
		double num3 = 10;
		
		double wrong = num2 / num3;
		
		System.out.println(sum);
		
		
		/**Snanner**/
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		System.out.print(input);
	}

}
