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
        startActivity(intentDifficultyVeryHard);
    }

    // Difficulty selection - Button Hard
    public void navigationDifficultyHard (View view){
        Intent intentDifficultyHard = new Intent(this, SudokuBoard.class);
        startActivity(intentDifficultyHard);
    }

    // Difficulty selection - Button Normal
    public void navigationDifficultyNormal (View view){
        Intent intentDifficultyNormal = new Intent(this, SudokuBoard.class);
        startActivity(intentDifficultyNormal);
    }

    // Difficulty selection - Button Basic
    public void navigationDifficultyBasic (View view){
        Intent intentDifficultyBasic = new Intent(this, SudokuBoard.class);
        startActivity(intentDifficultyBasic);
    }

    // Difficulty selection - Button Back
    public void navigationDifficultyBack (View view){
        Intent intentDifficultyBack = new Intent(this, MainActivity.class);
        startActivity(intentDifficultyBack);
    }
}
