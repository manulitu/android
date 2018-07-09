package game.dice.com.dicegameapp.domain;

public class Game {



	private Dice dice1=new Dice();
	private Dice dice2=new Dice();
	
	public Game(){
		
	}
	
	public void playGame() {
		dice1.rollDice();
		dice2.rollDice();
	}
	
	public int getSumDices(){
		return dice1.getValue()+dice2.getValue();	
	}
	
	public boolean hasWon() {
		return getSumDices()==7;
	}

	public int getDice1Value() {
		return dice1.getValue();
	}

	public int getDice2Value() {
		return dice2.getValue();
	}

}
