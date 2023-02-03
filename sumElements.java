import java.util.Scanner;

public class sumElements {

	public static void main(String[] args) {

		double[][] mat;


		// creating an object scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of rows and colums");

		// initializing variables
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		mat = new double[num1][num2];

		//asking user to enter number of arrays
		System.out.println("please enter number of arrays.");

		for(int i=0;i<num1;i++) {
			for(int j=0;j<num2;j++){
				mat[i][j]= input.nextDouble();
			}

		}

		//asking user to enter column number to get total
		System.out.println("enetr column number to get total sum");
		double sum = 0D;
		int col=input.nextInt();
		for(int i=0;i<num2;i++) {
			sum+=mat[i][col];

			//print out the output
			System.out.println("sum of elements of "+col+"in the mat is "+sum);
		}

	}

}
