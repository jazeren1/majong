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
		
		//tilePairs, MaxHeight, Rows, Cols
		Board board = init.generateBoard(16, 1, 5, 5);

		board = init.placeTiles(board, initHelper.getSimplePattern(), 5, 5);
		initHelper.printGrid(board);
		
		_started = true;
	}
	
	public static void stop(){
		_started = false;
	}

}
