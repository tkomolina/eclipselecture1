package com.accenture.lecture17;

public class Circle {

	protected double radius = 1.0;
	protected String color = "red";

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "The radius of the circle is: " + radius + " , color is "
				+ color;
	}

	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

}
