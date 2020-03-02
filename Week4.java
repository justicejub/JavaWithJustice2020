//** WEEK 3 **//
// review hw, String methods continued,not(!), functions, interview problem - String manipulation
import java.util.Scanner;
public class Week4 {

	public static void main(String[] args) {
		// HW: Print out string with one char per line
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Input string: ");
		String input = scan.next();
		
		for (int i=0; i<input.length();i++){
			String curr = input.substring(i,i+1);
			System.out.println(curr);
		}
		
		//**String Methods cont..**//
		
		String hello = "hello";
		String sentence = "This is Java";
		
		//character at 
		char letter = hello.charAt(0); 
		char lastLetter = hello.charAt(hello.length()-1);
		System.out.println(lastLetter);
		
		//index of
		int place = sentence.indexOf('j');//returns -1 if not contained
		System.out.println(place);
		
		//equals
		String name1 = "Justice";
		String space = " ";
		String name2 = "Justice";
		
		if (name1 == name2){
			System.out.println("These names are equal");
		}
		if (name1.equals(name2)){
			System.out.println("No, they are actually equal");
			System.out.println(name1.equals(name2));
		}
	
		//To lowercase
		String capsName = "JUSTICE";
		String lowerName = "justice";
		String toLowerName = capsName.toLowerCase(); //switching all capital letters to lower case
		if (lowerName == toLowerName){ 
			System.out.println("EQUAL");
		}
		if (lowerName.equals(toLowerName)){
			System.out.println("now equal");
			
		}
		
		System.out.println();
		
		//** Interview Question **// - String Manipulation
		
		//Question: Write a method that returns the number of 
		//unique characters contained in a string. 

		//Example 1   Input: "CodeU"
		//            Output: 5
		//Example 2
		//		 Input "Google”  
		//		 Output: 4 
		String test = "Google";
		int uniqueCount = uniqueChars(test);
		System.out.print(uniqueCount);
	}

	
	//First method or function
	
	public static int uniqueChars(String inputStr){
		inputStr = inputStr.toLowerCase(); //keep caps in mind
		boolean isDup = false;
		int uniqueCount = 0;
		
		for (int i=0; i<inputStr.length();i++){
			isDup = false; 
			char currChar = inputStr.charAt(i);
			for (int j=i+1; j<inputStr.length();j++){
				char compareChar = inputStr.charAt(j);
				if (currChar == compareChar)
					isDup = true;
			}
			if (!isDup){
				uniqueCount++;
			}
		}
		return uniqueCount;
	}

}
