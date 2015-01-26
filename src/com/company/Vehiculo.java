package com.company;

/**
 * Created by alexg on 17/01/15.
 */
public class Vehiculo {

    /**
     * Funcion principal
     */

    public int velocidad;
    public int ruedas;

    public void parar() {
        velocidad = 0;

    }

    public void acelerar(int kmh){
        velocidad +=kmh;
    }




}
