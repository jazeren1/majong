package com.majong.structure;

import com.majong.structure.tiles.Tile;

public class Grid {
	
	private int _rows;
	private int _columns;
	private Tile[][] _fullGrid;
	
	public Grid(int rows, int columns){
		_rows = rows;
		_columns = columns;
		_fullGrid = new Tile[rows][columns];
	}
	
	public int getRows(){ return _rows; }
	public void setRows(int rows){ _rows = rows; }
	
	public int getColumns(){ return _columns; }
	public void setColumns(int columns){ _columns = columns; }
	
	public Tile[][] getFullGrid(){ return _fullGrid; }
	public void setFullGrid(Tile[][] fullGrid){ _fullGrid = fullGrid; }
	
}
