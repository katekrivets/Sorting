import java.util.Scanner;
import java.util.*;
import java.lang.*;

class Sort {
	public int enterLength () {

		Scanner input = new Scanner(System.in);		
		int n = 0;

		while (true) {  // loops forever until break                                       
			try {  // checks code for exceptions
				System.out.println("Enter array length:");
				n = input.nextInt();
				if (n <= 0) {
					throw new NegativeArrayLengthException();
				}
			}
			catch (InputMismatchException exc) {  
				System.out.println("You've entered char symbol, only integer allowed.");
				input.next();  // clear scanner wrong input !!! important step!!!    
				continue;  // continues to loop if exception is found
			}
			catch (NegativeArrayLengthException exc) {
				System.out.println("You've entered negative number.");
				continue;  // continues to loop if exception is found
			}
								
			break; //breaks if no exceptions
		}

		return n;
	}

	public int[] enterArray ( int n) {
        
        Scanner input = new Scanner(System.in); 
		System.out.print("Enter numbers:");
		int[] arr = new int [n];

		for (int j = 0; j < arr.length; j++) {
			
			while (true) {
				try {
					arr[j] = input.nextInt();
					break;					
				}
				catch (InputMismatchException exc) {
					System.out.println("You've entered char symbol, only integer allowed.");
					input.next();  // clear scanner wrong input !!! important step!!!    
					continue;  // continues to loop if exception is found
				}
		    }	
	    }

		return arr;
	}

	public int[] showResult ( int arr[] ) {

	    System.out.print("Result: ");                 //вывод значений

		for(int j=0; j < arr.length; j++) {
            System.out.print( arr[j] + " ");
        }

        return arr;
    }  

    void swap( int[] i, int a, int z ) {

        int c = i[a];                                        
		i[a] = i[z];
		i[z] = c;

	}  
}