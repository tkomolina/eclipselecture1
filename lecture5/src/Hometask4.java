import java.util.Scanner;

public class Hometask4 {

	/**
	 * @param args
	 */
	/*
	 * Write a program which prints pattern like right angle triangle with
	 * number increased by 1.The pattern for input number of rows : 4 
	 * 1
	 * 2 3 
	 * 4 5 6 
	 * 7 8 9 10
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter triangle size");
		int size = scanner.nextInt();
		int num = 1;
		for (int i = 1; i <= size; i++) {
			String row = " ";
			for (int j = 1; j <= i; j++) {
				row = row + "" + num;
				num = num + 1;
			}
			System.out.println(row);
		}
	}
}