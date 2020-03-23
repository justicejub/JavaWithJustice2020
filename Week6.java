//WEEK 5 //
//Creating arrays, iterating through arrays, casting
public class Week6 {

	public static void main(String[] args) {

		//Instantiating array
		//Hold a set of information of one data type
		int arr[] = {1,2,3,4};
		int[] arr2;
		int arr3[];
		arr3 = new int[3];
		String[] sentence = {"Hello","hi"};
		
		int[] arr4 = new int[12]; 
		System.out.println(arr4[11]); //indexed at zero
		
		//filling arrays
		char[] alphabet = new char[26];
		alphabet[0] = 'a';
		alphabet[1] = 'b';
		alphabet[2] = 'c';
		//...
		System.out.println(alphabet[4]);
		
		//filling with loops
		int[] nums = new int[25];
		for (int i=0; i<25;i++){
			nums[i] = i+1;
		}
		
		//printing out arrays - arrName.length
		for (int i=0; i < nums.length;i++){
			System.out.println(nums[i]);
		}
		
		//casting
		int x = 5;
		char let = (char) x;
		System.out.println('\t' + let);
		
		
		//fill alphabet with loop?
		
		for (int i=0,j='a' ; j<'z'+1 ; j++,i++){
			alphabet[i] = (char) j;	
		}
		printf(alphabet);
		//
	}
	
	//printarr function
	static void printf(char[] arr){
		for (int i=0; i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	//create function that adds all element in array
	

}
