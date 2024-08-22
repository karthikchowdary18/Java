package com.karthik;

public class Methodoverloading {
    public static void main(String[] args) {
        nums(10,20 , 4);
    }
    static void nums(int a,int b){
        System.out.println(a+ " " + b);
    }
    static void nums(int a,int b ,int c){
        System.out.println(a+" "+ b + " "+ c);
    }
}
