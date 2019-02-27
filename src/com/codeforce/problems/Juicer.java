package com.codeforce.problems;

import java.util.Scanner;

public class Juicer {

    public static void main(String [] args) {

        Scanner sc=new Scanner(System.in);

        String [] input = sc.nextLine().split(" ");
        String [] orangesSizes = sc.nextLine().split(" ");

        long b = Long.parseLong(input[1]);
        long d = Long.parseLong(input[2]);

        long throwsCount = 0;
        long currentCount = 0;

        for (int i = 0 ; i < orangesSizes.length ; i++){

            if ( Integer.parseInt(orangesSizes[i]) <= b ) {

                if (currentCount + Integer.parseInt(orangesSizes[i]) > d){
                    currentCount = 0;
                    throwsCount ++;
                } else {
                    currentCount += Integer.parseInt(orangesSizes[i]);
                }
            }
        }

        System.out.print(throwsCount);

    }

}
