public class StaticTask {	
	
	/*public static int sum(int arg1, int arg2, int arg3) {

		return arg1 + arg2 + arg3;
	}	*/
	

	public static int sumArrayValues(int[] myArray){
		
		int sum=0;
		for (int i=0; i<myArray.length; i++){
			sum = sum + myArray[i];
			}
		return sum;
	}	
	
	public static void printOut(int[] myArray){
		System.out.println("The array is: ");
		for (int i=0; i<myArray.length; i++){
		System.out.print(" " + myArray[i]);
	}	
	
	}
	public static void main(String[] args) {
		
		/*int sum = sum(1, 2, 3);
		System.out.println(sum);*/		
		int[] data = new int[4];
		System.out.println("The sum of the array is: " + sumArrayValues(data));
		printOut(data);
	}
}