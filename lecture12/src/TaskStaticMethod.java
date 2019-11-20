
public class TaskStaticMethod {

	/**
	Create a static method which will do sum of passed arguments
	Print out all passed arguments into public static void main(String[] args) as one concatenated string
	 */
	
	static int a;
	static int b;
	static String name;
	
	static int sum (int a,int b){
		return  a + b;
		
	}
		
		
	
	public static void main(String[] args) {
		System.out.println(TaskStaticMethod.sum(1, 3));
		

	}

}
