package com.example.andres.bylopcastthesudoku;

public class Casilla {
    private int valorElegido;
    private boolean valorFijado;

    // posiblesValores va a tener a true los valores que SI pueden darse y a false los que NO

    public Casilla() {
        super();
        this.valorElegido = 0;
        this.valorFijado=false;
    }

    public int getValorElegido() {
        return valorElegido;
    }

    public void setValorElegido(int valorElegido) {
        this.valorElegido = valorElegido;
    }

    public void fijarValor(boolean estadoValor){
        this.valorFijado=estadoValor;
    }
}
