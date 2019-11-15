
public class Exercise3 {

	/*Write a program that fills a 10-element array with numbers from 9 to 0, using
loop
	 */
	
	public static void main(String[] args) {
		
		int[] values = new int[10];
		for(int i=0; i<=9;i++){
			values[i] = 9 - i;
			System.out.println(values[i]);
		
		
		
/*		wrong way:
 * int[] values = { 9,8,7,6,5,4,3,2,1,0 };
	System.out.println("array size = " + values.length);
	for (int i = 0; i < values.length; i++) {
		System.out.println(values[i]);
			
			also wrong way 		
			/*		for(int i=9; i>=0;i--){		
						values[i] = i;
			System.out.println(values[i]);*/
		
	}
	}
}

	

