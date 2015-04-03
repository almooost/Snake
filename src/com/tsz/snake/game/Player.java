package com.tsz.snake.game;

import com.tsz.snake.store.HighScore;
import com.tsz.snake.store.ScoreItem;

/**
 * Represents the snake player
 * @author Sam
 *
 */
public class Player 
{
	private int id;
	private String name;
	private int points;
	private HighScore HighScore;

	public Player(String name)
	{
		this.name = name;
		this.id = 1;
		this.points = 0;
	}
	
	/**
	 * Create KeyPress event
	 */
	public void KeyPress()
	{
		
	}
}
