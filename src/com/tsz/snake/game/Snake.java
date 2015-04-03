package com.tsz.snake.game;

import com.tsz.snake.ui.GameArea;

/**
 * Main class of the snake holds some SnakeLists
 * Is used by SnakeGame
 * @author Sam
 *
 */
public class Snake 
{
	private int playerID;
	private int direction;
	private int[] position;
	
	public Snake(int playerID, int[] position)
	{
		this.playerID = playerID;
		this.direction = 0;
		this.position = position;
	}
	
	/**
	 * Move Snake in given direction
	 */
	public void move(int direction)
	{
		this.setDirection( direction );
	}
	
	/**
	 * Set the new direction of the snake
	 * @param direction
	 */
	public void setDirection(int direction)
	{
		this.direction = direction;
	}
	
	/**
	 * Get the next position of the snake
	 * @return
	 */
	public int[] getNextPosition(int[] currentPosition, int[] dPosition, int[] maxPosition)
	{
		int[] nextpos = new int[100];
		return nextpos;
	}
	
	public boolean collisionCheck(int newX, int newY, GameArea GameArea)
	{
		return false;
	}
	
	
}
