package Arrays;

import java.util.Arrays;
import java.util.Scanner;

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
		
		// now values store 
		
	}
	
	// creating the function to take a input 2d arryas 
	public static void print(int[][]arr) {
		
		// creating the two loop for the iterating arrays 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +" " );
	
			}
			System.out.println();
		}
		
	}
	
	
	public static int[][] arr_2d(){
		
		// taking the input from the user 
		//declerd variable 
		Scanner input = new Scanner(System.in) ; 
		System.out.println("enter the size ");
		int size = input.nextInt() ; 
		
		// creating the loop for the creating the jacked arrays according the user input 
		// creating the arrays 
		int[][] arr = new int[size][] ; 
		
		for (int i = 0; i < arr.length; i++) {
			
			// now creating size of the every arrys 
			System.out.println("Enter the size of id arrys at index : "+" "+i);
			int su_size = input.nextInt() ; 
			arr[i] = new int[su_size] ; 
		}
		return arr ; 
	}
	
	public static int[][] set_values(int[][]arr) {
		
		Scanner input = new Scanner(System.in) ; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the value at index"+" "+i+" "+j);
				int num = input.nextInt() ; 
				arr[i][j] = num ; 
			}
		}
		return arr ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // multi();
		
		int[]s = {5,7,5 } ; 
		System.out.println(Arrays.toString(s)); 
		
		int[][] shivam = arr_2d() ; 
		print(shivam);
		set_values(shivam) ; 
		print(shivam);
		
		// creating the arrays and printing in the string formated 
		
         
	}

}
