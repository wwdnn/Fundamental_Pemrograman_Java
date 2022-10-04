package Tugas_1;

public class Circle {
	private double radius;
	private String color;
	
	
	Circle() 
	{
		this.radius = 1.0;
		this.color = "red";
	}
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	
	double getRadius()
	{
		return this.radius;
	}
	
	void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	String getColor()
	{
		return this.color;
	}
	
	void setColor(String Color)
	{
		this.color = Color;
	}
	
	double getArea()
	{
		return radius*radius*Math.PI;
	}
	
	public String toString()
	{
		return "Circle[radius=" + this.radius + " Color=" + this.color + "]";
	}
}
