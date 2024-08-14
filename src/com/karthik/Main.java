package com.karthik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc =  new Scanner(System.in);
//        System.out.println(sc.next());
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Do you remembered your number:");
//            int num = sc.nextInt();
//            System.out.println("your number is "+num);

        //type casting
        int a = (int)(12.9f);
        System.out.println(a);

        //automatic type promotion in expressions
        int e = 257;
        byte b = (byte)(e);
        System.out.println(b); //257 % 256 = 1

        //java uses "UNICODE" principles
        int num ='A'; //aacii values
        int num2 = 'a'; //aacii values
        System.out.println(num+num2);



    }
}
