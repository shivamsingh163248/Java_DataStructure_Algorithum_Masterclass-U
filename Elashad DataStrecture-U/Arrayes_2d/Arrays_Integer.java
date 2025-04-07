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
		arr[row][coloum] = values ; 
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
	
	public void Matrix_multiplication(int[][]arr1) {
		// check matrix multiplication possible or not 
		// step 1 to check the self matrix 
		
	}
		
	
	
	

}
