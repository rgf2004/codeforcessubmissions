package com.codeforce.problems;

import java.util.Scanner;

public class BearAndBigBrother {


    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        String [] params = sc.nextLine().split(" ");
        int bearInitialWeight = Integer.parseInt(params[0]);
        int brotherIntialWeight = Integer.parseInt(params[1]);

        int yearsCount = 0 ;
        while(bearInitialWeight <= brotherIntialWeight){
            yearsCount++;
            bearInitialWeight *=3;
            brotherIntialWeight *=2;
        }

        System.out.println(yearsCount);
    }

}
