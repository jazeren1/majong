package com.majong.engine;

import java.util.ArrayList;

import com.majong.structure.Board;
import com.majong.structure.Grid;
import com.majong.structure.tiles.Tile;
import com.majong.structure.tiles.TileFragment;
import com.majong.structure.tiles.TileFragmentType;

public class Game {

	private Board _board;
	//TODO Make sure _selectedTile is always toggled to null if there is no currently selected tile
	private Tile _selectedTile;
	
	public Game(Board board){
		this._board = board;
	}
	
	public Board playSample(){
		
		System.out.println("Getting Tile at 0,2...");
		Tile tile = getTile(0, 0, 2);
		System.out.println("Found TIle at 0,2: " + tile.getType() + " " + tile.getGraphic());
		removeTile(0, 0, 2);
		System.out.println("Removed Tile at 0,2 ...");
		
		return _board;
	}
	
	private void selectTile(Tile tile){
		
		//if there is no currently selected tile then select it
		if(_selectedTile == null){			
			tile.setIsSelected(true);
			_selectedTile = tile;			
		}
		else{
			if(tile.getType() == _selectedTile.getType()){
				clearMatch(tile);
			}
			else{
				tile.setIsSelected(true);
				_selectedTile = tile;	
			}
		}
		
	}
	
	private void clearMatch(Tile tile){
		
		//TODO clear the match from the board
		
	}
	
	private Tile getTile(int height, int row, int col){
		
		Tile tile;
		
		ArrayList<Grid> grids = _board.getGrids();
		
		TileFragment[][] wholeGrid = grids.get(height).getFullGrid();
		
		tile = wholeGrid[row][col].getTile();
		
		return tile;
		
	}
	
	private void removeTile(int height, int row, int col){
		
		Tile tile;
		
		ArrayList<Grid> grids = _board.getGrids();		
		TileFragment[][] wholeGrid = grids.get(height).getFullGrid();
		
		TileFragment fragment = wholeGrid[row][col];
		
		if(fragment.getType() == TileFragmentType.TOP){
			wholeGrid[row][col] = null;
			wholeGrid[row+1][col] = null;
		}
		else if (fragment.getType() == TileFragmentType.BOTTOM){
			wholeGrid[row][col] = null;
			wholeGrid[row-1][col] = null;
		}
		
		grids.get(height).setFullGrid(wholeGrid);
		_board.setGrids(grids);
		
		//InitHelper helper = new InitHelper();
		//helper.printGrid(_board);
	}

	
}
