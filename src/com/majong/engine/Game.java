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
		
		System.out.println("Getting Tile at 0,1,1...");
		Tile tile = getTile(0, 1, 1);
		System.out.println("Found TIle at 0,1,1: " + tile.getType() + " " + tile.getGraphic() + " atzzz: " + tile.getTopFragment().getHeight() + "," + tile.getTopFragment().getRow() + "," + tile.getTopFragment().getCol());
		selectTile(tile);
		
		System.out.println("Selected TIle is: " + _selectedTile.getGraphic() + " at " + _selectedTile.getTopFragment().getHeight() + "," + _selectedTile.getTopFragment().getRow() + "," + _selectedTile.getTopFragment().getCol());
		
		Tile tile2 = getTile(0, 1, 2);
		System.out.println("Found Tile at 0,1,2: " + tile2.getType() + " " + tile.getGraphic());
		selectTile(tile2);
		
		if(_selectedTile == null){
			System.out.println("SelectedTile is NULL");
		}
		else{
			System.out.println("Selected TIle is: " + _selectedTile.getGraphic() + " at " + _selectedTile.getTopFragment().getHeight() + "," + _selectedTile.getTopFragment().getRow() + "," + _selectedTile.getTopFragment().getCol());
		}
		
		return _board;
	}
	
	private void selectTile(Tile tile){
		
		if(!tile.getIsTrapped()){
			//if there is no currently selected tile then select it
			if(_selectedTile == null){			
				System.out.println("Setting Selected TIle: " + tile.getTopFragment().getHeight() + "," + tile.getTopFragment().getRow() + "," + tile.getTopFragment().getCol());
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
		else {
			System.out.println("Cannot select tile, tile " + tile.getGraphic() + " is trapped.");
		}
		
	}
	
	private void clearMatch(Tile tile){
		
		int height = tile.getTopFragment().getHeight();
		int row = tile.getTopFragment().getRow();
		int col = tile.getTopFragment().getCol();
		System.out.println("height: " + height + " row: " + row + " col: " + col);
		
		removeTile(height, row, col);
		System.out.println("Removed tile1: " + height + " "  + row + " " + col);
		
		height = _selectedTile.getTopFragment().getHeight();
		row = _selectedTile.getTopFragment().getRow();
		col = _selectedTile.getTopFragment().getCol();
		
		System.out.println("height: " + height + " row: " + row + " col: " + col);
		removeTile(height, row, col);
		System.out.println("Removed tile2: " + height + " "  + row + " " + col);
		
		_selectedTile = null;
		
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

	}
	
}