import java.util.Scanner;


	/**
	 Create a method which receives array of int and returns sum of array
values
	 */
class Array {	
	int sumValues(int[] processedArray){
		int sum = 0;
		for (int value : processedArray){
			sum = sum + value;
		}
		return sum;
	
	}
		
	
/*void getArray () {
		System.out.println ("The Array is " );*/
		
	}



public class TaskArrayMethod {
	
	public static void main(String[] args) {
		
		
		int[] processedArray = new int [5];
		processedArray [0] = 1;
		processedArray [1] = 2;
		processedArray [2] = 3;
		
		Array myNewArray = new Array();
			
		int sum = myNewArray.sumValues(processedArray);
		
		System.out.println("sum of array " +sum);
		
		
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the values of an array ");*/
		
		
		
		
		
		

	}

}
