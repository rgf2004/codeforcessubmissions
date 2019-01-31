package com.codeforce.problems;

import java.util.Scanner;

/***
 * Problem URL : http://codeforces.com/contest/734/problem/A
 */
public final class AntonAndDanik {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String line = sc.nextLine();

        char [] gamesResults = line.toCharArray();

        int antonCount=0;
        int danicCount= 0;

        for (char gameResult : gamesResults){
            if ('A' == gameResult)
                antonCount++;
            else
                danicCount++;
        }

        if (antonCount == danicCount)
            System.out.println("Friendship");
        else if (antonCount > danicCount)
            System.out.println("Anton");
        else
            System.out.println("Danik");
    }

}
