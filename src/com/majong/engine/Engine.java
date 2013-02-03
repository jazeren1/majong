package com.majong.engine;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.majong.structure.Board;

public class Engine {
	
	public static final String LOG4J_PROPERTIES = "libs/log4j.properties";
	
	static final Logger log = Logger.getLogger(Engine.class);
	
	//TODO not sure when we might need this, but I think we will so I'm putting it in
	static boolean _started = false;
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure(LOG4J_PROPERTIES);
		
		start();		
	}
	
	public static void start(){									
		
		Initializer init = new Initializer();
		InitHelper initHelper = new InitHelper();
		
		int rows = 8;
		int cols = 5;
		int height = 1;
		int tilePairs = 3;			
		
		log.debug("Starting Game with: Rows->" + rows + " cols->" +cols + " height->" + height + " and " + tilePairs + " tile pairs");
		
		//tilePairs, MaxHeight, Rows, Cols
		Board board = init.generateBoard(tilePairs, height, rows, cols);

		board = init.placeTiles(board, initHelper.getSimplePattern(), rows, cols);
		board = init.lockTiles(board, rows, cols);
		initHelper.printGrid(board);
		
		log.debug("about to play a new game...");
		Game game = new Game(board);
		game.playSample();
		//initHelper.printGrid(game.playSample());
		
		_started = true;
	}
	
	public static void stop(){		
		_started = false;
	}

}
