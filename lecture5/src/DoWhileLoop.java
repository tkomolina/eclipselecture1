import java.util.Scanner;


public class DoWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");// Variants ar while
		int value = scanner.nextInt();

		while (value != 5) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		
		/*int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt(); //Variants ar Do while
		}
		while (value != 5);
	
		System.out.println("Got 5");*/
	}

	}


