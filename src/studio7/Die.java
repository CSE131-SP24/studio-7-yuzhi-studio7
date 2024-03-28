package studio7;

public class Die {
	private int numSides;
	
	public Die (int n) {
		this.numSides = n;
	}
	public int getNumSides() {
		return numSides;
		
	}
	public int getRandom() {
		return (int)(Math.random()*numSides+1);
	}
	
	public String toString() {
		return "this is a die with " + numSides + " sides.";
	}
}
