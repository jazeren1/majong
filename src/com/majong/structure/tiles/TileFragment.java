package com.majong.structure.tiles;

public class TileFragment {
	Tile _parent;
	TileFragmentType _type;
	int _height;
	int _row;
	int _col;
	
	public TileFragment(Tile parent, TileFragmentType type){
		setTile(parent);
		setType(type);
	}
	
	public Tile getTile(){ return _parent; }
	public void setTile(Tile parent){ _parent = parent; }
	
	public TileFragmentType getType(){ return _type; }
	public void setType(TileFragmentType type){ _type = type; }
	
	public int getHeight(){ return _height; }
	public void setHeight(int height){ _height = height; }
	
	public int getRow(){ return _row; }
	public void setRow(int row){ _row = row; }
	
	public int getCol() { return _col; }
	public void setCol(int col){ _col = col; }
	
}
