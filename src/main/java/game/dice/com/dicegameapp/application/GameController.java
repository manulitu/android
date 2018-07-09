package game.dice.com.dicegameapp.application;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import game.dice.com.dicegameapp.domain.*;



public class GameController {

    private static Player player;


    public GameController() {

    }


    public void createPlayer(String name) {
        this.player = new Player(name);

    }

    public String getPlayerName() {
        return player.getName();
    }

    public GameDTO playGame() {
        Game game = new Game();
        GameDTO dto = new GameDTO();
        game.playGame();
        dto.setDices(game);
        player.addGame(game);
        return dto;
    }


    public String getPlayerGamesToString() {
        String text = "";
        List<Game> games = player.getAllGames();

        for (Game game : games) {
            text += "SUMA: " + game.getSumDices() + " RESULTAT: " + game.hasWon() + "\n";
        }
        return text;
    }

    public double getPlayerRanking() {
        List<Game> games = player.getAllGames();

        double wins = 0.0;
        for (Game game : games) {
            if (game.hasWon())
                wins++;
        }
        return wins / games.size();
    }

}

