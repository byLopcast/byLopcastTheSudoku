package com.example.andres.bylopcastthesudoku;

import java.io.IOException;

public class Panel {

    public Casilla[][] Panel = new Casilla[9][9];
    Logs sudokuLog = null;
    int iteraciones = 0;
    static final int MAXITERACIONES = 100000;
    static final int PINTAITERACIONES = 10000;

    public Panel(Logs sudokuLog) {
        super();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Panel[i][j] = new Casilla();
            }
        }
        this.sudokuLog = sudokuLog;
    }

    public void pintarPanelEnFichero() throws IOException {
        // Pinto el array para comprobar que esta bien
        for (int i = 0; i < 9; i++) {
            if (i == 0 || i == 3 || i == 6) {
                this.sudokuLog.escribeSudokuLogs("+---------------+---------------+---------------+\n");
            }
            for (int j = 0; j < 9; j++) {
                if (j == 0 || j == 3 || j == 6) {
                    this.sudokuLog.escribeSudokuLogs("|   ");
                }
                this.sudokuLog.escribeSudokuLogs(this.Panel[i][j].getValorElegido() + "   ");
            }
            this.sudokuLog.escribeSudokuLogs("|\n");
        }
        this.sudokuLog.escribeSudokuLogs("+---------------+---------------+---------------+\n");
    }

    public int[] encuentraPrimer0() {
        int[] posicion = new int[2];

        for (int fila = 0; fila < 9; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                if (this.Panel[fila][columna].getValorElegido() == 0) {
                    posicion[0] = fila;
                    posicion[1] = columna;
                    return posicion;
                }
            }
        }
        posicion[0] = -1;
        posicion[1] = -1;
        return posicion;
    }



    public boolean generaPanelMetodo1() throws IOException {
        // Esta funcion genera un tablero por defecto
        int valorElegido, siguienteValor;
        int[] posicion = encuentraPrimer0();
        int fila = posicion[0];
        int columna = posicion[1];

        // Para empezar la logica compruebo que hay ceros en el panel todavia
        if (fila == -1 && columna == -1) {
            this.sudokuLog.escribeSudokuLogs("Iteracion numero: " + this.iteraciones + "\r\n");
            pintarPanelEnFichero();
            return true;
        } else {
            while (1 == 1) {
                this.iteraciones++;

                if (0 == (this.iteraciones % PINTAITERACIONES)) {
                    this.sudokuLog.escribeSudokuLogs("Iteracion numero: " + this.iteraciones + "\r\n");
                    pintarPanelEnFichero();
                } else if (this.iteraciones > MAXITERACIONES) {
                    System.out.println("Numero maximo de iteraciones alcanzado");
                    return true;
                }

                valorElegido = this.Panel[fila][columna].getValorElegido();
                siguienteValor = 1 + valorElegido;

                this.Panel[fila][columna].setValorElegido(siguienteValor);

/*                if (verificarPanel()) {
                    if (generaPanelMetodo1()) {
                        return true;
                    } else if (siguienteValor == 9){
                        this.Panel[fila][columna].setValorElegido(0);
                        return false;
                    }
                } else {
                    if (siguienteValor == 9) {
                        this.Panel[fila][columna].setValorElegido(0);
                        return false;
                    }
                }*/
            }
        }
    }

    public void seleccionaValorFijo(int fila, int columna, int valor){
        this.Panel[fila][columna].setValorElegido(valor);
        this.Panel[fila][columna].fijarValor(true);
    }

}
