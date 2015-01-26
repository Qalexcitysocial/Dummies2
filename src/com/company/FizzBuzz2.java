package com.company;

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import javax.sound.midi.Soundbank;

/**
 * Created by alexg on 06/11/14.
 */
public class FizzBuzz2 {



    public static void main (String args[]) {
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.print("FizBuzz");
            }else if (i % 3 == 0) {

                System.out.println("Fizz");
            }else  if (i % 5 == 0) {
                System.out.println("Buzz");
            }else

                System.out.println(i);

        }
    }
 }
