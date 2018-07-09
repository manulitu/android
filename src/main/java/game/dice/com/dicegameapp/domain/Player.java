package game.dice.com.dicegameapp.domain;

import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;


import game.dice.com.dicegameapp.application.GameController;




public class Player {

	private String name;
	private List<Game> games=new ArrayList<>();
	
	public Player(String name){
		if(!name.contentEquals("")){
			this.name=name;
		}
		else{
			throw new RuntimeException("The name field is empty!");
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void addGame(Game game){
	    if(game != null){
            this.games.add(game);
        }
        else{
	        throw new RuntimeException("");
        }
	}

	public List<Game> getAllGames() {
		return games;
	}
}
