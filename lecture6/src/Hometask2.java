import java.util.Arrays;


public class Hometask2 {

	/**
	 Write a program that fills a 2-dim (4x4)array with numbers from 0 to
15, using loop:
0, 1, 2, 3
4, 5, 6, 7
8, 9, 10, 11
12,13,14,15
	 */
	public static void main(String[] args) {
		int[][] dataSet = new int[4][4];
		int ordinal = 0;
		
		for (int i = 0;i < dataSet.length;i++){
			int[] row = dataSet[i];
			for (int j = 0; j < row.length; j++){
				row[j]= ordinal;
				ordinal++;
			}
		}
		for(int[] row : dataSet){
			System.out.println(Arrays.toString(row));
		}	
		
}
	}