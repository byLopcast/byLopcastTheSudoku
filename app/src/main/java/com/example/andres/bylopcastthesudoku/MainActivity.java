package com.example.andres.bylopcastthesudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Home Page - Button Play
    public void navigationHomePagePlay (View view){
        Intent intentHomePagePlay = new Intent(this, DifficultySelection.class);
        startActivity(intentHomePagePlay);
    }

    // Home Page - Button Resolve
    public void navigationHomePageResolve (View view){
        Intent intentSolverBoard = new Intent(this, SudokuSolverBoard.class);
        startActivity(intentSolverBoard);
    }

    // Home Page - Button Guide
    public void navigationHomePageGuide (View view){
        Toast.makeText(this, "Guide is a functionality still to be developed.", Toast.LENGTH_SHORT).show();
    }

    // Home Page - Button High Scores
    public void navigationHomePageHighScores (View view){
        Intent intentHighScores = new Intent (this, HighScores.class);
        startActivity(intentHighScores);
    }

    // Home Page - Button Settings
    public void navigationHomePageSettings (View view){
        Intent intentSettings = new Intent(this, Settings.class);
        startActivity(intentSettings);
    }

    // Home Page - Button Exit
    public void navigationHomePageExit (View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
