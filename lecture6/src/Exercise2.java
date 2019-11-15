import java.util.Scanner;

/* Write a program which will return day name based on dayIndex using array.
User should be informed if he has entered incorrect index. */

public class Exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] days = { "Monday", "Tuesday", "wednesday", "Thursday",
				"Friday", "Saturday", "Sunday" };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the index of the day");
		int dayIndex = scanner.nextInt();

		if (dayIndex > 6 || dayIndex < 1) {
			System.out.println("Invalid dayIndex");

		} else {
			System.out.println(days[dayIndex - 1]);

		}

	}
}

