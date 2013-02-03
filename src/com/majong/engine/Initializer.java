package com.majong.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Stack;

import com.majong.structure.Board;
import com.majong.structure.Grid;
import com.majong.structure.tiles.Bamboos;
import com.majong.structure.tiles.Characters;
import com.majong.structure.tiles.Dots;
import com.majong.structure.tiles.Flowers;
import com.majong.structure.tiles.Honors;
import com.majong.structure.tiles.Seasons;
import com.majong.structure.tiles.Tile;
import com.majong.structure.tiles.TileFragment;
import com.majong.structure.tiles.TileFragmentType;
import com.majong.structure.tiles.TileType;

public class Initializer {

	public Board generateBoard(int tilePairs, int maxHeight, int rows, int columns){				
		
		Board board = new Board(tilePairs, maxHeight, rows, columns);
		
		ArrayList<Grid> grids = new ArrayList<Grid>();
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		
		for(int i = 0; i < maxHeight; i++){
			grids.add(new Grid(rows, columns));
		}
		
		tiles = createTiles(tilePairs);
		
		board.setGrids(grids);
		board.setTiles(tiles);
		
		return board;
		
	}
	
	public ArrayList<Tile> createTiles(int tilePairs){
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		int count = 0;
		
		while(count < tilePairs){		
			System.out.println("TilePairs at count: " + count);
			for(TileType type : TileType.values()){
				if(count == tilePairs){
					break;
				}
				if(type == TileType.BAMBOOS){
					System.out.println("TYpe is Bamboos" + TileType.BAMBOOS);
					//make bamboos
					for(Bamboos bamboo : Bamboos.values()){
						Tile tile = new Tile();
						Tile tilePair = new Tile();
						
						tile.setGraphic(bamboo.toString());
						tilePair.setGraphic(bamboo.toString());
						tile.setType(type);
						tilePair.setType(type);
						tiles.add(tile);										
						tiles.add(tilePair);
						
						System.out.println("TYpe: " + bamboo);
						
						count++;
						System.out.println("Count: " + count);
						if(count == tilePairs){
							break;
						}
					}
				}
				if(type == TileType.CHARACTERS){	
					System.out.println("TYpe is Chars" + TileType.CHARACTERS);
					//make characters
					for(Characters characters : Characters.values()){
						Tile tile = new Tile();
						Tile tilePair = new Tile();
						tile.setGraphic(characters.toString());
						tilePair.setGraphic(characters.toString());
						tile.setType(type);
						tilePair.setType(type);
						tiles.add(tile);	
						tiles.add(tilePair);
						
						System.out.println("TYpe: " + characters);
						count++;
						System.out.println("Count: " + count);
						if(count == tilePairs){
							break;
						}
					}
				}
				if(type == TileType.DOTS){
					System.out.println("TYpe is Chars" + TileType.DOTS);
					//make dots
					for(Dots dots : Dots.values()){
						Tile tile = new Tile();
						tile.setGraphic(dots.toString());
						tile.setType(type);
						tiles.add(tile);
						tile.setGraphic(dots.toString());
						tile.setType(type);
						tiles.add(tile);
						
						System.out.println("TYpe: " + dots);
						
						count++;
						System.out.println("Count: " + count);
						if(count == tilePairs){
							break;
						}
					}
				}
				if(type == TileType.HONORS){
					System.out.println("TYpe is Chars" + TileType.HONORS);
					//make honors
					for(Honors honors : Honors.values()){
						Tile tile = new Tile();
						tile.setGraphic(honors.toString());
						tile.setType(type);
						tiles.add(tile);
						tile.setGraphic(honors.toString());
						tile.setType(type);
						tiles.add(tile);
						
						System.out.println("TYpe: " + honors);
						
						count++;
						System.out.println("Count: " + count);
						if(count == tilePairs){
							break;
						}
					}
				}
				if(type == TileType.FLOWERS){
					System.out.println("TYpe is Chars" + TileType.FLOWERS);
					//make flowers
					for(Flowers flowers : Flowers.values()){
						Tile tile = new Tile();
						tile.setGraphic(flowers.toString());
						tile.setType(type);
						tiles.add(tile);
						tile.setGraphic(flowers.toString());
						tile.setType(type);
						tiles.add(tile);
						
						System.out.println("TYpe: " + flowers);
						
						count++;
						System.out.println("Count: " + count);
						if(count == tilePairs){
							break;
						}
					}
				}
				if(type == TileType.SEASONS){
					System.out.println("TYpe is Chars" + TileType.SEASONS);
					//make seasons
					for(Seasons seasons : Seasons.values()){
						Tile tile = new Tile();
						tile.setGraphic(seasons.toString());
						tile.setType(type);
						tiles.add(tile);
						tile.setGraphic(seasons.toString());
						tile.setType(type);
						tiles.add(tile);
						
						System.out.println("TYpe: " + seasons);
						
						count++;
						System.out.println("Count: " + count);
						if(count == tilePairs){
							break;
						}
					}
				}
			}		
		}
		
		tiles = randomizeTiles(tiles);
		
		return tiles;
	}
	
	/*
	public Board randomlyPlaceTiles(Board board){
		Board b = board;
		
		ArrayList<Tile> allTiles = board.getTiles();
		ArrayList<Grid> gridsWithTiles = new ArrayList<Grid>();
		
		int totalGridRows = board.getGrids().size();
		
		for(int i = 0; i < board.getGrids().size(); i++){
			Grid g = board.getGrids().get(i);
			
			TileFragment[][] tempGrid = g.getFullGrid();
			
			System.out.println("iterating through tiles...");
			
			boolean duplicate = false;
			
			for(Iterator iter = allTiles.iterator(); iter.hasNext();){
				Tile t = (Tile)iter.next();
				
				int randomRow = (int)(Math.random()*b.getRows());
				int randomCol = (int)(Math.random()*b.getColumns());
				if(tempGrid[randomRow][randomCol] == null){
					tempGrid[randomRow][randomCol] = t;
				}
				else{
					duplicate = true;
					while(duplicate){
						randomRow = (int)(Math.random()*b.getRows());
						randomCol = (int)(Math.random()*b.getColumns());
						if(tempGrid[randomRow][randomCol] == null){
							tempGrid[randomRow][randomCol] = t;
							duplicate = false;
						}
						
					}
				}
				//System.out.println("Tile: " + t.getGraphic() + " at row: " + randomRow + " and col: " + randomCol);
				
			}

			g.setFullGrid(tempGrid);
			gridsWithTiles.add(g);
		}
		
		b.setGrids(gridsWithTiles);
		
		return b;
	}
	*/
	
	public Board placeTiles(Board board, String[][] pattern, int rows, int cols){
		Board b = board;
		
		ArrayList<Tile> allTiles = board.getTiles();
		ArrayList<Grid> gridsWithTiles = new ArrayList<Grid>();
		
		int totalGridRows = board.getGrids().size();
		int totalTilePairs = board.getTotalTilePairs();
		int numPlacedTilePairs = 0;
		
		boolean duplicate = false;
		
		Stack<Tile> tiles = new Stack<Tile>();
		for(Iterator<Tile> iter = allTiles.iterator(); iter.hasNext();){
			
			Tile t = (Tile)iter.next();
			System.out.println("Placing tile " + t.getGraphic() + " " + t.toString() + " ...");
			int positionOfPair = allTiles.lastIndexOf(t);
			
			if(positionOfPair != -1){
				//push tiles onto a stack
				tiles.push(t);
				//always need to place the matching tile as well
				tiles.push(allTiles.get(positionOfPair));
			}
		}
		
		for(int i = 0; i < board.getGrids().size(); i++){
			Grid g = board.getGrids().get(i);
			
			TileFragment[][] tempGrid = g.getFullGrid();
			
			System.out.println("iterating through tiles...");								

			for(int j = 0; j < rows-1; j++){
				for(int k = 0; k < cols; k++){
					if(pattern[j][k] != null && tempGrid[j][k] == null){						
							Tile parentTile = (Tile)tiles.pop();
							System.out.println("placing parent " + parentTile.toString() + " TOP at " + j + "," + k + " and BOTTOM at " + (j+1) + "," + k);
							Tile parentTile2 = (Tile)tiles.pop();
							System.out.println("placing parent " + parentTile2.toString() + " TOP at " + j + "," + k + " and BOTTOM at " + (j+1) + "," + k);
							
							//set top tile
							TileFragment top = new TileFragment(parentTile, TileFragmentType.TOP);
							top.setHeight(i);
							top.setRow(j);
							top.setCol(k);
							parentTile.setTopFragment(top);
							tempGrid[j][k] = top;
							
							TileFragment bottom = new TileFragment(parentTile, TileFragmentType.BOTTOM);
							top.setHeight(i);
							top.setRow(j);
							top.setCol(k);
							parentTile.setBottomFragment(bottom);
							tempGrid[j+1][k] = bottom;
						
					}
				}
			}
			
			g.setFullGrid(tempGrid);
			gridsWithTiles.add(g);
		}
		
		b.setGrids(gridsWithTiles);
		
		return b;
	}	
	
	private ArrayList<Tile> randomizeTiles(ArrayList<Tile> tiles){
		long seed = System.nanoTime();
		Collections.shuffle(tiles, new Random(seed));
		
		return tiles;
	}
	
	public Board lockTiles(Board board, int rows, int cols){
		TileFragment[][] fullBoard = board.getGrids().get(0).getFullGrid();
		
		for(int j = 0; j < rows-1; j++){
			for(int k = 0; k < cols; k++){
				if(fullBoard[j][k] != null){
					
						TileFragment fragment = fullBoard[j][k];
						Tile curTile = fragment.getTile();
						
						System.out.println("CurTIle: at " + j + "," + k + " " + curTile.toString());
						
						if(fullBoard[j][k-1] != null || fullBoard[j+1][k-1] != null){
							curTile.setHasLeftNeighbor(true);
						}
						if(fullBoard[j][k+1] != null || fullBoard[j+1][k+1] != null){
							curTile.setHasRightNeighbor(true);
						}
						if(curTile.getHasLeftNeighbor() && curTile.getHasRightNeighbor()){
							curTile.setIsTrapped(true);
						}
					
				}
			}
		}
		
		
		return board;
	}
	
}
