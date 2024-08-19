package com.karthik;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.next();
        String ans = greetings(name);
        System.out.println(ans);
    }

    static String greetings (String a){
       String b = "hello " + a;
       return  b;
    }
}
