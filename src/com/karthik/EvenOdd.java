package com.karthik;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        if((num % 2)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("odd Number");
        }
    }
}
