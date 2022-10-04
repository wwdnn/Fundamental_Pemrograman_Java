package Tugas_2;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	Rectangle()
	{
		this.width = 1.0;
		this.length = 1.0;
	}
	
	Rectangle(double width, double length)
	{
		this.width = width;
		this.length = length;
	}
	
	Rectangle(double width, double length, String color, boolean filled)
	{
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	double getWidth()
	{
		return this.width;
	}
	
	void setWidth(double width)
	{
		this.width = width;
	}
	
	double getLength()
	{
		return this.length;
	}
	
	void setLength(double length)
	{
		this.length = length;
	}
	
	double getArea()
	{
		return this.width * this.length;
	}
	
	double getPerimeter()
	{
		return 2 * (this.width + this.length);
	}
	
	public String toString()
	{
		return "Rectangle[" + super.toString() + "], width=" + this.width + ", length" + this.length + "]]";
	}
}
