package com.karthik;

import java.util.Arrays;

public class Variable_len_arguments {
    // these are the variable length arguments we can do like this we can take n number of arguments like this
    public static void main(String[] args) {
        //argu(1,3,3,3,5,6);
        exp(1,2,"kaa","vaa","roo","tao");
    }
    static void exp(int a,int b,String...v){
        System.out.println(a+" "+b+" "+ Arrays.toString(v));
    }
     static void argu(int ...v){ // simply declared as array of type int we can take n number of arguments here
         System.out.println(Arrays.toString(v));
     }
}
