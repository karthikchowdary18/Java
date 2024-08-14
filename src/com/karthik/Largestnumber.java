package com.karthik;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
           //Take 2 numbers as input and print the largest number.
             Scanner sc = new Scanner(System.in);
             int num1 = sc.nextInt();
             int num2 = sc.nextInt();
             if(num1 > num2){
                 System.out.println(num1);
             }
              else if(num1==num2){
                 System.out.println("equal");
             }
              else{
                 System.out.println(num2);
             }

    }
}
