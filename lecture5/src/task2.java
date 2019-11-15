import java.util.Scanner;


public class task2 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of the day");
		
		int dayIndex =scanner.nextInt();
		
        switch (dayIndex) {
          case 1: 
         	 System.out.println("Monday");
          		break; 
          case 2:
         	 System.out.println("Tuesday");    //Tresais variants
         	 	break;
          case 3:
         	 System.out.println("Wednesday");
         	 break;
          case 4:
          	 System.out.println("Thursday");
          	 break;
          case 5:
           	 System.out.println("Friday");
         	 	break;
          default: System.out.println ("Invalid day");

	}

}
}