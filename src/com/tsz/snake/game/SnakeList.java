package com.tsz.snake.game;

/**
 * Forms the body of the snake
 * Needs SnakeListNodes
 * Is used by Snake
 * @author Sam Alfano
 *
 */
public class SnakeList 
{
	private SnakeListNode head;
	private SnakeListNode tail;
	
	public SnakeList(SnakeListNode head, SnakeListNode tail)
	{
		this.head = head;
		this.tail = tail;
	}
	/**
	 * Expand Snakelist into given positon
	 * @param x
	 * @param y
	 */
	public void expand(int x, int y)
	{
		
	}
	
	/**
	 * Cut of the tail of the snake
	 * is used for moving foreward
	 */
	public void shrink()
	{
		
	}
	
	public void moveHead(int newX, int newY)
	{
		
	}
}
