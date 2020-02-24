/**Week 3**/
// HW, Recall while loops, for loops, characters strings methods 
public class Week3 {

	public static void main(String[] args) {
		
		//While loops 
		int j = 0;
		while (j < 5){
			System.out.print("*");
			j++;
		}
		System.out.println();
		
		int k = 5;
		while (k > 0){
			System.out.print("*");
			k--;
		}
		System.out.println();
		
		//*** For Loops ***//
		
		int length = 5;
		for (int i = 0; i<length;i++){
			System.out.print("*");
		}
		System.out.println();
		//v2
		for (int i = 5; i>0;i--){
			System.out.print("*");
		}
		System.out.println();
		 
	
		
		//** Characters **//
		char a = 'a';
		char b = 'A';
		char c = ' ';
		char d = '='; //each have unique ASCII number
		
		//** Strings **//
		String hello = "hello";
		String sentence = "Java is cool";
		
		//string length
		int strLength = hello.length();
		
		//substring
		String segment = hello.substring(0,hello.length()-1);
		String segment2 = sentence.substring(5);
		System.out.println(segment2);
		
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
		
		
		//Try making program that scans in a string then prints out 
		//every character on a new line: hint use: for loop and some string methods
	}
	
	public static void clearScreen() {
		System. out. print("\033[H\033[2J");
		System. out. flush();
	}
}
