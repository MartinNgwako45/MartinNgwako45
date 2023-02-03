import java.util.*;

public class identicalArrays {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner inputStr = new Scanner(System.in);
		System.out.println("Enter the size of the first arrays");
		int arraySize = inputStr.nextInt();
		// initializing the first array
		int num1[] = new int[arraySize];

		for(int i = 0; i < num1.length; i++) {
			inputStr = new Scanner(System.in);
			System.out.println("Enter a number for array 1:");
			int numb1 = inputStr.nextInt();
			num1[i] = numb1;
		}

		@SuppressWarnings("resource")
		Scanner arrayObject = new Scanner(System.in);
		System.out.println("Enter the size of the second arrays");
		@SuppressWarnings("unused")
		int arraySize1 = arrayObject.nextInt();	
		//  the second array
		int num2[] = new int[arraySize];


		for(int i = 0; i < num1.length; i++) {
			inputStr = new Scanner(System.in);
			System.out.println("Enter a number for array 2:");
			int numb1 = inputStr.nextInt();
			num1[i] = numb1;
		}
		//check whether both arrays arrays equal or not 
		//use the function Arrays.equals to check
		//store the output
		boolean output = Arrays.equals(num1, num2);

		//output is true or false
		if(output == true) {
			// print out the output
			System.out.println("The two arrays are identical");
		}
		else {
			System.out.println("The two arrays are not identical");
		}
	}
}

