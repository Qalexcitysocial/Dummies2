package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by alexg on 01/11/14.
 */
public class GuessAgain {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in); //creamos la entrada por teclado

        int numGuess = 0; //creamos el numero de invitados y lo inicializamos
        int randomNumber = new Random().nextInt(10);

        System.out.println("          ********         ");
        System.out.println(" Wellcome to the Guessing Game ");
        System.out.println("          ********         ");
        System.out.println("");

        System.out.println("Enter an int from 1 to 10: ");
        int inputNumber = keyboard.nextInt();
        numGuess++;

        while (inputNumber != randomNumber){
            System.out.println();
            System.out.println("Try again!!");
            System.out.println("Enter a int from 1 to 10");
            inputNumber = keyboard.nextInt();
            numGuess++;



        }

        System.out.printf("you win after ");
        System.out.println(numGuess + " Guess");
    }
}
