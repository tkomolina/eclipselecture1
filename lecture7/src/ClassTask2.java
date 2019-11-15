import java.util.Scanner;


class Car {
	// fields
	String color;
	int age;
	String mark;


void sayMyCar(){
	System.out.println("My car is " + mark + " It is  " + age + " old and it is " + color + " color");
}
}

public class ClassTask2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your car color ");
		String userCarColor = scanner.next();
		Car toyota = new Car();
		toyota.mark = "Toyota";
		toyota.age = 8;
		toyota.color = userCarColor;
		toyota.sayMyCar();
		
		
		Car ford = new Car();
		ford.mark = "Ford";
		ford.age = 2;
		ford.color = "blue";
		ford.sayMyCar();
		

	}

}	
