package com.karthik;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        sum(); //"function" is a block of code which we can use when we want.
        //in java the function with in the class is called as "method"
    }
    static void sum(){ //when we don't use object we can use "static"
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println(sum);
    }
}
