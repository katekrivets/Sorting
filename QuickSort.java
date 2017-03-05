class QuickSort extends Sort {
	public int[] qsort( int arr[], int first, int last) {
        
        int left, right, c;
        left = first; 
        right = last;
		int m = (arr[left] + arr[right]) / 2;     //!                          
		                                                                        
		while (left <= right) {
             
			while ( (arr[left] < m) & (left < last) ) {
				left++;                                             
			}                                                    
			
			while ( (arr[right] > m) & (right > first) ) {
				right--;
			}	                                                 
		
			if (left <= right) {                                        
                
                swap(arr, left, right);
               	left++;
				right--;
			}
		}  

		if (first < right) {		                                      
			qsort (arr, first, right);		   								   
		}

		if (left < last) { 
			qsort (arr, left, last); 
		}

        return arr;
    }
}