package com.karthik;

import java.util.Arrays;

public class Passbybvalue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        modify(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void modify( int[] num){
        num [2] = 1; // here is we are modifying the array
    }
}
