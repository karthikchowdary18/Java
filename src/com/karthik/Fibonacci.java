package com.karthik;

public class Fibonacci {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers.
        int n = 5,a=0,b=1;
        System.out.println("Fibonacci sequence upto " +n +"numbers:");
        for(int i=1;i<=n;i++){
        System.out.println(a);
        int c = a+b;
        a=b;
        b=c;
        }
        }
    }

