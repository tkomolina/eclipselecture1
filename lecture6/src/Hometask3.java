import java.util.Arrays;
import java.util.Scanner;


public class Hometask3 {

	/**
	 Write a program which allows for user set value in 2-dimensional array
(5x4):
Enter row: 3
Enter col: 4
Enter value: 1
Output:
0,0,0,0,0
0,0,0,0,0
0,0,0,1,0
0,0,0,0,0
	 */
	public static void main(String[] args) {
		int[][] table = new int[5][4];		
		Scanner scanner = new Scanner(System.in);		
		
		// Ask user for col number
		System.out.println("Enter column:");
		int userCol = scanner.nextInt();
		// + validation
			if(userCol > 4 || userCol < 1){
				System.out.println("Entered invalid column index");
				return;
		}
		// + shift by -1
		int columnIndex = userCol -1;	//because array index starts from 0	
		
		// Ask user for row number 
		System.out.println("Enter row:");
		int userRow = scanner.nextInt();
		// + validation
			if(userRow > 5 || userRow < 1){
				System.out.println("Entered invalid row index");
				return; // returns nothing and exit
		}
		// + shift by -1
		int rowIndex = userRow -1;		
		
		// Ask user for value
		System.out.println("Enter value:");
		int newValue = scanner.nextInt();		
		
		// assign value to array cell 
		table[rowIndex][columnIndex] = newValue;		
		
		// print out
		for(int[] row : table){
			System.out.println(Arrays.toString(row));
		}	
	}
}