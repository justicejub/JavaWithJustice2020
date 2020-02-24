/**Week 2**/
// User input calculator,Boolean, if else,  For/While loops 

import java.util.Scanner;
public class Week2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please input first number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Please input second number: ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		int diff = num1 - num2;
		int div = num1 / num2;
		int prod = num1 * num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + diff);
		System.out.println(num1 + " / " + num2 + " = " + div);
		System.out.println(num1 + " * " + num2 + " = " + prod);
		
		
		
		//*** if & else statement ***//
		int x = 5;
		int y = 5;	
		
		//1
		if (x > y){
			System.out.println(x + " is greater than " + y);
		}
		
		//2
		if (x < y)
			System.out.println(x + " is less than " + y);
		else 
			System.out.println(x + " is not less than " + y);
		
		//3
		if (x < y){
			System.out.println(x + " is less than " + y);
		}
		else if (x > y){
			System.out.println(x + " is greater than " + y);
		}
		else {
			System.out.println(x + " is equal to " + y);
		}
		
		System.out.println("-----");
	
		//** BOOLEAN **// 
		boolean flag = false;
		boolean condition = false;
		
		if (flag){
			System.out.print("This will print if true");
		}
		else 
			System.out.println("This will print if false");
		
		//** While Loops **//
		int count = 0;
		while (count < 10){
			System.out.print("*");
			count++;
		}
		System.out.println();
		
		//** For Loop **//
		int max = 10;
		int min = 0;
		for (int i = 0; i<max;i++){
			System.out.print("*");
		}
		System.out.println();
	}

	
	// Calculator with while and for loops??
}
