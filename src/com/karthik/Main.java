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

//        //type casting
//        int a = (int)(12.9f);
//        System.out.println(a);
//

//        //automatic type promotion in expressions
//        int e = 257;
//        byte b = (byte)(e);
//        System.out.println(b); //257 % 256 = 1
//

//        //java uses "UNICODE" principles
//        int num ='A'; //aacii values
//        int num2 = 'a'; //aacii values
//        System.out.println(num+num2);


//        //while loop(basics) if we dont know how many times the loop should run use  while OR use for loop
//        int count = 0;
//        while(count!= 5){
//            System.out.println(count);
//            count++;
//        }
//
//
//        //if condition(basics)
//       if(true){
//           System.out.println("kaa");
//       }
//
//
//       //for loop(basics) use you know how many time the loop should run
//          for(int cou = 0;cou != 5; cou++){
//              System.out.println(cou);
//          }

        Scanner sc = new Scanner(System.in);
        float tempC = sc.nextFloat();
        float tempF = (tempC*9/5)+32;
        System.out.println(tempF);

    }
}
