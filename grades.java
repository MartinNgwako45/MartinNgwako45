import java.util.*;
import java.util.Arrays;

public class grades {
	
	public static void main(String[] args){
		
		// declaring variable
		double[] myTestResults = {50, 73, 83.48, 60, 45};
		
 
		double total = 0;
		
		for (int i = 0; i < myTestResults.length; i++) {
			 total = myTestResults[i] + total;
		}
		
		double average = total / myTestResults.length;
		System.out.println("The average number is "+ average);

		char Symbol; 
		 
	
	
		if (average <= 100 && average >=80) {
			 Symbol = 'A';
			 System.out.println("The average number is" + average);
				
		}else if (average <= 70 && average >=79) {
			Symbol = 'B';
			System.out.println("The average number is" + average);
				
					
		}else if (average >= 60 && average <= 69) {
			
			System.out.println("The symbol is C");		
					
		}else if (average <= 50 && average >= 59) {
			Symbol = 'D';
			System.out.println("The average is" + average);
		}else if (average <= 49) {
			Symbol = 'F';
			System.out.println("The average is " + average);

      }		
 
  } 

}

		