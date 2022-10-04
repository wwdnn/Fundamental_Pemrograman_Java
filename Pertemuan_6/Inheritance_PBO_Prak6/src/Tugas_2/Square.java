package Tugas_2;

public class Square extends Rectangle {
	
	Square()
	{
		super();
	}
	
	Square(double side)
	{
		super(side, side);
	}
	
	Square(double side, String color, boolean filled)
	{
		super(side, side, color, filled);
	}
	
	double getSide()
	{
		return super.getWidth();
	}
	
	void setSide(double side)
	{
		super.setWidth(side);
	}
	
	void setWidth(double side)
	{
		super.setWidth(side);
	}
	
	void setLength(double side)
	{
		super.setLength(side);
	}
	
	double getPerimeter()
	{
		return 4 * getSide();
	}
	
	public String toString()
	{
		return "Square[Rectangle[" + super.toString() + "], width=" + getSide() + ", length" + getSide() + "]]";
	}
	
}

