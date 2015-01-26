package com.company;

/**
 * Created by alexg on 30/10/14.
 */
public class ElAscensor {


    public static void main(String args[]){
        System.out.println("True or False");
        System.out.println("You can fit All ten of the");
        System.out.println("Ladrillos cuadrados");
        System.out.println("in the elevator");
        System.out.println("");

        int weightOfPeople = 150;
        int elevatorLimits = 1400;
        int numOfPeople = weightOfPeople / elevatorLimits;

        boolean allTenOk = numOfPeople >= 10 ;

        System.out.println(allTenOk);

    }

}
