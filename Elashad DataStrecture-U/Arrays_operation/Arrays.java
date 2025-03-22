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
		for (int i = 0; i < arr.length; i++) {
			
			//write a condition 
			if (arr[i] == target) {
				System.out.println("print successful");
			}else {
				System.out.println("Not found ");
			}
		}
	}
	
	public void binary_search(int target) {
		
		
	}
	
	  
	
	 
	
	
	
	


}
