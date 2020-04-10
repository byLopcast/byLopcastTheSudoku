package com.example.andres.bylopcastthesudoku;

public class Board {

    private int[][] boardNumbers = new int[9][9];

    public Board(){
        super();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.boardNumbers[i][j] = 0;
            }
        }
    }

    public int getBoardNumber (int v_row, int v_column){
        return this.boardNumbers[v_row][v_column];
    }

    public void setBoardNumber (int v_row, int v_column, int v_value){
        this.boardNumbers[v_row][v_column] = v_value;
    }

    public boolean checkBoard (){
        for (int row = 0; row < 9; row++) {
            if (!checkRow(row)) {
                return false;
            }
        }

        for (int column = 0; column < 9; column++) {
            if (!checkColumn(column)) {
                return false;
            }
        }

        for (int row = 0; row < 9; row = row + 3) {
            for (int column = 0; column < 9; column = column + 3) {
                if (!checkSquare(row, column)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkRow(int row) {
        // Loop on each cell of the row and check against the rest of the array
        for (int sourceCell = 0; sourceCell < 9; sourceCell++) {
            for (int checkCell = sourceCell + 1; checkCell < 9 ; checkCell++) {
                if (this.boardNumbers[row][sourceCell] == this.boardNumbers[row][checkCell]
                        && this.boardNumbers[row][sourceCell] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkColumn(int column) {
        // Loop on each cell of the column and check against the rest of the array
        for (int sourceCell = 0; sourceCell < 9; sourceCell++) {
            for (int checkCell = sourceCell + 1; checkCell < 9; checkCell++) {
                if (this.boardNumbers[sourceCell][column] == this.boardNumbers[checkCell][column]
                        && this.boardNumbers[sourceCell][column] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkSquare(int row, int column) {
        // Find the square that must be checked
        int[] squareId = selectSquare(row, column);
        // Array with the values to loop on.
        int[][] loopInSquare = {{0, 0}, {0, 1}, {0, 2}, {1, 0},
                {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};
        // Variables
        int rowSourceCell, colSourceCell, rowCheckCell, colCheckCell;

        for (int sourceCell = 0; sourceCell < 9; sourceCell++) {
            for (int checkCell = sourceCell + 1; checkCell < 9; checkCell++) {
                rowSourceCell = squareId[0] + loopInSquare[sourceCell][0];
                colSourceCell = squareId[1] + loopInSquare[sourceCell][1];
                rowCheckCell = squareId[0] + loopInSquare[checkCell][0];
                colCheckCell = squareId[1] + loopInSquare[checkCell][1];

                if (this.boardNumbers[rowSourceCell][colSourceCell] == this.boardNumbers[rowCheckCell][colCheckCell]
                        && this.boardNumbers[rowSourceCell][colSourceCell] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    private int[] selectSquare(int row, int column) {
        // Each square is identified with the position of the left-high cell

        int squareIdentifier[] = {0, 0};

        if (row < 3 && column < 3) {
            squareIdentifier[0] = 0;
            squareIdentifier[1] = 0;
        } else if (row < 3 && column < 6) {
            squareIdentifier[0] = 0;
            squareIdentifier[1] = 3;
        } else if (row < 3 && column < 9) {
            squareIdentifier[0] = 0;
            squareIdentifier[1] = 6;
        } else if (row < 6 && column < 3) {
            squareIdentifier[0] = 3;
            squareIdentifier[1] = 0;
        } else if (row < 6 && column < 6) {
            squareIdentifier[0] = 3;
            squareIdentifier[1] = 3;
        } else if (row < 6 && column < 9) {
            squareIdentifier[0] = 3;
            squareIdentifier[1] = 6;
        } else if (row < 9 && column < 3) {
            squareIdentifier[0] = 6;
            squareIdentifier[1] = 0;
        } else if (row < 9 && column < 6) {
            squareIdentifier[0] = 6;
            squareIdentifier[1] = 3;
        } else if (row < 9 && column < 9) {
            squareIdentifier[0] = 6;
            squareIdentifier[1] = 6;
        }
        return squareIdentifier;
    }

    public boolean solveBoard(){
        int[] position = findFirst0();
        int row = position[0];
        int column = position[1];

        if(row == -1 && column == -1){
            return true;
        }else{
            while (1 == 1) {

                this.boardNumbers[row][column] ++;

                if (checkBoard()) {
                    if (solveBoard()) {
                        return true;
                    } else if (this.boardNumbers[row][column] == 9){
                        this.boardNumbers[row][column]=0;
                        return false;
                    }
                } else {
                    if (this.boardNumbers[row][column] == 9) {
                        this.boardNumbers[row][column]=0;
                        return false;
                    }
                }
            }
        }
    }

    private int[] findFirst0() {
        int[] position = new int[2];

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (this.boardNumbers[row][column] == 0) {
                    position[0] = row;
                    position[1] = column;
                    return position;
                }
            }
        }
        position[0] = -1;
        position[1] = -1;
        return position;
    }

}
