package com.company;

/**
 * Created by alexg on 18/01/15.
 */
public class Ficha {
        private int casilla;

    //constructor
    public Ficha(int n){

        casilla = n;
    }
    //metodos
    public void avanzar (int n){
        casilla +=n;

    }

    public int casillaActual(){
        return casilla;
    }
}

