package com.tsz.snake.game;

import java.awt.Color;
import java.util.ArrayList;

import com.tsz.snake.ui.GameArea;

/**
 * SnakeGame class is the primary snake game object
 * Interacts with UI and Store
 * @author Sam Alfano
 *
 */

public class SnakeGame 
{
	
	private boolean gameIsPlaying;
	private GameArea GameArea;
	private Player Player;
	private ArrayList<String> Control;
	private Snake[] Snakes;

	
	public SnakeGame()
	{
		this.GameArea = new GameArea(0, 0, new Color(0));
		this.Player = new Player();
		this.Control = new ArrayList<String>();
	}
	
	/**
	 * Refreshes the GameArea
	 * @return boolean
	 */
	public void updateGameArea()
	{
		
	}
	
	/**
	 * Listener on keyboard events and executes commands
	 * @return boolean
	 */
	public boolean onKeyUp()
	{
		return false;
	}
}
