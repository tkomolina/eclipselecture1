import java.util.Arrays;

public class TwoDimTask1 {

	/**
	 * Write a program that fills a 2-dim (4x4)array with numbers from 0 to 15,
	 * using loop: 0, 1, 2, 3 4, 5, 6, 7 8, 9, 10, 11 12,13,14,15
	 */

	public static void main(String[] args) {

		int[][] grid; // init
		grid = new int[4][4];
		int[] row = grid[0];
		/*System.out.println(grid[3][3]);
		String row1Content = Arrays.toString(row);
		System.out.println(row1Content); // fetching specific cell
*/		System.out.println(grid[3][3]);
		for (int rows = 0; rows < grid.length; rows++) {
			for (int col = 0; col < grid[rows].length; col++);
		
			System.out.println(grid[rows][col]+ " ");
		}
	}
	}
