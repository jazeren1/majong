package com.majong.structure;

import java.util.ArrayList;

import com.majong.structure.tiles.Tile;

public class Board {
	
	private int _totalTilePairs;
	private int _maxHeight;
	private int _rows;
	private int _columns;
	private ArrayList<Grid> _grids;
	private ArrayList<Tile> _tiles;
	private Tile _selectedTile;
	
	public Board(int totalTilePairs, int maxHeight, int rows, int columns){
		_totalTilePairs = totalTilePairs;
		_maxHeight = maxHeight;
		_rows = rows;
		_columns = columns;
	}
	
	public int getTotalTilePairs(){ return _totalTilePairs; }
	public void setTotalTilePairs(int totalTilePairs){ _totalTilePairs = totalTilePairs; }
	
	public int getMaxHeight(){ return _maxHeight; }
	public void setMaxHeight(int maxHeight){ _maxHeight = maxHeight; }
	
	public int getRows(){ return _rows; }
	public void setRows(int rows){ _rows = rows; }
	
	public int getColumns(){ return _columns; }
	public void setColumns(int columns){ _columns = columns; }
	
	public ArrayList<Grid> getGrids() { return _grids; }
	public void setGrids(ArrayList<Grid> grids){ _grids = grids; }
	
	public ArrayList<Tile> getTiles() { return _tiles; }
	public void setTiles(ArrayList<Tile> tiles){ _tiles = tiles; }
	
	public Tile getSelectedTile() { return _selectedTile; }
	public void setSelectedTile(Tile tile) { _selectedTile = tile; }
	
}
