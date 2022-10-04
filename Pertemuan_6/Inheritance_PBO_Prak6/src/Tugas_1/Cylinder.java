package Tugas_1;

public class Cylinder extends Circle {
	private double height;

	Cylinder() {
		super();
		height = 1.0;
	}

	Cylinder(double height) {
		super();
		this.height = height;
	}

	Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	Cylinder(double radius, double height, String color)
	{
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}

	public double getVolume() {
		return getArea() * this.height;
	}

	public double getArea() {
		return 2 * Math.PI * getRadius() * this.height * 2 * super.getArea();
	}

	public String toString() {
		return "Cylinder: subclass of " + super.toString() + " height=" + this.height;
	}

}
