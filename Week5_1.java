//WEEK 5
// introduce functions , review strings methods, interview like question - string manipulations 
import java.util.Scanner;

public class Week5_1 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		//functions 
		int x = 5;
		int y = 6;
		System.out.println("Input x: ");
		x = scan.nextInt();
		System.out.println("Input y: ");
		y = scan.nextInt();
		
		int max = getMax(x,y);
		int max2 =  Math.max(x, y);
		System.out.println(getMax(x,y) + "   " + max2);
		
		
		//String method review
		
		//length
		String test = "test";
		int a = test.length();
		
		//character at a certain index
		char b = test.charAt(0); //first char in string 
		char lastChar = test.charAt(test.length()-1);
		
		//index of certain character
		int c = test.indexOf('e'); //returns 1
		int d = test.indexOf('j'); // return -1 
		
		int e = indexOf(test,'j');
		System.out.println(e);
		
		System.out.println();
		
		String res = reverseStr(test);
		System.out.println(res);
	}
	
	//
	static int getMax(int num1, int num2){ //this is function/method, format: [return type] [function name](parameters)
		
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
	
	//creating our own indexOf function -> index of input character & string 
	static int indexOf(String str, char c){
		for (int i=0;i<str.length();i++){
			if (str.charAt(i) == c){
				return i;
			}
		}
		return -1; //char was not found
			
	}
	
	// reverse a string -> INPUT: STRING .,, print it out reversed thats it
	
	static String reverseStr(String str){
		String result = ""; 
		for (int i=str.length()-1; i>=0;i--){
			char c = str.charAt(i);
			result += c;
			//System.out.print(c);
		}
		return result;
	}
	
}

// @ home: Write a method/function that take in a string, return a string that
// replaces all spaces (space characters) with "%20" -> search linking/compressing 

// "what is java" -> "what%20is%20java"
