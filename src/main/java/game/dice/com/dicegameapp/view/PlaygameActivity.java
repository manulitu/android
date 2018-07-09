package game.dice.com.dicegameapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import game.dice.com.dicegameapp.R;
import game.dice.com.dicegameapp.application.GameController;
import game.dice.com.dicegameapp.application.GameDTO;

public class PlaygameActivity extends AppCompatActivity {


    Intent intent;
    GameController controller;
    Button playGame;
    Button goToStats;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = getIntent();
        controller = new GameController();
        setContentView(R.layout.play_game);
        playGame = (Button) findViewById(R.id.playGame);
        goToStats = (Button)findViewById(R.id.stats);
        //the condition should be to click another button


        playGame.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                playGame();
                                            }
                                        }

            );

        goToStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToStats();
            }
        });
    }

    public void playGame(){
        String userScore;
        TextView score = (TextView)findViewById(R.id.score);
        GameDTO dice = controller.playGame();
        String hasWon;
        if(dice.getDice1()+ dice.getDice2() == 7){
            hasWon = "You have won!";
        }
        else{
            hasWon ="You lost!";
        }
        userScore = String.format("%s%nDice Sum: %d + %d = %d", hasWon, dice.getDice1(),dice.getDice2(),
                dice.getDice1() + dice.getDice2());
        score.setText(userScore);
    }

    public void goToStats(){
        Intent goToStatsIntent = new Intent(getBaseContext(), StatsActivity.class);
        startActivity(goToStatsIntent);
    }





}
