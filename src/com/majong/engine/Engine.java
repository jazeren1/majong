package com.majong.engine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import com.majong.structure.Board;
import com.majong.structure.Grid;
import com.majong.structure.tiles.Bamboos;
import com.majong.structure.tiles.Characters;
import com.majong.structure.tiles.Dots;
import com.majong.structure.tiles.Flowers;
import com.majong.structure.tiles.Honors;
import com.majong.structure.tiles.Seasons;
import com.majong.structure.tiles.Tile;
import com.majong.structure.tiles.TileType;

public class Engine {
	
	//TODO not sure when we might need this, but I think we will so I'm putting it in
	static boolean _started = false;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		start();		
	}
	
	public static void start(){				
		Initializer init = new Initializer();
		InitHelper initHelper = new InitHelper();
		
		int rows = 8;
		int cols = 5;
		int height = 1;
		int tilePairs = 1;
		
		//tilePairs, MaxHeight, Rows, Cols
		Board board = init.generateBoard(tilePairs, height, rows, cols);

		board = init.placeTiles(board, initHelper.getSimplePattern(), rows, cols);
		board = init.lockTiles(board, rows, cols);
		initHelper.printGrid(board);
		
		Game game = new Game(board);
		//game.playSample();
		initHelper.printGrid(game.playSample());
		
		_started = true;
	}
	
	public static void stop(){
		_started = false;
	}

}
