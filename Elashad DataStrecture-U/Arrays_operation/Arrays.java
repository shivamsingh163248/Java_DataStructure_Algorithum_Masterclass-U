package Arrays_operation;

public class Arrays {

	

//	public void setArr(int[] arr) {
//		this.arr = arr;
//	}

	private int[]arr = null  ; 
	
	
	public int[] getArr() {
		return arr;
	}
	
	
	// crating the constructor of the arrays instation 
	public Arrays(int size) {
		// hear 
		arr = new int[size] ; 
		// and insert  the values 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE ; 
		}
	}
	
	// creating the insert function 
	public void insert(int index , int value) {
	
		
		try {
			// checking the condition
			if (arr[index] == Integer.MIN_VALUE) {
				// insert values 
				arr[index] = value ;
				System.out.println("Successful inserted ");
				
			}else {
				System.out.println("shell is alrady accoupide ");
			}
			
		    } catch (ArrayIndexOutOfBoundsException e) {
		       System.out.println("out of bond exception ");
		}
		
		
	}
	
	
	// hear is the return arrays 
	
	public  void travesing() {
		
		// creating the loop for the traversing 
		try {
			for (int i = 0; i < arr.length  ; i++) {
				System.out.println(arr[i]+" ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// find the element in the liner and binary search 
	// find the element in the linear search 
	public 	void linerSearch(int target) {
		
		// creating the for loop for the search 
		try {
			for (int i = 0; i < arr.length; i++) {
				
				//write a condition 
				if (arr[i] == target) {
					System.out.println("print successful");
				}else {
					System.out.println("Not found ");
				}
			}
			
		} catch (Exception e) {
			System.out.println("not found ");
		}
	}
	
	public int binary_search(int target) {
		
	try {
		
		int left = 0 ; 
		int right = arr.length - 1  ; 	
		// creating the mid 
		int mid ; 
		while (left <= right) {
		 mid = left + ( right - left ) /2 ; 
			// creating the condition 
		 System.out.println("mid "+ mid); 
			if ( arr[mid] == target ) {
				return 0 ;  	
			}else if(arr[mid] < target ){
				left = mid+1 ; 
			}else {
				right = mid - 1  ; 
			}
		}
		return -1 ; 
		
	} catch (Exception e) {
		
		System.out.println("found some exception ");
		return -1 ; 
	}finally {
		System.out.println("this is the binnery search algo ");
	}
		
		
	}
	
	// creating the delete function of the array 
	
	public void delete(int target) {
		
		try {
			
			// if element are the present then the delete element other wise delete the element 
			// creating the while loop
	      int i = 0 ; 
	      while (arr.length > i) {
			
	    	  if (arr[i] == target) {
				// delete value
	    		  arr[i] = Integer.MIN_VALUE ; 
	    		  System.out.println("deleted successful !");
	    		  return ; 
	    		   
			}
	    	  i++ ; 
		}
	      System.err.println("not found ");
	      
		} catch (Exception e) {
			System.out.println("hear we get some exception ");
			
		}
	}
	
	  
	
	 
	
	
	
	


}
