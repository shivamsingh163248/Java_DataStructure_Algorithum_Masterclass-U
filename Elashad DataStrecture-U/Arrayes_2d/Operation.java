package Arrayes_2d;

public class Operation {

	

	public static void main(String[] args) {
		
		
		 // 1. Create object with 2 rows
        Arrays_Integer matrix = new Arrays_Integer(2);

        // 2. Manually set column sizes
        matrix.arr[0] = new int[2];  // row 0: 2 columns
        matrix.arr[1] = new int[2];  // row 1: 2 columns

        // 3. Insert values into original matrix
        matrix.insurt_values(0, 0, 1);
        matrix.insurt_values(0, 1, 2);
        matrix.insurt_values(1, 0, 3);
        matrix.insurt_values(1, 1, 4);

        System.out.println("Column-wise Print:");
        matrix.print_column_wise();

        System.out.println("Row-wise Print (corrected):");
        for (int i = 0; i < matrix.arr[0].length; i++) {
            for (int j = 0; j < matrix.arr.length; j++) {
                System.out.print(matrix.arr[j][i] + " ");
            }
            System.out.println();
        }

        // 4. Matrix addition test
        int[][] other = {
            {5, 6},
            {7, 8}
        };

        matrix.addtion(other);
        System.out.println("Matrix after addition:");
        for (int[] row : other) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // 5. Matrix multiplication test
        int[][] toMultiply = {
            {1, 2},
            {3, 4}
        };

        int[][] result = matrix.Matrix_multiplication(toMultiply);

        if (result != null) {
            System.out.println("Matrix multiplication result:");
            for (int[] row : result) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }

        // 6. Invalid index test
        matrix.insurt_values(5, 5, 99);  // should catch exception

        // 7. Invalid addition test (mismatched rows/cols)
        int[][] invalidAdd = {
            {1, 2, 3},
            {4, 5, 6}
        };
        matrix.addtion(invalidAdd);  // should fail gracefully

        // 8. Invalid multiplication test (rule violation)
        int[][] badMultiply = {
            {1, 2, 3},
            {4, 5, 6}
        };
        matrix.Matrix_multiplication(badMultiply); // should print error

        
        int[][] A = {
        	    {1, 2, 3, 4},
        	    {5, 6, 7, 8}
        	}; // 2x4

        int new_m[][] = matrix.Matrix_multiplication(A) ; 
        
        if (new_m != null) {
            System.out.println("Matrix multiplication result:");
            for (int[] row : new_m) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
        

        	// Multiply A x B → Result will be 2x2

	}

}
