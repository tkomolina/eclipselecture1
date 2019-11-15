import java.util.Scanner;

public class Circle {
	double radius;
	double area;
	double circum;

	/*void getRadius() {
		System.out.println("The radius size of the circle is " + radius);
	
	}

	void getArea() {
		System.out.println("The area of the circle is " + area);
	}

	void getCircum() {
		System.out.println("The circum of the circle is " + circum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter radius size for the circle ");
		double radiusSize = scanner.nextDouble();
		Circle circle1 = new Circle();
		circle1.radius = radiusSize;
		circle1.getRadius();
		circle1.area = Math.PI * radiusSize * radiusSize;
		circle1.circum = 2 * (Math.PI * radiusSize);
		circle1.getArea();
		circle1.getCircum();
	}
}*/
	
	double getRadius() {
		return radius;
	}
	
	double getArea(){
		return radius*radius*Math.PI;   // trenera variants bez skenera
	}
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		circle1.radius = 2.0;
		System.out.println(circle1.getArea());
	
	}
	}