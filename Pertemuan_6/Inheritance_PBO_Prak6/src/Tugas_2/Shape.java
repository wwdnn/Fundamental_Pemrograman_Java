package Tugas_2;

public class Shape {
	private String color;
	private boolean filled;
	
	Shape()
	{
		this.color = "green";
		this.filled = true;
	}
	
	Shape(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	String getColor()
	{
		return this.color;
	}
	
	void setColor(String color)
	{
		this.color = color;
	}
	
	boolean isFilled()
	{
		return this.filled;
	}
	
	void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public String toString()
	{
		return "Shape [color=" + this.color + ", filled=" + this.filled + "]";
	}
}
