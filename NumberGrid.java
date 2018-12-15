package numbergrid;

import java.util.Scanner;

public class NumberGrid {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Stores the size of the 2D array input by the user.
		int gridSize = 0;

		// Calculates the number to increment and populate the array.
		int countUpFrom = 1;

		// Prompts user to enter grid size.
		System.out.println("Grid size?");
		gridSize = scanner.nextInt();

		// Creates a 2D array of the size given by the user.
		int[][] grid = new int[gridSize][gridSize];

		// Iterates from the bottom row, left to right and populates with
		// incrementing numbers.
		for (int row = gridSize - 1; row >= 0; row--) {
			for (int col = 0; col <= grid.length - 1; col++) {

				grid[row][col] = countUpFrom;
				countUpFrom++;
			}
		}

		// Outputs the array.
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid.length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}

		scanner.close();
	}
}
