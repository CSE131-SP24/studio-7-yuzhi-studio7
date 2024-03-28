package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNumber;
	private boolean rightHanded;
	private int shootDirection; //1: right, 2: left, 3: both
	private int numGoals;
	private int numAssists;
	private int points;
	
	public HockeyPlayer (String name, int jerseyNumber, boolean rightHanded, int shootDirection) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.rightHanded = rightHanded;
		this.shootDirection = shootDirection;
		this.numGoals = 0;
		this.numAssists = 0;
		this.points = 0;
	}
	
	public void updatedNumGoals(int goalsThisGame) {
		this.numGoals += goalsThisGame;
	}
	
	public void updatedNumAssists(int assistsThisGame) {
		this.numAssists += assistsThisGame;
	}
	
	public void updatedPoints() {
		this.points = numGoals +numAssists;
	}
	
	public String toString() {
		return name + ": " + jerseyNumber + " Number of Goals: " + numGoals + " Number of Assists: " + numAssists + "Points: " + points;
	}
}
