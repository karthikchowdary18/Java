package com.karthik;

public class Reversenum {
    public static void main(String[] args) {
        int n =1234;
        int ans =0;
        while(n>0){
            int rem = n%10; //4
            n/=10;//123
            ans = ans*10+rem;//0=0*10+4=4
            }
        System.out.println(ans);
        }
    }
