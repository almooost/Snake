package com.tsz.snake.ui;

/**
 * Single Cell of the GameArea
 * Is used by GameArea Class
 * @author Sam
 *
 */
public class Cell implements Comparable 
{
	private int x;
	private int y;
	
	public Cell(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Get X position of Cell
	 * @return x
	 */
	public int getX()
	{
		return this.x;
	}
	
	/**
	 * Get Y position of Cell
	 * @return y
	 */
	public int getY()
	{
		return this.y;
	}

	/**
	 * Compare Cell to another cell
	 */
	public int compareTo(Object o) {
		Cell c = (Cell)o;
		if(c.getX() == this.getX() && c.getY() == this.getY())
			return 0;
		else
			return -1;
	}
}
