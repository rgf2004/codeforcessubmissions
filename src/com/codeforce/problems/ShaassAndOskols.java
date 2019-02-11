package com.codeforce.problems;

import java.util.Scanner;

/***
 * Problem URL : http://codeforces.com/contest/677/problem/A
 */

public class ShaassAndOskols {

    public static void main(String [] args) {

        Scanner sc=new Scanner(System.in);

        int wiresCount = Integer.parseInt(sc.nextLine());
        int [] birdsPerWire = new int[wiresCount];
        String [] input = sc.nextLine().split(" ");
        for (int i = 0 ; i < wiresCount ; i++)
            birdsPerWire[i] = Integer.parseInt(input[i]);

        int shootsCount = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < shootsCount ; i++){
            input = sc.nextLine().split(" ");
            int wireIndex = Integer.parseInt(input[0])-1;
            int leftBirdsCount = Integer.parseInt(input[1]);
            int currentBirdsCount = birdsPerWire[wireIndex];
            birdsPerWire[wireIndex] = 0;
            if (wireIndex > 0)
                birdsPerWire[wireIndex-1] += leftBirdsCount - 1;
            if (wireIndex < wiresCount-1 )
                birdsPerWire[wireIndex+1] += currentBirdsCount - leftBirdsCount ;
        }

        for (int x : birdsPerWire)
            System.out.println(x);

    }
}
