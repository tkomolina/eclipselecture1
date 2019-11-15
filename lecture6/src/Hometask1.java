
public class Hometask1 {

	/**
	 Given:
	int[][] dataSet = {
    {1,-5, 98,20},
    {3,-68,2},
    {7,29,0,-1,-68}
}

    Find the sum of the dataSet cells
    Return to user coordinated of the smallest element and its value
	 */
	public static void main(String[] args) {
		int[][] dataSet = {
			    {1,-5, 98,20},
			    {3,-68,2},
			    {7,29,0,-1,-68}
		};
		
		int sum = 0;
		for (int i = 0;i < dataSet.length;i++){
			int[] row = dataSet[i];
			for (int j = 0; j < row.length; j++){
				int cellValue = row [j];
				sum = sum + cellValue;
			}
		}
		System.out.println (sum);
	}

}
