package Arrayes_2d;

import java.util.Scanner;

public class Arrays_Integer {
	// creating the string
	int[][] arr ; 
	public Arrays_Integer(int size) {
		arr = new int[size][]  ;
	}
	
	
	// creating the function configuration of row 
	public void set_coloumn_size() {
		// now creating the size using the for loop 
		// import the scanner function 
		Scanner input = new Scanner(System.in) ; 
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the coloum size ") ; 
			int size = input.nextInt() ; 
			arr[i] = new int[size] ; 
		}
		
	}
	
	
	// now insurt the value in the 2d arrays 
	public  void insurt_values(int row , int coloum , int values  ) {
		 // time complexity is the big 1 
		try {
			arr[row][coloum] = values ;
			
		} catch (Exception e) {
			
			System.out.println("invaid index ");
		}
		 
	}
	
	// creating the 2d arrays iterating 
	public void print_column_wise() {
		// creating the two loop for the printing 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	
	// creating the 2d arrays iterating 
		public void print_row_wise() {
			// creating the two loop for the printing 
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println(arr[j][i]);
				}
			}
		}
		
		
		// creating the check dimension 
		private boolean check_dimesion_samearrays(int arr[][]) {
			
			// creating the loop 
			for (int i = 0; i < arr.length; i++) {
				if (arr[0].length != arr[i].length) {
					return false; 
				}
			}
			return true ; 
		}
		
		
		 private boolean check_dimesion_addtion(int arr1[][]) {
			 
			 if (!check_dimesion_samearrays(arr1)|| !check_dimesion_samearrays(arr)) {
				return false ; 
			}
			 
			 if (arr1.length != arr.length) {
				 System.out.println("not possible matrix addition  ");
					return false ; 
				}
				 
				// check the every column 
				for (int i = 0; i < arr.length; i++) {
					// check every column 
					if(arr1[i].length != arr.length || arr[i].length != arr.length ) {
						System.out.println("not possible matrix adition  ");
						return false ; 
					}
				}
			 
			 return true ; 
		 }
		
		
	// creating the matrix addition  
	public void addtion(int arr1[][]) {
		if (check_dimesion_addtion(arr1)) {
			// creating the loop and update in the same arrays which are the 
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1.length; j++) {		
					arr1[i][j] += arr[i][j] ; 
				}
			}
		}		
	}
	
	// creating the multiplication 
	
	public int[][] Matrix_multiplication(int[][]arr1) {
		// check matrix multiplication possible or not 
		// step 1 to check the self matrix 
		if (!check_dimesion_samearrays(arr1) || !check_dimesion_samearrays(arr)) {
			System.err.println("matrix multiplication is not possible in the jaccked arrays ");
			return  null; 
		}
		
		// now check the matrix rule and return the new matrix which is the output by the matrix rule 
		if (arr[0].length == arr1.length) {
			
			// creating the new arrys 
			int[][]new_2d_arr = new int[arr.length][arr1[0].length] ; 
			
			// now creating the loop and dome the multiplication 
			int k = 0 ; 
			while (arr1[0].length > k) {
				
		
			for (int i = 0; i < arr.length; i++) {
				int sum = 0 ; 
				for (int j = 0; j < arr[0].length; j++) {
				sum += 	arr[i][j] * arr1[j][k] ; 
					
					
				}
				
				// now stored new arrays 
				new_2d_arr[i][k] = sum ; 
				
				
			}
			k++ ; 
			}
			
			return new_2d_arr ; 
			
		}else {
			 
			System.out.println("multiplication is not possible ");
			return null ;
		}
		
		
		
		
	}
		
	
	
	

}
