/**
 * File: FindRange.java
 * --------------------
 * This program shows the largest and smallest number
 * from the user input.
 */

package com.company;

import java.util.*;

public class FindRange {

    public static void main(String[] args) {
        int min = 0;
        int max = 0;

        /*initialise scanner to get user input*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program finds the largest and smallest numbers.");

        /*Loop to let the user input become infinite until user types 0*/
        while (true) {
            System.out.print("? ");
            int userInput = scanner.nextInt();
            if (userInput == SENTINEL && min == 0 && max == 0){
                System.out.println("Please use 0 for ending the input and get the largest and smallest numbers.");
                break;
            } else if (userInput == SENTINEL && min != SENTINEL && max == SENTINEL) {
                max = min;
                break;
            } else if (userInput == SENTINEL && min == SENTINEL && max != SENTINEL) {
                min = max;
                break;
            } else if (userInput > SENTINEL && userInput > max) {
                max = userInput;
            } else if (userInput < SENTINEL  && userInput < min) {
                min = userInput;
            } else if (userInput > SENTINEL && userInput < max && min > SENTINEL) {
                min = userInput;
            } else if (userInput < SENTINEL && userInput > min && max < SENTINEL) {
                max = userInput;
            } else if (userInput == SENTINEL) {
                break;
            }
        }
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
    public static final int SENTINEL = 0;
}
