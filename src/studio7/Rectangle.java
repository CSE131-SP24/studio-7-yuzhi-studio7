package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	public double calculateArea() {
		return width*length;
	}
	
	public double calculatePerimeter() {
		return 2*length+2*width;
	}
	
	public boolean smallerOrGreater (Rectangle r) {
		if (this.calculateArea()>r.calculateArea()) {
			return false;
		}else return true;
	}
	
	public boolean whetherSquare() {
		if (width==length) {
			return true;
		}return false;
	}
	
	public void drawIt() {
		StdDraw.rectangle(0.5, 0.5, width, length);
	}
	
	public String toString() {
		return "this is a rectangle with a width of " + this.width + " and a length of " + this.length;
	}
}