

//** WEEK 3 **//
// recall while loops. for loops , characters , string methods 

public class Week3_1 {

	public static void main(String[] args) {
		
		// ** While **// 
		int x = 0;
		while (x < 10) {
			System.out.print("*");
			x = x + 2;
		}
		System.out.println();
		
		
		int y = 5;
		while (y > 0){
			System.out.print("*");
			y--;
		}
		System.out.println();
		System.out.println();
		
		//** FOR  LOOPS ** //
		
		for (int i= 0; i < 5; i++){
			System.out.print("*");
		}
		System.out.println();
		
		for (int i= 5; i > 0; i--){
			System.out.print("*");
		}
		System.out.println();
		System.out.println();
		
		
		//** Nested For Loops **// 
		
		for (int j = 0; j < 2; j++){      
			for (int k = 0; k < 6; k++){ 
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//** Characters **//
		char a = 'a';
		char b = 'A';  //A & a have diff ASCII numbers 
		char c = '.';  //each character has a unique ASCII numbers 
		
		//** String Methods **// 
		// Strings are objects
		String name = "justice";
		String sentence = "This is a sentence."; 
		
		//length of string method 
		int strLength = name.length(); // -> int value
		
		//substring method
		String segmentString = name.substring(2); //stice
		String segmentString2 = name.substring(name.length()/2,name.length()); //justi
		System.out.println(segmentString);
		System.out.println(segmentString2);
		
	}

	//Practice: make a loop that prints out each character of a string on a new line

	
}
