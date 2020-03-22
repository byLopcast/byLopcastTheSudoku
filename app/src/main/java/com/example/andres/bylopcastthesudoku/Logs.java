package com.example.andres.bylopcastthesudoku;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logs {

    File archivo = null;
    BufferedWriter bw = null;

    public Logs() {
    }

    public void abreSudokuLogs(String ruta) throws IOException{
        this.archivo= new File(ruta);
        this.bw = new BufferedWriter(new FileWriter(this.archivo));
    }

    public void escribeSudokuLogs(String mensaje) throws IOException{
        this.bw.write(mensaje);

    }

    public void cierraSudokuLogs() throws IOException{
        bw.close();
    }
}
