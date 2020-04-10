package com.example.andres.bylopcastthesudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SudokuSolverBoard extends AppCompatActivity {

    private EditText[][] SSolv_text = new EditText[9][9];
    private Board SolverBoard = new Board();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku_solver_board);

        this.SSolv_text[0][0] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable11);
        this.SSolv_text[0][1] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable12);
        this.SSolv_text[0][2] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable13);
        this.SSolv_text[0][3] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable14);
        this.SSolv_text[0][4] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable15);
        this.SSolv_text[0][5] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable16);
        this.SSolv_text[0][6] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable17);
        this.SSolv_text[0][7] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable18);
        this.SSolv_text[0][8] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable19);

        this.SSolv_text[1][0] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable21);
        this.SSolv_text[1][1] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable22);
        this.SSolv_text[1][2] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable23);
        this.SSolv_text[1][3] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable24);
        this.SSolv_text[1][4] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable25);
        this.SSolv_text[1][5] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable26);
        this.SSolv_text[1][6] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable27);
        this.SSolv_text[1][7] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable28);
        this.SSolv_text[1][8] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable29);

        this.SSolv_text[2][0] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable31);
        this.SSolv_text[2][1] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable32);
        this.SSolv_text[2][2] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable33);
        this.SSolv_text[2][3] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable34);
        this.SSolv_text[2][4] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable35);
        this.SSolv_text[2][5] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable36);
        this.SSolv_text[2][6] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable37);
        this.SSolv_text[2][7] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable38);
        this.SSolv_text[2][8] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable39);

        this.SSolv_text[3][0] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable41);
        this.SSolv_text[3][1] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable42);
        this.SSolv_text[3][2] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable43);
        this.SSolv_text[3][3] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable44);
        this.SSolv_text[3][4] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable45);
        this.SSolv_text[3][5] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable46);
        this.SSolv_text[3][6] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable47);
        this.SSolv_text[3][7] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable48);
        this.SSolv_text[3][8] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable49);

        this.SSolv_text[4][0] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable51);
        this.SSolv_text[4][1] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable52);
        this.SSolv_text[4][2] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable53);
        this.SSolv_text[4][3] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable54);
        this.SSolv_text[4][4] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable55);
        this.SSolv_text[4][5] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable56);
        this.SSolv_text[4][6] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable57);
        this.SSolv_text[4][7] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable58);
        this.SSolv_text[4][8] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable59);

        this.SSolv_text[5][0] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable61);
        this.SSolv_text[5][1] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable62);
        this.SSolv_text[5][2] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable63);
        this.SSolv_text[5][3] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable64);
        this.SSolv_text[5][4] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable65);
        this.SSolv_text[5][5] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable66);
        this.SSolv_text[5][6] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable67);
        this.SSolv_text[5][7] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable68);
        this.SSolv_text[5][8] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable69);

        this.SSolv_text[6][0] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable71);
        this.SSolv_text[6][1] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable72);
        this.SSolv_text[6][2] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable73);
        this.SSolv_text[6][3] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable74);
        this.SSolv_text[6][4] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable75);
        this.SSolv_text[6][5] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable76);
        this.SSolv_text[6][6] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable77);
        this.SSolv_text[6][7] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable78);
        this.SSolv_text[6][8] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable79);

        this.SSolv_text[7][0] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable81);
        this.SSolv_text[7][1] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable82);
        this.SSolv_text[7][2] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable83);
        this.SSolv_text[7][3] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable84);
        this.SSolv_text[7][4] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable85);
        this.SSolv_text[7][5] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable86);
        this.SSolv_text[7][6] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable87);
        this.SSolv_text[7][7] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable88);
        this.SSolv_text[7][8] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable89);

        this.SSolv_text[8][0] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable91);
        this.SSolv_text[8][1] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable92);
        this.SSolv_text[8][2] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable93);
        this.SSolv_text[8][3] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable94);
        this.SSolv_text[8][4] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable95);
        this.SSolv_text[8][5] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable96);
        this.SSolv_text[8][6] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable97);
        this.SSolv_text[8][7] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable98);
        this.SSolv_text[8][8] = (EditText)findViewById(R.id.numberSudokuSolverBoardMainTable99);

    }

    // Solver Board- Button Solve
    public void actionSolverBoardSolve(View view){

        int i, j;

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (this.SSolv_text[i][j].getText().toString().length() > 0){
                    this.SolverBoard.setBoardNumber(i,j,Integer.parseInt(this.SSolv_text[i][j].getText().toString()));
                } else {
                    this.SolverBoard.setBoardNumber(i,j,0);
                }
            }
        }

        if (!this.SolverBoard.solveBoard()){
            Toast.makeText(this, "This board has no solution.", Toast.LENGTH_SHORT).show();
        }

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (this.SolverBoard.getBoardNumber(i,j)> 0) {
                    this.SSolv_text[i][j].setText(String.valueOf(this.SolverBoard.getBoardNumber(i, j)));
                }
            }
        }
    }

    // Solver Board - Button Clear
    public void actionSolverBoardClear(View view){
        int i, j;

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                this.SSolv_text[i][j].getText().clear();
            }
        }

    }
}
