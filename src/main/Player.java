package main;

public class Player {
	private int score;
	public static int round = 0;
	public static boolean turn = true;
	public static String roundLabel = "ROUND 1";
	public static String winner = "BOB WINS!!!";
	public Player() {
		score = 0;
	}
	public int getScore() {
		return score;
	}
	public void won() {
		++score;
		++round;
		roundLabel = "ROUND " + Integer.toString(round+1);
	}
}
