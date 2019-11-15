public class Exercise1 {

	// Write a program that fills a 10-element array with numbers from 0 to 9,
	// using loop

	public static void main(String[] args) {
		int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);

		}
	}
}

/*public static void main(String[] args) {
	int[] values = new int[10]; // 0,0,0,....		
	
	// assigning to each array element its index
	for(int i=0; i < 10; i++){			
		values[i] = i;
	}		
	//print out each array element
	for(int i=0; i < 10; i++){			
		System.out.println(values[i]);*/