package com.example.ubi_complab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GuessGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_guess_game);

        EditText guessInput = findViewById(R.id.guessInput);

        Button guessButton = findViewById(R.id.guessButton);
        Button playAgainButton = findViewById(R.id.playAgainButton);

        TextView resultText = findViewById(R.id.resultText);
        TextView guessCountText = findViewById(R.id.guessCountText);

        //Random selection of secret number + counter
        final int[] secretNumber = {(int) (Math.random() * 30) + 1};
        final int[] guessCount = {0};

        guessButton.setOnClickListener(v -> {

            String guessText = guessInput.getText().toString();

        });


    }
}
