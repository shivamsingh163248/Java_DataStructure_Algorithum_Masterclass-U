package Arrays_operation;

public class Arrays {

	private int[]arr = null  ; 
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
	
	
	


}
