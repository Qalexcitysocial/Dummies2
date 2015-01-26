package com.company;
import static java.lang.System.out;



import java.util.Random;
import java.util.Scanner;
/**
 * Created by alexg on 31/10/14.
 */
public class GuessingGame {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduce a number 1 to 10");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber) {
            System.out.println("***********");
            System.out.println("*** You WIN ***");
            System.out.println("***********");

        } else {

            System.out.println("You Lose");
            System.out.println("the random number was");
            System.out.println(randomNumber);
        }
        out.println("Thanks for playing");
    }

}




