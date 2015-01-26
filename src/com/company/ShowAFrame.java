package com.company;

import javax.swing.*;

/**
 * Created by alexg on 30/10/14.
 */
public class ShowAFrame {

    public static void main (String args[]){

    JFrame myFrame = new JFrame();      //creamos el objeto frame
    String myTitle = "Ventana en Blanco";     //ponemos el nombre a la cabecera  del cuadro

        myFrame.setTitle(myTitle);
        myFrame.setSize(300, 300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

    }
}
