package com.majong.structure.tiles;

public class TileFragment {
	Tile _parent;
	TileFragmentType _type;
	
	public TileFragment(Tile parent, TileFragmentType type){
		setTile(parent);
		setType(type);
	}
	
	public Tile getTile(){ return _parent; }
	public void setTile(Tile parent){ _parent = parent; }
	
	public TileFragmentType getType(){ return _type; }
	public void setType(TileFragmentType type){ _type = type; }
	
}
