package com.majong.engine;

import com.majong.structure.Board;
import com.majong.structure.Grid;
import com.majong.structure.tiles.Tile;
import com.majong.structure.tiles.TileFragment;

public class InitHelper {
	
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
		System.out.println("Printing Majong Grid of Size: " + board.getRows() + " X " + board.getColumns() + " with " + board.getTotalTilePairs()*2 + " total tiles");
		System.out.println("------------------------------------------------------");
		
		for(int i = 0; i < board.getGrids().size(); i++){
			Grid g = board.getGrids().get(i);
			System.out.println("LOOKING AT Grid Num: " + i);
			System.out.println("-------------------------");
			for(int j = 0; j < g.getRows(); j++){
				System.out.println("");
				for(int k = 0; k < g.getColumns(); k++){
					TileFragment fragment = g.getFullGrid()[j][k];
					
					if(fragment != null){
						Tile curTile = fragment.getTile();
						if(curTile.getIsTrapped()){
							System.out.print("L" + curTile.getGraphic() + fragment.getType().toString().substring(0,1) + "\t");
						}
						else{
							System.out.print(curTile.getGraphic() + fragment.getType().toString().substring(0,1) + "\t");
						}
					}
					else{
						System.out.print("X\t");
					}
				}
			}
			
		}
	}
	
}
