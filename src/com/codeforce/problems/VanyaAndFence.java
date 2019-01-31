package com.codeforce.problems;


import java.util.Scanner;

/***
 * Problem URL : http://codeforces.com/contest/677/problem/A
 */
public class VanyaAndFence {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String line = sc.nextLine();
        String [] firstLine = line.split(" ");

        line = sc.nextLine();
        String [] secondLine = line.split(" ");

        int width=0;
        for (String person : secondLine){
            if (Integer.parseInt(person) <= Integer.parseInt(firstLine[1])){
                width += 1;
            } else {
                width += 2;
            }
        }

        System.out.println(width);

    }
}
