import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
        System.out.print("Wich algorithm you'd like to use:\n 1.BubbleSort \n 2.QuickSort \n Print:");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        System.out.println();
        Sort s;
      
        switch (choice) {
            case "1":
                //Bubble Sort    
            	s = new BubbleSort();
                break;
            case "2":
                s = new QuickSort();
                break;
            default:
                System.out.println("Symbol not found.");

        }
                int n = s.enterLength();                // array length
                int arr[] = s.enterArray(n);            // filling
                int k[] = s.sort(arr, 0, arr.length - 1);  // sort
                int h[] = s.showResult(k);              // result
    }
}
