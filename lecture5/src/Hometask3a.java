import java.util.Scanner;


public class Hometask3a {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter number");
	int size = scanner.nextInt();
	System.out.println("Triegale size " + size);
	for (int i=1; i<= size; i++);
		for (int j=1;j<=3;j++){
			System.out.println(j);
		}
		System.out.println ("......");
		
	
	
	
	for(int i=1; i <= size; i++){
		String row = "";
		for(int j=1;j<=i;j++){		
			row = row + "" + i;
			//System.out.print(i);
		}
		System.out.println(row);
	}
}
}
