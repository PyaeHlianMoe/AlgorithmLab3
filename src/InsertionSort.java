class InsertionSort 
{ 
	public long insNumOfComp = 0;
	
	/*Function to sort array using insertion sort*/
    void insertionSort(int arr[]) 
    { 
    	
        int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                insNumOfComp++;
                j = j-1; 
            } 
            insNumOfComp++;
            arr[j+1] = key; 
        } 
        
       
    } 


} 
