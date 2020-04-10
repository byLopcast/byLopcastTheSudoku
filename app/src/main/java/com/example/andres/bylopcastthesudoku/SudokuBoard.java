package com.example.andres.bylopcastthesudoku;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import androidx.appcompat.app.AppCompatActivity;

public class SudokuBoard extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private String Difficulty;
    private int SudokuId;

    private EditText[][] SPlay_text = new EditText[9][9];
    private Board PlayBoard = new Board();
    private Board TemplateBoard = new Board();
    private Board SolvedBoard = new Board();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku_board);

        this.Difficulty = getIntent().getStringExtra("Difficulty");

        this.SPlay_text[0][0] = (EditText)findViewById(R.id.numberSudokuBoardMainTable11);
        this.SPlay_text[0][1] = (EditText)findViewById(R.id.numberSudokuBoardMainTable12);
        this.SPlay_text[0][2] = (EditText)findViewById(R.id.numberSudokuBoardMainTable13);
        this.SPlay_text[0][3] = (EditText)findViewById(R.id.numberSudokuBoardMainTable14);
        this.SPlay_text[0][4] = (EditText)findViewById(R.id.numberSudokuBoardMainTable15);
        this.SPlay_text[0][5] = (EditText)findViewById(R.id.numberSudokuBoardMainTable16);
        this.SPlay_text[0][6] = (EditText)findViewById(R.id.numberSudokuBoardMainTable17);
        this.SPlay_text[0][7] = (EditText)findViewById(R.id.numberSudokuBoardMainTable18);
        this.SPlay_text[0][8] = (EditText)findViewById(R.id.numberSudokuBoardMainTable19);

        this.SPlay_text[1][0] = (EditText)findViewById(R.id.numberSudokuBoardMainTable21);
        this.SPlay_text[1][1] = (EditText)findViewById(R.id.numberSudokuBoardMainTable22);
        this.SPlay_text[1][2] = (EditText)findViewById(R.id.numberSudokuBoardMainTable23);
        this.SPlay_text[1][3] = (EditText)findViewById(R.id.numberSudokuBoardMainTable24);
        this.SPlay_text[1][4] = (EditText)findViewById(R.id.numberSudokuBoardMainTable25);
        this.SPlay_text[1][5] = (EditText)findViewById(R.id.numberSudokuBoardMainTable26);
        this.SPlay_text[1][6] = (EditText)findViewById(R.id.numberSudokuBoardMainTable27);
        this.SPlay_text[1][7] = (EditText)findViewById(R.id.numberSudokuBoardMainTable28);
        this.SPlay_text[1][8] = (EditText)findViewById(R.id.numberSudokuBoardMainTable29);

        this.SPlay_text[2][0] = (EditText)findViewById(R.id.numberSudokuBoardMainTable31);
        this.SPlay_text[2][1] = (EditText)findViewById(R.id.numberSudokuBoardMainTable32);
        this.SPlay_text[2][2] = (EditText)findViewById(R.id.numberSudokuBoardMainTable33);
        this.SPlay_text[2][3] = (EditText)findViewById(R.id.numberSudokuBoardMainTable34);
        this.SPlay_text[2][4] = (EditText)findViewById(R.id.numberSudokuBoardMainTable35);
        this.SPlay_text[2][5] = (EditText)findViewById(R.id.numberSudokuBoardMainTable36);
        this.SPlay_text[2][6] = (EditText)findViewById(R.id.numberSudokuBoardMainTable37);
        this.SPlay_text[2][7] = (EditText)findViewById(R.id.numberSudokuBoardMainTable38);
        this.SPlay_text[2][8] = (EditText)findViewById(R.id.numberSudokuBoardMainTable39);

        this.SPlay_text[3][0] = (EditText)findViewById(R.id.numberSudokuBoardMainTable41);
        this.SPlay_text[3][1] = (EditText)findViewById(R.id.numberSudokuBoardMainTable42);
        this.SPlay_text[3][2] = (EditText)findViewById(R.id.numberSudokuBoardMainTable43);
        this.SPlay_text[3][3] = (EditText)findViewById(R.id.numberSudokuBoardMainTable44);
        this.SPlay_text[3][4] = (EditText)findViewById(R.id.numberSudokuBoardMainTable45);
        this.SPlay_text[3][5] = (EditText)findViewById(R.id.numberSudokuBoardMainTable46);
        this.SPlay_text[3][6] = (EditText)findViewById(R.id.numberSudokuBoardMainTable47);
        this.SPlay_text[3][7] = (EditText)findViewById(R.id.numberSudokuBoardMainTable48);
        this.SPlay_text[3][8] = (EditText)findViewById(R.id.numberSudokuBoardMainTable49);

        this.SPlay_text[4][0] = (EditText)findViewById(R.id.numberSudokuBoardMainTable51);
        this.SPlay_text[4][1] = (EditText)findViewById(R.id.numberSudokuBoardMainTable52);
        this.SPlay_text[4][2] = (EditText)findViewById(R.id.numberSudokuBoardMainTable53);
        this.SPlay_text[4][3] = (EditText)findViewById(R.id.numberSudokuBoardMainTable54);
        this.SPlay_text[4][4] = (EditText)findViewById(R.id.numberSudokuBoardMainTable55);
        this.SPlay_text[4][5] = (EditText)findViewById(R.id.numberSudokuBoardMainTable56);
        this.SPlay_text[4][6] = (EditText)findViewById(R.id.numberSudokuBoardMainTable57);
        this.SPlay_text[4][7] = (EditText)findViewById(R.id.numberSudokuBoardMainTable58);
        this.SPlay_text[4][8] = (EditText)findViewById(R.id.numberSudokuBoardMainTable59);

        this.SPlay_text[5][0] = (EditText)findViewById(R.id.numberSudokuBoardMainTable61);
        this.SPlay_text[5][1] = (EditText)findViewById(R.id.numberSudokuBoardMainTable62);
        this.SPlay_text[5][2] = (EditText)findViewById(R.id.numberSudokuBoardMainTable63);
        this.SPlay_text[5][3] = (EditText)findViewById(R.id.numberSudokuBoardMainTable64);
        this.SPlay_text[5][4] = (EditText)findViewById(R.id.numberSudokuBoardMainTable65);
        this.SPlay_text[5][5] = (EditText)findViewById(R.id.numberSudokuBoardMainTable66);
        this.SPlay_text[5][6] = (EditText)findViewById(R.id.numberSudokuBoardMainTable67);
        this.SPlay_text[5][7] = (EditText)findViewById(R.id.numberSudokuBoardMainTable68);
        this.SPlay_text[5][8] = (EditText)findViewById(R.id.numberSudokuBoardMainTable69);

        this.SPlay_text[6][0] = (EditText)findViewById(R.id.numberSudokuBoardMainTable71);
        this.SPlay_text[6][1] = (EditText)findViewById(R.id.numberSudokuBoardMainTable72);
        this.SPlay_text[6][2] = (EditText)findViewById(R.id.numberSudokuBoardMainTable73);
        this.SPlay_text[6][3] = (EditText)findViewById(R.id.numberSudokuBoardMainTable74);
        this.SPlay_text[6][4] = (EditText)findViewById(R.id.numberSudokuBoardMainTable75);
        this.SPlay_text[6][5] = (EditText)findViewById(R.id.numberSudokuBoardMainTable76);
        this.SPlay_text[6][6] = (EditText)findViewById(R.id.numberSudokuBoardMainTable77);
        this.SPlay_text[6][7] = (EditText)findViewById(R.id.numberSudokuBoardMainTable78);
        this.SPlay_text[6][8] = (EditText)findViewById(R.id.numberSudokuBoardMainTable79);

        this.SPlay_text[7][0] = (EditText)findViewById(R.id.numberSudokuBoardMainTable81);
        this.SPlay_text[7][1] = (EditText)findViewById(R.id.numberSudokuBoardMainTable82);
        this.SPlay_text[7][2] = (EditText)findViewById(R.id.numberSudokuBoardMainTable83);
        this.SPlay_text[7][3] = (EditText)findViewById(R.id.numberSudokuBoardMainTable84);
        this.SPlay_text[7][4] = (EditText)findViewById(R.id.numberSudokuBoardMainTable85);
        this.SPlay_text[7][5] = (EditText)findViewById(R.id.numberSudokuBoardMainTable86);
        this.SPlay_text[7][6] = (EditText)findViewById(R.id.numberSudokuBoardMainTable87);
        this.SPlay_text[7][7] = (EditText)findViewById(R.id.numberSudokuBoardMainTable88);
        this.SPlay_text[7][8] = (EditText)findViewById(R.id.numberSudokuBoardMainTable89);

        this.SPlay_text[8][0] = (EditText)findViewById(R.id.numberSudokuBoardMainTable91);
        this.SPlay_text[8][1] = (EditText)findViewById(R.id.numberSudokuBoardMainTable92);
        this.SPlay_text[8][2] = (EditText)findViewById(R.id.numberSudokuBoardMainTable93);
        this.SPlay_text[8][3] = (EditText)findViewById(R.id.numberSudokuBoardMainTable94);
        this.SPlay_text[8][4] = (EditText)findViewById(R.id.numberSudokuBoardMainTable95);
        this.SPlay_text[8][5] = (EditText)findViewById(R.id.numberSudokuBoardMainTable96);
        this.SPlay_text[8][6] = (EditText)findViewById(R.id.numberSudokuBoardMainTable97);
        this.SPlay_text[8][7] = (EditText)findViewById(R.id.numberSudokuBoardMainTable98);
        this.SPlay_text[8][8] = (EditText)findViewById(R.id.numberSudokuBoardMainTable99);

        initializeBoard();

        this.SolvedBoard.solveBoard();

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
                return true;
            case R.id.itemSudokuBoardMenuWhatToDo:
                Toast.makeText(this,"What to do button pressed.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemSudokuBoardMenuRestart:
                restartBoard();
                return true;
            case R.id.itemSudokuBoardMenuExit:
                Intent intentDifficultyBack = new Intent(this, MainActivity.class);
                startActivity(intentDifficultyBack);
                return true;
            default:
                return false;
        }
    }

    private void initializeBoard(){
        String data;
        String[] splitData;
        int i, j, k;

        InputStream isSudokuDataSource = this.getResources().openRawResource(R.raw.sudokudatasource);

        BufferedReader brSudokuDataSource =  new BufferedReader(new InputStreamReader(isSudokuDataSource));

        try{
            if(isSudokuDataSource!=null){

                while((data = brSudokuDataSource.readLine()) != null){
                    if(data.indexOf(this.Difficulty) == 2){

                        splitData=data.split("\\|");

                        this.SudokuId = Integer.parseInt(splitData[0]);

                        k = 1;
                        for (i = 0; i < 9; i++) {
                            for (j = 0; j < 9; j++) {
                                k++;
                                this.SPlay_text[i][j].setText(splitData[k]);

                                if (this.SPlay_text[i][j].getText().toString().length() > 0){
                                    this.PlayBoard.setBoardNumber(i,j,Integer.parseInt(this.SPlay_text[i][j].getText().toString()));
                                    this.TemplateBoard.setBoardNumber(i,j,Integer.parseInt(this.SPlay_text[i][j].getText().toString()));
                                    this.SolvedBoard.setBoardNumber(i,j,Integer.parseInt(this.SPlay_text[i][j].getText().toString()));
                                } else {
                                    this.PlayBoard.setBoardNumber(i,j,0);
                                    this.TemplateBoard.setBoardNumber(i,j,0);
                                    this.SolvedBoard.setBoardNumber(i,j,0);
                                }
                            }
                        }
                    break;
                    }
                }
            }

            isSudokuDataSource.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void restartBoard(){
        int i, j;

        this.PlayBoard = this.TemplateBoard;

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (this.TemplateBoard.getBoardNumber(i,j)> 0) {
                    this.SPlay_text[i][j].setText(String.valueOf(this.TemplateBoard.getBoardNumber(i, j)));
                } else {
                    this.SPlay_text[i][j].getText().clear();
                }
            }
        }

    }

}
