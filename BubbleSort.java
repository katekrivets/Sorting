class BubbleSort extends Sort {
		
	public int[] sort ( int arr[]) {
	    
	   	for (int j = 0; j<arr.length; j++) {
	    	for (int k = arr.length - 1; k > j; k--) {
	    		if (arr[k] < arr[k - 1]) {
	    			swap (arr, k, (k - 1) );
	 	    	}
	    	}
	    }

	    return arr;
	}
  
}