package Arrays;

public class multi_dim {
	
	
	// creating the arrays 
	
	public static  void multi() {
	    
		int[][]arr = new int[4][];
		System.out.println(arr.length);
		
		// creating the jacked arrays 
		for (int i = 0; i < arr.length; i++) {
			// creating the lenght 
			arr[i] = new int[i] ; 
		}
		
		// now printing the lenght 
		System.out.println(arr[1].length);
		
		// printing all the length 
		for (int i = 0; i < arr.length; i++) {
		     System.out.println(arr[i].length);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi();

	}

}
