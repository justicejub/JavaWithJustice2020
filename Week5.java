//WEEK 5
//Functions, string methods, String interview question

public class Week5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a function/method
		int x = 21;
		int y = 12;
		int max = getMax(x,y);
		System.out.println(max);
		
		//String methods
		String str = "This is string";
		
		//length
		int len = str.length();
		
		//charAt
		char a = str.charAt(str.length()-1);
		System.out.println(a);
		
		
		//function calls
		
		String test = "test";
		int indexS = indexOf(test,'e');
		String rev = reverse(test);
		
		System.out.println("\n"+ indexS + "\t"+ rev );
		
		 str = "This is string";
		 System.out.println(link(str));
	}
	
	
	
	
	//created outside main method
	public static int getMax(int x, int y){
		int max;
		
		if (x > y)
			return x;
		else
			return y;	
	}
	
	//Write a function that will let us know if a char is contained in a string
	//and return the index of the char
	//aka: indexOf
	static int indexOf(String str, char a){
		
		for (int i=0;i<str.length();i++){
			if (str.charAt(i) == a)
				return i;
		}
		
		return -1;
	}
	
	//write a function that reverses a string
	
	static String reverse(String str){
		String ans = "";
		for (int i=str.length()-1;i>=0;i--){
			ans += str.charAt(i);
		}
		return ans;
	}
	
	//write method that replaces all spaces in string with "%20
	
	public static String  link(String str){
		String ans = "";
		for (int i=0;i<str.length();i++){
			if (str.charAt(i) == ' '){
				ans += '%';
				ans += '2';
				ans += '0';
			}
			else {
				ans += str.charAt(i);
			}
		}
		return ans;
	}

}
