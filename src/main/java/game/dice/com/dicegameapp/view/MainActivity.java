package game.dice.com.dicegameapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Intent;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import game.dice.com.dicegameapp.R;
import game.dice.com.dicegameapp.application.GameController;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Button addPlayerButton;
    EditText userInput;
    Button registerButton;


    GameController controller = new GameController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.buttonContainer);
        registerButton = (Button) findViewById(R.id.register_user);

        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //TODO make button disappear and add edit text and button with functionality to show two new buttons.
                setContentView(R.layout.add_player);

                registerUser(view);
            }


        });
    }


    public void registerUser(View view) {
        addPlayerButton = (Button) findViewById(R.id.add_player);
        EditText userInput = (EditText) findViewById(R.id.user_name);

        addPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userInput = (EditText) findViewById(R.id.user_name);
                String playerName = userInput.getText().toString();
                controller.createPlayer(playerName);
                Intent intent = new Intent(getBaseContext(), PlaygameActivity.class);
                startActivity(intent);
            }
        });

    }
}
