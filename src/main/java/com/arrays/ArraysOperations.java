package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysOperations {

	public static void main(String[] args) {
		ArraysOperations operations = new ArraysOperations();
		// operations.additionOfTwo();
		// operations.multiplicationOfTwo();
		operations.transposeOfMatrix();
		

	}

	private void transposeOfMatrix() {
		System.out.println("transpose of a matrix");
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int arows = a.length;
		int acolumns = a[0].length;
		System.out.println("matrix a");
		printMatrix(a, arows, acolumns);
		System.out.println("matrix a transpose");
		int aT[][] = new int[arows][acolumns];
		for (int i = 0; i < arows; i++) {
			for (int j = 0; j < acolumns; j++) {
				aT[i][j] = a[j][i];
				System.out.print(aT[i][j] + "  ");
			}
			System.out.println();
		}

	}

	private void multiplicationOfTwo() {
		System.out.println("multiplication of 2 matrices");
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 } };
		int b[][] = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
		int arows = a.length;
		int acolumns = a[0].length;
		int brows = b.length;
		int bcolumns = b[0].length;
		System.out.println("matrix a");
		printMatrix(a, arows, acolumns);

		System.out.println("matrix b");
		printMatrix(b, brows, bcolumns);
		if (acolumns == brows) {
			int c[][] = new int[arows][bcolumns];
			System.out.println("matrix a*b");
			for (int i = 0; i < arows; i++) {
				for (int j = 0; j < bcolumns; j++) {
					c[i][j] = 0;
					for (int k = 0; k < bcolumns; k++) {
						c[i][j] = c[i][j] + a[i][k] * b[k][j];
					}
					System.out.print(c[i][j] + "  ");
				}
				System.out.println();
			}
		}

	}

	private void printMatrix(int[][] m, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}

	private void additionOfTwo() {
		System.out.println("addition of 2 matrices");
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 } };
		// a.length// total rows
		// a[0].length//total columns
		int arows = a.length;
		int acolumns = a[0].length;
		int brows = b.length;
		int bcolumns = b[0].length;
		System.out.println("matrix a");
		printMatrix(a, arows, acolumns);

		System.out.println("matrix b");
		printMatrix(b, brows, bcolumns);
		if ((arows == brows) && (acolumns == bcolumns)) {
			int c[][] = new int[arows][acolumns];
			System.out.println("matrix a+b");
			for (int i = 0; i < arows; i++) {
				for (int j = 0; j < acolumns; j++) {
					c[i][j] = a[i][j] + b[i][j];
					System.out.print(c[i][j] + "  ");
				}
				System.out.println();
			}
		}
	}

}
