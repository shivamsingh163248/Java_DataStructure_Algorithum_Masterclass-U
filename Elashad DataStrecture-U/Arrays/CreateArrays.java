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
<<<<<<< HEAD
		// TODO Auto-generated method stub
		System.out.println("shivam singh 23 ");
=======
		// Creating the New Arrays 
		
>>>>>>> a39fba99dac1e9466dec61c9a8f1488b98d26353

	}

}
