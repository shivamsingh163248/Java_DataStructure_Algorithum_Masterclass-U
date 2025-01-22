package Arrays;

import java.util.Scanner;

public class CreateArrays {
	
	// creating the function to taking the input from the user 
	public static int[] takeinput() {
		
		Scanner input = new Scanner(System.in) ; 
		System.out.println("Enter the size of the arrys ");
		int size = input.nextInt() ; 
		int[]arr = new int[size] ; 
		
		// creating the loop for the iterating the values 
		for (int i = 0; i < arr.length; i++) {
			System.out.println("INDEX"+" "+i);
			int values = input.nextInt() ; 
			arr[i] = values ; 
		}
		input.close();
		return arr ; 
		
	}

	public static void main(String[] args) {
		// Creating the New Arrays 
		

	}

}
