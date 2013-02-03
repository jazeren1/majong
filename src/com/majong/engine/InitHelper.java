package com.majong.engine;

import org.apache.log4j.Logger;

import com.majong.structure.Board;
import com.majong.structure.Grid;
import com.majong.structure.tiles.Tile;
import com.majong.structure.tiles.TileFragment;

public class InitHelper {
	
	static final Logger log = Logger.getLogger(InitHelper.class);
	
	public String[][] getSimplePattern(){
		String[][] pattern = new String[10][6];
		
		//pattern[0][2] = "1";
		pattern[1][1] = "1";
		pattern[1][2] = "1";
		//pattern[1][3] = "1";
		pattern[2][1] = "1";
		pattern[2][2] = "1";
		//pattern[2][3] = "1";
		//pattern[3][2] = "1";

		return pattern;
	}
	/*
	public String[][] getSimplePattern(){
		String[][] pattern = new String[10][6];
		
		pattern[0][2] = "1";
		pattern[1][1] = "1";
		pattern[1][2] = "1";
		pattern[1][3] = "1";
		pattern[1][4] = "1";
		pattern[2][1] = "1";
		pattern[2][2] = "1";
		pattern[2][3] = "1";
		pattern[2][4] = "1";
		pattern[3][2] = "1";
		pattern[3][3] = "1";
		pattern[4][2] = "1";
		pattern[5][2] = "1";
		pattern[6][2] = "1";
		pattern[7][2] = "1";
		return pattern;
	}
	*/
	
	public void printGrid(Board board){
		log.debug("Printing Majong Grid of Size: " + board.getRows() + " X " + board.getColumns() + " with " + board.getTotalTilePairs()*2 + " total tiles");
		log.debug("------------------------------------------------------");
		
		for(int i = 0; i < board.getGrids().size(); i++){
			Grid g = board.getGrids().get(i);
			String debugBoard = "";
			
			debugBoard += "LOOKING AT Grid Num: ";
			debugBoard += Integer.toString(i);
			
			for(int j = 0; j < g.getRows(); j++){
				debugBoard += "\r\n";
				System.out.print("\r\n");
				for(int k = 0; k < g.getColumns(); k++){
					TileFragment fragment = g.getFullGrid()[j][k];
					
					if(fragment != null){
						Tile curTile = fragment.getTile();
						if(curTile.getIsTrapped()){
							debugBoard += "L" + curTile.getGraphic() + fragment.getType().toString().substring(0,1) + "\t";
						}
						else{
							debugBoard += curTile.getGraphic() + fragment.getType().toString().substring(0,1) + "\t";
						}
					}
					else{
						debugBoard += "X\t";
					}
				}
			}
			log.debug(debugBoard);
			
		}
	}
	
}
