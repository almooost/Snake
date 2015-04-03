package com.tsz.snake.ui;

import java.awt.Color;

import com.tsz.snake.game.Snake;

/**
 * GameArea of the SnakeGame
 * Holds various Cells to form the area
 * @author Sam
 *
 */
public class GameArea 
{
	private int width;
	private int height;
	private Color color;
	private int diamondCout;
	private Cell[][] GameArea;
	
	public GameArea(int width, int height, Color color)
	{
		this.width = width;
		this.height = height;
		this.color = color;
		
		this.diamondCout = 0;
		this.GameArea =  new Cell[10][10];
	}
	
	/**
	 * Set initial position of snake
	 * @param x
	 * @param y
	 * @param snake
	 */
	public void setSnakeField(int x, int y, Snake snake)
	{
		
	}
	
	/**
	 * Create new diamonds on GameArea
	 */
	public void createDiamond()
	{
		
	}
	
	/**
	 * Check if cell is occupied
	 * @param cell
	 * @return
	 */
	public boolean isOccupied(Cell cell)
	{
		for(Cell[] cellArray : GameArea)
			for(Cell c : cellArray)
			{
				if(c.compareTo(cell) == 0)
					return true;
			}
		
		return false;
	}
}
