package com.karthik;

public class Functionscope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a); // we can only use a,b in this particular function scope only we cant use a in cond function
    }
    static void cond(){
        int num1 = 22;
        System.out.println(num1); // same we can use num1 in this function only
    }
}
