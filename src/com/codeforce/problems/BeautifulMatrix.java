package com.codeforce.problems;

/***
 * Problem URL: http://codeforces.com/contest/709/problem/A
 */

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String [] args) {

        int x=0, y=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0 ; i < 5 ; i++){
            String [] line = sc.nextLine().split(" ");
            for (int j = 0 ; j < 5 ; j++){
                if (line[j].equals("1")) {
                    x = i;
                    y = j;
                }
            }
        }

        int steps = Math.abs(x - 2) + Math.abs(y - 2);

        System.out.println(steps);

    }

}
