package com.tsz.snake.game;

import java.awt.Color;

/**
 * Describes a single element of the snake
 * @author Sam
 *
 */
public class SnakeListNode 
{
	private SnakeListNode next;
	private SnakeListNode previous;
	private int x;
	private int y;
	private Color color;
	
	public SnakeListNode()
	{
		
	}
}
