package com.example.andres.bylopcastthesudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class SudokuBoard extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku_board);
    }

    public void openMenu(View view){
        PopupMenu sudokuBoardMenu = new PopupMenu(this, view);
        sudokuBoardMenu.setOnMenuItemClickListener(this);
        sudokuBoardMenu.inflate(R.menu.sudokuboard_menu);
        sudokuBoardMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.itemSudokuBoardMenuResume:
                Toast.makeText(this,"Resume button pressed.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemSudokuBoardMenuWhatToDo:
                Toast.makeText(this,"What to do button pressed.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemSudokuBoardMenuRestart:
                Toast.makeText(this,"Restart button pressed.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemSudokuBoardMenuExit:
                Toast.makeText(this,"Exit button pressed.", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}
