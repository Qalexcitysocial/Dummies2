package com.company;

import javax.swing.*;

/**
 * Created by alexg on 01/11/14.
 */
public class Authenticator {
    public static void main(String args[]){

    String username =
            JOptionPane.showInputDialog("Username:");
    String password =
            JOptionPane.showInputDialog("Password:");

    if (
        username != null &&
        password != null &&
        (
            (username.equals("bburd")&&
             password.equals("swordfish")) ||
            (username.equals("hritter")&&
             password.equals("preakston"))

             )

            )
    {
        JOptionPane.showMessageDialog
                (null,"You are in");
    }else  {
        JOptionPane.showMessageDialog
                (null, "You are Susipcious");

    }
 }

}