package com.codeforce.problems;

import java.util.Scanner;

public class DieRoll {

    static long gcm(long a, long b) {
        return b == 0 ? a : gcm(b, a % b); // Not bad for one line of code :)
    }

    static String asFraction(long a, long b) {
        long gcm = gcm(a, b);
        return (a / gcm) + "/" + (b / gcm);
    }


    public static void main (String [] args){

        int x,y;
        Scanner sc=new Scanner(System.in);

        String [] input = sc.nextLine().split(" ");
        x = Integer.parseInt(input[0]);
        y = Integer.parseInt(input[1]);

        int numerator = 6 - Math.max(x,y) + 1;
        System.out.println(asFraction(numerator, 6));

    }
}
