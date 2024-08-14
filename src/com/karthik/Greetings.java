package com.karthik;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name that you want to wish:");
        String name = sc.nextLine();
        System.out.println("hello " + name);
    }
}
