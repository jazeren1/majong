package com.majong.engine;

import org.apache.log4j.Logger;

public class TileStatusChecker {

	static final Logger log = Logger.getLogger(TileStatusChecker.class);
	
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
