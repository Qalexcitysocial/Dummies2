package com.company;

/**
 * Created by alexg on 01/11/14.
 */
public class MissingNumber {

    public static int count = 0;
    public static int position = 0;
    public static boolean flag = false;

    public static void main (String args[]){

        int array[] = { 0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 14, 16, 18 };    //creamos un vector de 9 posiciones


        findMissingNumbers(array, position); //





    }

    private static void findMissingNumbers(int array[], int position){

        if(position == array.length - 1)      //recorre el vector y comprueba que coincide con la posicion y numero
            return;

        for (; position < array[array.length -1]; position++){

            if((array[position]- count) != position){
                System.out.println("Missing Number:" + (position + count));
                flag = true;
                count++;
                break;
            }
        }

        if(flag) {
            flag = false;
            findMissingNumbers(array, position);
        }
    }



}
