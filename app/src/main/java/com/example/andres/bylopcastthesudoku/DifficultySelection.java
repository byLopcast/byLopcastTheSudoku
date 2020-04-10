package com.example.andres.bylopcastthesudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DifficultySelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_selection);
    }

    // Difficulty selection - Button Very hard
    public void navigationDifficultyVeryHard (View view){
        Intent intentDifficultyVeryHard = new Intent(this, SudokuBoard.class);
        intentDifficultyVeryHard.putExtra("Difficulty","VERY_HARD");

        startActivity(intentDifficultyVeryHard);
    }

    // Difficulty selection - Button Hard
    public void navigationDifficultyHard (View view){
        Intent intentDifficultyHard = new Intent(this, SudokuBoard.class);
        intentDifficultyHard.putExtra("Difficulty","HARD");

        startActivity(intentDifficultyHard);
    }

    // Difficulty selection - Button Normal
    public void navigationDifficultyNormal (View view){
        Intent intentDifficultyNormal = new Intent(this, SudokuBoard.class);
        intentDifficultyNormal.putExtra("Difficulty","NORMAL");

        startActivity(intentDifficultyNormal);
    }

    // Difficulty selection - Button Basic
    public void navigationDifficultyBasic (View view){
        Intent intentDifficultyBasic = new Intent(this, SudokuBoard.class);
        intentDifficultyBasic.putExtra("Difficulty","BASIC");

        startActivity(intentDifficultyBasic);
    }

}
