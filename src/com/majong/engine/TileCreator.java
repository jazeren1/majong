package com.majong.engine;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.majong.structure.tiles.Bamboos;
import com.majong.structure.tiles.Characters;
import com.majong.structure.tiles.Dots;
import com.majong.structure.tiles.Flowers;
import com.majong.structure.tiles.Honors;
import com.majong.structure.tiles.Seasons;
import com.majong.structure.tiles.Tile;
import com.majong.structure.tiles.TileType;

public class TileCreator {

	static final Logger log = Logger.getLogger(TileCreator.class);
	
	public ArrayList<Tile> createBamboos(ArrayList<Tile> tiles, TileType type){
		System.out.println("TYpe is" + TileType.BAMBOOS);
		//make bamboos
		for(Bamboos bamboo : Bamboos.values()){
			Tile tile = new Tile();
			tile.setGraphic(bamboo.toString());
			tile.setType(type);
			tiles.add(tile);
			tile.setGraphic(bamboo.toString());
			tile.setType(type);
			tiles.add(tile);
			
			System.out.println("TYpe: " + bamboo);		
		}
		
		return tiles;
	}
	
	public ArrayList<Tile> createCharacters(ArrayList<Tile> tiles, TileType type){
		System.out.println("TYpe is Chars" + TileType.CHARACTERS);
		//make characters
		for(Characters characters : Characters.values()){
			Tile tile = new Tile();
			tile.setGraphic(characters.toString());
			tile.setType(type);
			tiles.add(tile);
			tile.setGraphic(characters.toString());
			tile.setType(type);
			tiles.add(tile);
			
			System.out.println("TYpe: " + characters);

		}
		
		return tiles;
	}
	
	public ArrayList<Tile> createDots(ArrayList<Tile> tiles, TileType type){
		System.out.println("TYpe is " + TileType.DOTS);
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
		}
		
		return tiles;
	}
	
	public ArrayList<Tile> createHonors(ArrayList<Tile> tiles, TileType type){
		System.out.println("TYpe is " + TileType.HONORS);
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
		}
		
		return tiles;
	}
	
	public ArrayList<Tile> createFlowers(ArrayList<Tile> tiles, TileType type){
		System.out.println("TYpe is " + TileType.FLOWERS);
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

		}
		
		return tiles;
	}
	
	public ArrayList<Tile> createSeasons(ArrayList<Tile> tiles, TileType type){
		System.out.println("TYpe is " + TileType.SEASONS);
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
			
		}		
		
		return tiles;
	}
	
}
