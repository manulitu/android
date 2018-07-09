package game.dice.com.dicegameapp.domain;

import java.util.Random;

public class Dice {
	
	private static final int DICE_SIDES=6;
	private int value;

	protected Dice() {
		value=1;
	}
	
	protected void rollDice() {
		value=new Random().nextInt(DICE_SIDES)+1;
	}
	
	protected int getValue() {
		return value;
	}
}
