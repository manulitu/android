package game.dice.com.dicegameapp.application;

import game.dice.com.dicegameapp.domain.Game;

public class GameDTO {
    private int dice1;
    private int dice2;

    public GameDTO(){

    }


    public GameDTO(int dice1, int dice2){
        this.dice1 = dice1;
        this.dice2 = dice2;
    }


    public void setDices(Game game){
        this.dice1 = game.getDice1Value();
        this.dice2 = game.getDice2Value();
    }

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public boolean hasWon(){
        return (7 == this.dice1 + this.dice2);
    }


}
