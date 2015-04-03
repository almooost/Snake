package com.tsz.snake.store;

/**
 * Holds all HighScores of the player
 * Used by the player
 * Is made of various ScoreItems
 * @author Sam
 *
 */
public class HighScore 
{
	private ScoreItem[] scoreItems;
	private String ScoreBoard;
	
	public HighScore(ScoreItem[] ScoreItem)
	{
		this.scoreItems = ScoreItem;
		this.ScoreBoard = "";
	}
	
	/**
	 * Update current ScoreItem from Player interactions
	 */
	public void updateScore()
	{
		
	}
	 
}
