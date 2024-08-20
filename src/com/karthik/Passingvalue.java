package com.karthik;

public class Passingvalue {
    public static void main(String[] args) {
        String name = "kiki";
        hello(name); //pass by value
        System.out.println(name);

    }
    static  void hello(String hel){
        hel = "karthik"; // creating new object we are not modifying string
    }
}
