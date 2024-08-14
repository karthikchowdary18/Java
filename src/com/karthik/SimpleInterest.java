package com.karthik;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
            //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//          //formula: SI = P × R × T / 100
          Scanner sc =  new Scanner(System.in);
          System.out.println("Enter P Value:");
          int P = sc.nextInt();
          System.out.println("Enter R Value:");
          int R = sc.nextInt();
          System.out.println("Enter T Value:");
          int T = sc.nextInt();
          int SI = P*R*T/100;
          System.out.println("Simple Interest is:" +SI);
    }
}
