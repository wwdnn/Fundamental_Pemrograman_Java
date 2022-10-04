package Tugas_2;

public class Circle extends Shape{
	private double radius;
	
	Circle()
	{
		super();
		this.radius = 1.0;
	}
	
	Circle(double radius)
	{
		super();
		this.radius = radius;
	}
	
	Circle(double radius, String color, boolean filled)
	{
		super(color, filled);
		this.radius = radius;
	}
	
	double getRadius()
	{
		return this.radius;
	}
	
	void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	double getArea()
	{
		return this.radius * this.radius * Math.PI;
	}
	
	double getPerimeter()
	{
		return Math.PI * 2 * radius;
	}
	
	public String toString()
	{
		return "Circle[" + super.toString() + "],radius=" + this.radius +"]"; 
	}
	
}
