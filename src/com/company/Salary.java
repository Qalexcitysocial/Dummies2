package com.company;

/**
 * Created by alexg on 31/10/14.
 */
public class Salary {
    public static void main(String args[]){
        System.out.println("Introduce tus horas de trabajo ");

        double rate = 6.45;
        int hours   = 8;
        double salario = rate * hours;

        System.out.println("Tu salario es de:"+ salario +"euros dia");
    }
}
