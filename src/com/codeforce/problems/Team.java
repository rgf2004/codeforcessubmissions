package com.codeforce.problems;

import java.util.Scanner;

public class Team {

    public static void main(String [] args ) {

        Scanner sc=new Scanner(System.in);

        int problemsCount = Integer.parseInt(sc.nextLine());

        int implementedProblems = 0;

        for (int i = 0 ; i < problemsCount ; i++) {
            String [] line = sc.nextLine().split(" ");
            if ((Integer.parseInt(line[0]) + Integer.parseInt(line[1]) + Integer.parseInt(line[2])) >= 2)
                implementedProblems++;
        }

        System.out.println(implementedProblems);

    }

}
