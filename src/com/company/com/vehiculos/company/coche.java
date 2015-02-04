package com.company.com.vehiculos.company;

/**
 * Created by alexg on 04/02/15.
 */
public class Coche  {

int velocidad = 25;
    public static void main(String args[]) {
        Coche ferrari = new Coche();

        ferrari.acelera(100);
        ferrari.acelera(200);

    }

    public void acelera(int velocidad) {
        velocidad = 80;
        System.out.printf("Valor de la velocidad" + velocidad);
    }

    public void acelera() {

        int velocidad = 30;
        System.out.printf("Valor de la velocidad" + velocidad);
    }



}
