import java.util.Scanner;

public class Sorting {
	public static void main(String args[]) 
    {      
		
		InsertionSort ob = new InsertionSort();    
        MergeSort mob = new MergeSort();

        	
	        int opt=0;
	        Scanner sc = new Scanner(System.in);
	        
	        
	        
	        while (opt != 4){
		        
	    	    System.out.println("1. for random numbers\n2. for ascending\n3. for descending\n4. Quit\nPlease enter your choice:");
		        opt = sc.nextInt();
		        int insArr[] =  list(opt); 
		        
		        int mergeArr[] = insArr;
		        
		        System.out.println("Original Array...");
		        printArray(insArr); 
		        
		        long insStartTime = System.nanoTime();
		        ob.insertionSort(insArr); 
		        long insEndTime = System.nanoTime();
		    	System.out.println("Insertion Sort Took "+(insEndTime - insStartTime) + " ns"); 
		        
		        long merStartTime = System.nanoTime();
		        mob.mergeSort(mergeArr,0,mergeArr.length-1); 
		        long merEndTime = System.nanoTime();
		        System.out.println("Merge Sort Took "+(merEndTime - merStartTime) + " ns"); 
		       
		        System.out.println("Insertion Sort: Sorted Array...");
		        printArray(insArr); 
		        System.out.println("Merge Sort: Sorted Array...");
		        printArray(mergeArr); 
		        
	       };

    } 
	
	
    public static int[] list(int opt) {
    	
        int[] anArray = new int[1000];
        
        
        
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
