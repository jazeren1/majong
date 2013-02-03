package com.majong.structure.tiles;


public class Tile {

	boolean _hasLeftNeighbor = false;
	boolean _hasRightNeighbor = false;
	boolean _hasTopNeighbor = false;
	boolean _isTrapped = false;
	boolean _isSelected = false;
	String _graphic = "";
	TileType _type;
	TileFragment _topFragment;
	TileFragment _bottomFragment;
	
	public boolean getHasLeftNeighbor(){ return _hasLeftNeighbor; }	
	public void setHasLeftNeighbor(boolean leftNeighbor){ _hasLeftNeighbor = leftNeighbor; }
	
	public boolean getHasRightNeighbor(){ return _hasRightNeighbor; }	
	public void setHasRightNeighbor(boolean rightNeighbor){ _hasRightNeighbor = rightNeighbor; }
	
	public boolean getTopLeftNeighbor(){ return _hasTopNeighbor; }	
	public void setHasTopNeighbor(boolean topNeighbor){ _hasTopNeighbor = topNeighbor; }
	
	public boolean getIsTrapped(){ return _isTrapped; }	
	public void setIsTrapped(boolean isTrapped){ _isTrapped = isTrapped; }
	
	public boolean getIsSelected(){ return _isSelected; }	
	public void setIsSelected(boolean isSelected){ _isSelected = isSelected; }
	
	public String getGraphic(){ return _graphic; }	
	public void setGraphic(String graphic){ _graphic = graphic; }
	
	public TileType getType(){ return _type; }
	public void setType(TileType type){ _type = type; }
	
	public TileFragment getTopFragment() { return _topFragment; }
	public void setTopFragment(TileFragment topFragment) { _topFragment = topFragment; }
	
	public TileFragment getBottomFragment() { return _bottomFragment; }
	public void setBottomFragment(TileFragment bottomFragment) { _bottomFragment = bottomFragment; }
	
	
	
}
