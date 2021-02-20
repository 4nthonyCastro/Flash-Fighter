package flashFighter;

import java.util.Scanner;

public class Player {
	private String playerName; 
	private Double playerScore;
	
	/*
	 * Player Constructor 
	 */
	public Player () {
		Scanner userInput = new Scanner(System.in);
		playerScore = 0.00;
		playerName = "";
		System.out.println("Enter your Name: \n");
		setPlayerName(userInput.next());
	}
	
	/*
	 * Player Existing Constructor
	 */
	public Player (Double score, String name) {
		setPlayerName(name);
		setPlayerScore(score);
	}
	
	/*
	 * Set Player Variables
	 */
	public void setPlayerScore (double playerScore) {
		this.playerScore = playerScore;
	}
	
	public void setPlayerName (String playerName) {
		this.playerName = playerName;
	}
	
	/*
	 * Get Player Variables
	 */
	public String getName() {
		return playerName;
	}
	
	public double getScore() {
		return playerScore; 
	}
}
