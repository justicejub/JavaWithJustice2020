//WEEK 6
//Making Arrays, filling arrays, reverse, casting
public class Week6_1 {

	public static void main(String[] args) {

		//Array instantiation 
		//a collection of data of the same type 
		
		int[] nameOfArray = new int[4];  
		System.out.println(nameOfArray[0]);
		
		int[] arr1 = {1,23, 4, 5};
		int x = arr1[2]; //get the values from array 
		int lastE = arr1[arr1.length-1];
		
		int arr3[]; //no memory allocated 
		int[] arr4; 
		arr3 = new int[12];
		
		String[] words = {"Hello", "This", "hi"};
		char[] charArr = new char[1];
	
		
		//fill array
		char[] alpha = new char[26];
		alpha[0] = 'a';
		alpha[1] = 'b';
		
		
		int[] nums = new int[5];
		for (int i=0; i<nums.length;i++){
			nums[i] = i+1; //filling nums
		}
		//printArr(nums);
		
		//casting 
		int z = 199;
		double y = 5.5;
		int w = (int)y; //w=0;
		double q = (double)z;
		
		char sp1 = (char)z;
		System.out.println(sp1);
		
		//fill alphabet arr
		
		for (int j='a', k =0; j<= 'z';j++,k++){
			alpha[k] = (char)j;
		}
		printArr(alpha);
	}
	
////////////////////////	
	static void printArr (char[] arr){
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}

	
}
