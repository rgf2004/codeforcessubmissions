package com.codeforce.problems;

import java.util.Scanner;

/***
 * Problem URL : http://codeforces.com/contest/344/problem/A
 */

public class Magnets {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int magnetsCount = Integer.parseInt(sc.nextLine());

        int count = 0;
        String current = null;
        for (int i = 0 ; i < magnetsCount ; i++){
            String magnet = sc.nextLine();
            if (!magnet.equals(current)){
                current = magnet;
                count++;
            }
        }

        System.out.println(count);
    }

}
