import java.util.Scanner;

public class Sorting {
	public static void main(String args[]) 
    {      
		
		InsertionSort ob = new InsertionSort();    
        MergeSort mob = new MergeSort();

        	int arr[] =  list(); 
        
	        int arr2[] = arr;
	        
	        
	  
	        System.out.println("Original Array...");
	        printArray(arr); 
	        
	        ob.insertionSort(arr); 
	        
	        long startTime = System.nanoTime();
	        mob.mergeSort(arr2,0,arr.length-1); 
	        long endTime = System.nanoTime();
	        System.out.println("Merge Sort Took "+(endTime - startTime) + " ns"); 
	       
	        System.out.println("Sorted Array...");
	        printArray(arr); 
	        printArray(arr2); 

    } 
	
	
    public static int[] list() {
    	
        int[] anArray = new int[1000];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1. for random numbers\n2. for ascending\n3. for descending\n4. Quit\nPlease enter your choice:");
        int opt = sc.nextInt();
        
        for(int i=0;i<anArray.length;i++)
        {
        	switch(opt) {
	        	case 1: 
	        		anArray[i] = (int) (Math.random()*10000); //random
	        		break;
	        	case 2: 
	        		anArray[i] = i; // ascending
	        		break;
	        	case 3:
	        		anArray[i] = 1000 - i; //descending
	        		break;
	        	default:
	        		break;
        	}
        }
        return anArray;
    }
        
        static void printArray(int arr[]) 
        { 
            int n = arr.length; 
            for (int i=0; i<n; ++i) 
                System.out.print(arr[i] + " "); 
            System.out.println(); 
        } 
      
}
