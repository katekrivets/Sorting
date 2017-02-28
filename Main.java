import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        /*Bubble Sort*/
        
    	/*BubbleSort bubblesort = new BubbleSort();
        int n = bubblesort.enterLength();                // array length
        int arr[] = bubblesort.enterArray(n);            // filling
        int k[] = bubblesort.sort(arr);                  // bubblesort
        int h[] = bubblesort.showResult(k);*/            // result

        /*Quick Sort*/
        
        QuickSort quicksort = new QuickSort();
        int n = quicksort.enterLength();               // array length
        int arr[] = quicksort.enterArray(n);             // filling
        int k[] = quicksort.sort(arr, 0, arr.length - 1);   // quicksort
        int h[] = quicksort.showResult(k);                 // result
       
        System.out.println();  
        }
}
