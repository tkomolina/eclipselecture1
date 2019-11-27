package com.accenture.lecture17;

public class Cylinder extends Circle {

	private double height = 1.0;

	public Cylinder() {
		this.height = height;
	}

	public Cylinder(double height) {
		this.height = height;
	}

	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	public Cylinder(double height, double radius, String color) {
		this.height = height;
		this.radius = radius;
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return "Cylinder [height="+ height + ", radius=" +radius+ ", getArea()="+ getArea()+ ", getVolume()="+ getVolume();
	}

	@Override
	public double getArea() {
		return 2*super.getArea()+height*(2*Math.PI*radius);
	}

	public double getVolume() {
		return getArea() * height;
	}

	public static void main(String[] args) {

	}

}
