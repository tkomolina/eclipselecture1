import java.util.Arrays;


public class Exercise6 {

	/*Write a Java program to reverse an array of integer values.
➢ int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99}; -> 99,88,...,11
➢Take a look into Arrays.toString(array)
	 */
	public static void main(String[] args) {
		int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		String arrayContent = Arrays.toString(myArray);
		System.out.println(arrayContent);

		for (int i = 0; i < myArray.length / 2; i++) {
			int fromBeginning = myArray[i];
			int fromEnd = myArray[myArray.length - i - 1];

			myArray[myArray.length - i - 1] = fromBeginning;
			myArray[i] = fromEnd;
		}

		String reversedArrayContent = Arrays.toString(myArray);
		System.out.println(reversedArrayContent);
	}
}
	
	/*		myArray[i] = 9 - i;
			System.out.println(myArray[i]);
		System.out.println("Array before reverse " + Arrays.toString(myArray));*/
		
		

	


