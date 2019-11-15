import java.util.Scanner;

class Cars {
	// fields
	String color;
	int age;
	String mark;
}

public class App {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*String name = "Toyota";
		int age = 8;
		String color = "red";
		
		String name1 = "Anna";
		int age2 = 22;
		boolean man2 = true;*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your car color ");
		String userCarColor = scanner.next();
		//System.out.println("My car is " + userCarColor);
		
				
		
		Cars toyota = new Cars();
		toyota.mark = "Toyota";
		toyota.age = 8;
		toyota.color = userCarColor;
		System.out.println("Your car is " + toyota.color + " color");
		
	}
}
