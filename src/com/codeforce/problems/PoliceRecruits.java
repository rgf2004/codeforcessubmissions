package com.codeforce.problems;

import java.util.Scanner;

/***
 * Problem URL : http://codeforces.com/contest/427/problem/A
 */
public class PoliceRecruits {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String [] eventsList = sc.nextLine().split(" ");

        int available = 0;
        int untreated = 0;
        for (String eventStr : eventsList){
            int event = Integer.parseInt(eventStr);
            if (event < 0 ) { // crime
                if (available > 0 ){
                    available --;
                } else {
                    untreated ++;
                }
            } else { // recruit
                available += event;
            }
        }

        System.out.println(untreated);


    }

}
