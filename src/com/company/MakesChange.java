package com.company;
import static java.lang.System.out;

/**
 * Created by alexg on 31/10/14.
 */
public class MakesChange {

    public static void main(String args []){

        int total = 248;
        int quarters = total / 25;
        int whatsLeft = total % 25;

        int dimes = whatsLeft / 10;
        whatsLeft = whatsLeft % 10;

        int nikels = whatsLeft / 5;
        whatsLeft = whatsLeft % 5;

        int cents = whatsLeft;


        System.out.println("From "+total+ " cents you get");
        out.println("quarters "+ quarters);
        out.println("dimes "+ dimes);
        out.println("nikel "+ nikels);
        out.println("cents "+cents);



    }
}
