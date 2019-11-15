import java.util.Scanner;


public class UserInput {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("What is your name?");
		
		String userName = scanner.nextLine();
		System.out.println("User name is: " + userName);
		
		/*ystem.out.println ("What is your age?");
		int age = scanner1.nextInt();
		System.out.println("User age is: " + age);
*/
	}

}
