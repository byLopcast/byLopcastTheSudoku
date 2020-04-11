package com.example.andres.bylopcastthesudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class HighScores extends AppCompatActivity {
    private EditText[] highScoresList = new EditText[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);

        this.highScoresList[0] = (EditText)findViewById(R.id.highScoresRow1);
        this.highScoresList[1] = (EditText)findViewById(R.id.highScoresRow2);
        this.highScoresList[2] = (EditText)findViewById(R.id.highScoresRow3);
        this.highScoresList[3] = (EditText)findViewById(R.id.highScoresRow4);
        this.highScoresList[4] = (EditText)findViewById(R.id.highScoresRow5);
        this.highScoresList[5] = (EditText)findViewById(R.id.highScoresRow6);
        this.highScoresList[6] = (EditText)findViewById(R.id.highScoresRow7);
        this.highScoresList[7] = (EditText)findViewById(R.id.highScoresRow8);
        this.highScoresList[8] = (EditText)findViewById(R.id.highScoresRow9);
        this.highScoresList[9] = (EditText)findViewById(R.id.highScoresRow10);
        this.highScoresList[10] = (EditText)findViewById(R.id.highScoresRow11);
        this.highScoresList[11] = (EditText)findViewById(R.id.highScoresRow12);
        this.highScoresList[12] = (EditText)findViewById(R.id.highScoresRow13);
        this.highScoresList[13] = (EditText)findViewById(R.id.highScoresRow14);
        this.highScoresList[14] = (EditText)findViewById(R.id.highScoresRow15);

        for (int i = 0; i<15; i++){
            this.highScoresList[i].setText("Player"+i+" - 23h 59mi 56s");
        }

    }


}
