import java.util.Scanner;

public class Exercise5 {

	/*
	 * Write a program to evaluate if an array contains a value entered by user.
	 * Test data int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99}; User
	 * input 22. Output: number 22 is inside of an array.
	 */

	/*public static void main(String[] args) {
		int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int arrayNumber = scanner.nextInt();
		
		boolean isValueFound = false;
		
		for (int elem : myArray) {
			if (elem == arrayNumber) {
				isValueFound = true;
				break;
			}
		}
		if (isValueFound){
				System.out.println("number" +arrayNumber +"is inside");

			} else {
				System.out.println("This number is not inside an array");
				

			}
			
		}
		
	

}*/




	public static void main(String[] args) {
		int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Scanner scanner = new Scanner(System.in);
		int foundElementIndex = -1;
		do {
			System.out.println("Enter searched value:");
			int searchedValue = scanner.nextInt();
			for (int i = 0; i < myArray.length; i++) {
				if (myArray[i] == searchedValue) {
					foundElementIndex = i;
					break;
				}
			}
			if (foundElementIndex >= 0) {
				System.out.println(" Searched value " + searchedValue
						+ " is found on index " + foundElementIndex);
			} else {
				System.out.println(" Searched value " + searchedValue
						+ " not found");
			}
		} while (foundElementIndex < 0);
	}
}