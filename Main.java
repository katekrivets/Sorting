import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
        System.out.print("Wich algorithm you'd like to use:\n 1.BubbleSort \n 2.QuickSort \n Print:");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        System.out.println();
      
        switch (choice) {
            case "1":
                //Bubble Sort    
            	Sort bubblesort = new BubbleSort();
                int n = bubblesort.enterLength();                // array length
                int arr[] = bubblesort.enterArray(n);            // filling
                int k[] = bubblesort.bsort(arr);                  // bubblesort
                int h[] = bubblesort.showResult(k);              // result
                break;
            case "2":
                Sort quicksort = new QuickSort();
                int m = quicksort.enterLength();               // array length
                int array[] = quicksort.enterArray(m);             // filling
                int f[] = quicksort.qsort(array, 0, array.length - 1);   // quicksort
                int l[] = quicksort.showResult(f);                 // result
                break;
            default:
                System.out.println("Symbol not found.");

        }
    }
}
