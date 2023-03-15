package Array;

import java.util.Scanner;
import java.util.Arrays;
public class RowsColumnExam {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();

	        System.out.print("Enter the number of columns: ");
	        int numCols = scanner.nextInt();

	        int[][] array = new int[numRows][numCols];

	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j < numCols; j++) {
	                array[i][j] = scanner.nextInt();
	            }
	        }

	        int[] rowSums = new int[numRows];
	        int[] colSums = new int[numCols];

	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j < numCols; j++) {
	                rowSums[i] += array[i][j];
	                colSums[j] += array[i][j];
	            }
	        }

	        System.out.println("The sum of each row is:");
	        System.out.println(Arrays.toString(rowSums));

	        System.out.println("The sum of each column is:");
	        System.out.println(Arrays.toString(colSums));
     scanner.close();
	}

}
