
public class Exercise4 {

	/*Write a program to sum values of an array int[] myArray = { 1, -3, 44, -39};
	 */
	
	public static void main(String[] args) {
		int[] myArray = { 1, -3, 44, -39};
		int sum = 0;
		for (int i=0; i<myArray.length; i++){
			sum = sum + myArray[i];
			
		}
		
		System.out.println("The sum of the array is  " + sum);
		

	}

}
