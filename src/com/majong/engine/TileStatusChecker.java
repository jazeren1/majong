package com.majong.engine;

public class TileStatusChecker {

	public boolean isLocked(){
		boolean locked = false;
		
		if(hasLeftNeighbor() && hasRightNeighbor()){
			locked = true;
		}
		
		return locked;
	}
	
	private boolean hasLeftNeighbor(){
		boolean leftNeighbor = false;
		
		return leftNeighbor;
	}
	
	private boolean hasRightNeighbor(){
		boolean rightNeighbor = false;
		
		return rightNeighbor;
	}
	
}
