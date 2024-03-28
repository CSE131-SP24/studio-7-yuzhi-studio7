package studio7;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex (double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex getSum (Complex c) {
		return new Complex (this.realPart+c.realPart, this.imaginaryPart+c.imaginaryPart);
	}
	
	public Complex getProduct (Complex d) {
		double newRealPart = this.realPart*d.realPart - this.imaginaryPart*d.imaginaryPart;
		double newImaginaryPart = this.realPart * d.imaginaryPart + this.imaginaryPart * d.realPart;
		return new Complex (newRealPart, newImaginaryPart);
	}
	
	public String toString() {
		return realPart + "+" + imaginaryPart + "i";
	}
}
