package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public Fraction calculateSum (Fraction f) {
		int commonDenominator = this.denominator * f.denominator;
		int thisNewNumerator = this.numerator * f.denominator;
		int fNewNumerator = f.numerator * this.denominator;
		int newNumerator = thisNewNumerator + fNewNumerator;
		return new Fraction (newNumerator, commonDenominator);
	}
	
	public Fraction calculateProduct (Fraction f) {
		return new Fraction(this.numerator*f.numerator, this.denominator * f.denominator);
	}
	
	public Fraction reciprocal() {
		return new Fraction (denominator, numerator);
	}
	
	public Fraction simplify() {
		int simplifiedNumerator = numerator;
		int simplifiedDenominator = denominator;
		for (int i = 2; i<numerator; i++) {
			if (numerator%i ==0) {
				if (denominator%i == 0) {
					simplifiedNumerator = numerator/i;
					simplifiedDenominator = denominator/i;
				}
			}
		}return new Fraction (simplifiedNumerator, simplifiedDenominator);
	}
	
	public String toString() {
		return "this is a fraction of " + numerator + "/" + denominator;
	}
}
