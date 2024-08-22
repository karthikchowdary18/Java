package com.karthik;

public class Shadowing {
    static int x=100; // here the x is shadowed at the line 8 because the higher level value is shadowed when we initialize the same again
    public static void main(String[] args) {
        System.out.println(x); // here it will print 100
        int x =30;
        System.out.println(x); // here the previous x will be shadowed
        game(); //  it will go into the method and print 100
    }

    static void game(){
        System.out.println(x);
    }
}
