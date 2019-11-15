import java.util.Scanner;


public class task1 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter positive or negative number");
		float number = scanner.nextFloat();
		if (number > 0) {
			System.out.println(number + " is Positive");
		} else {
			System.out.println(number + " is Negative");
		}
		

	}

}
