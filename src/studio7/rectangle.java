package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	private double length;
	private double width;
	private double x;
	private double y;
	
	public rectangle(double llength, double wwidth, double xposition, double yposition){
		length = llength;
		width = wwidth;
		x = xposition;
		y = yposition;
	}
	
	public double area(){
		double area = length*width;
		System.out.println("The area is: " + area );
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2*length * 2*width;
		System.out.println("The perimeter is: " + perimeter);
		return perimeter;
	}
	
	public boolean isSquare() {
		if (length == width)
		{
			System.out.println("I am a square!");
			return true;
		}
		else
		{
			System.out.println("I am a rectangle, but not a square :(");
			return false;
		}	
	}
	
	public boolean isSmaller(rectangle other) {
		if(other.area() < this.area())
		{
			System.out.println("bigger");
			return false;
		}
		else
		{
			System.out.println("smaller");
			return true;
		}
	}
	
	public void draw() {
		if (isSquare())
		{
			StdDraw.square(x, y, 0.5*length);
		}
		else
		{
			StdDraw.rectangle(x, y, 0.5*width, 0.5*length);
		}
	}
	public static void main(String[] args) {
		rectangle allison = new rectangle(0.3, 0.6, 0.5, 0.5);
		rectangle alice = new rectangle(0.5, 0.5, 0.5, 0.5);
		allison.area();
		allison.perimeter();
		allison.isSmaller(alice);
		allison.draw();
		alice.draw();
}
}
	
