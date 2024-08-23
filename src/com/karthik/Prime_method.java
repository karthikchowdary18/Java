package com.karthik;

import java.util.Scanner;

public class Prime_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
    static boolean prime(int n){
       if(n<=1){
           return false;
       }
       int c = 2;
       while (c*c <=n){
           if(n%c == 0){
               return false;
           }
           c++;
       }
       if(c*c>n){
           return true;
       }
       return false;
}
}
