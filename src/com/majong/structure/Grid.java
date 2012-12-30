package com.majong.structure;

public class Grid {
	
	private int _rows;
	private int _columns;
	private String[][] _fullGrid;
	
	public Grid(int rows, int columns){
		_rows = rows;
		_columns = columns;
		_fullGrid = new String[rows][columns];
	}
	
	public int getRows(){ return _rows; }
	public void setRows(int rows){ _rows = rows; }
	
	public int getColumns(){ return _columns; }
	public void setColumns(int columns){ _columns = columns; }
	
	public String[][] getFullGrid(){ return _fullGrid; }
	public void setFullGrid(String[][] fullGrid){ _fullGrid = fullGrid; }
	
}
