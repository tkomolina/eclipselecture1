package com.accenture.lecture17;

public class CircleApp {

	
	public static void main(String[] args) {
		Circle circle1=new Circle();
		System.out.println("The area of the circle is: "+circle1.getArea());
		Cylinder cyl1=new Cylinder();
		System.out.println(cyl1);
		System.out.println("The area of the cylinder is: " +cyl1.getArea());
		System.out.println("The volume of the cylinder is: "+ cyl1.getVolume());
		

	}

}
