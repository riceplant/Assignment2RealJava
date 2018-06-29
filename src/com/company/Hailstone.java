package com.company;

import java.util.*;

public class Hailstone {

    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        /* get the loop to repeat input */
        while (true) {
            int n = sc.nextInt();
            while (n != 1) {

                /* If the number is odd -> 3n+1 -> store it in temporary variable nTempOdd */
                if (n % 2 != 0) {
                    int nTempOdd = n * 3 + 1;
                    System.out.println(n + " is odd, so I make 3n+1: " + nTempOdd);
                    n = nTempOdd;
                    counter++;
                    break;
                } else if (n % 2 == 0) {
                    int nTempEven = n / 2;
                    System.out.println(n + " is even so I take half: " + nTempEven);
                    n = nTempEven;
                    counter++;
                    break;
                }
                System.out.println("The process took " + counter + " to reach 1.");
            }
        }
    }
}
