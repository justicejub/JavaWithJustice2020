import java.util.Scanner;

public class Week4_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Input string: ");
		String input = scan.next();
		
		//substring
		String hello = "hello";
		String sentence = "This is Java";
		
		String segment = hello.substring(0,hello.length()-1);
		String segment2 = hello.substring(2);
		System.out.println(segment);
		
		//Assignment: Print out string w/ one char on a new line
		
		for (int i = 0; i<input.length();i++){
			String letter = input.substring(i, i+1); //gets each char in string
			System.out.println(letter); 
		}
		
		//**String methods cont..**//
		String name = "justice";
		
		//character at --> char when given index
		char letter1 = name.charAt(name.length()-1); //if out of bounds -> throw out of bounds error 
		System.out.println(letter1);
		
		// [nameOFString].indexOf()
		int place = name.indexOf('J'); //if char is not in the string --> -1 
		System.out.println(place);
		
		//equals
		String name2 = "just";
		String name3 = "just";
		if (name2==name3) //this for chars & primitive types aka numbers
			System.out.println("They are equal");
		if (name2.equals(name3)) //CORRECT
			System.out.println("They are equal!!");
		
		//toLowerCase & toUpperCase
		String name4 = "JUST";
		String name5 = "just";
		name4 = name4.toLowerCase(); //makes all capital letters in string to lower case
		name5 = name5.toUpperCase(); //vice versa
		
		if (name4.equals(name5)) 
			System.out.println("They are equal!!");
		
		//not (!) === negation
			boolean flag = false;
			if (!flag){
					//do Something
			}
		
		
			//** Interview Question **// - String Manipulation
			
			//Question: Write a method that returns the number of 
			//unique characters contained in a string. 

			//Example 1   Input: "CodeU"
			//            Output: 5
			//Example 2
			//		 Input "Google”  
			//		 Output: 4 
	
			String test = "test";
			int answer = uniqueChars(test);
			System.out.println(answer);
			
	}

	public static int uniqueChars(String inputStr){
		
		inputStr = inputStr.toLowerCase(); 
		int count = 0; 
		boolean isDup = false;
		for (int i = 0; i<inputStr.length();i++){
			char currentChar = inputStr.charAt(i);
			isDup = false;
			for (int j=i+1; j<inputStr.length();j++) {
				char compareChar = inputStr.charAt(j);
				if (currentChar == compareChar){
					isDup = true;
				}
			}
			if (!isDup)
				count++;	
		}	
		return count;	
	}
		

}
