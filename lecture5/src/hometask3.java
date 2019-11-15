import java.util.Scanner;

public class hometask3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter triangle size");
		int size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
			// String row = ""
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();

		}
	}

}
