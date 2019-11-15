
public class ArrayBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = 6;
		
		int [] values = new int [4]; 
		System.out.println(values);
		System.out.println(values[0]);
		// System.out.println(values[4]);
		
		values[0] = 9;
		System.out.println(values[0]);
		
		int[] values2 = {1,2,3,4};
		values2[0] = 9;
		System.out.println(values2[0]);
		System.out.println(values2[1]);
		System.out.println(values2[2]);
		System.out.println(values2[3]);
		
		System.out.println("Array size " + values.length);
		
		for (int i = 0; i < values.length; i++){
			System.out.println(values2[i]);
			
		}
		
		System.out.println("Enhanced loops....");
		for (int elem : values2){
			System.out.println(elem);
		}
		

	}

}
