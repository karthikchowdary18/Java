package com.karthik;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("enter operator:");
        int ans= 0;
        char ch = sc.next().trim().charAt(0);

        while (true){
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch=='%') {

                System.out.println("Enter Numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (ch == '+') {
                    ans = num1 + num2;
                }
                if (ch == '-') {
                    ans = num1 - num2;
                }
                if (ch == '*') {
                    ans = num1 * num2;
                }
                if (ch == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (ch == '%') {
                    ans = num1 % num2;
                }
            } else if (ch == 'x' || ch =='X') {
                    break;
                }else {
                System.out.println("Invalid");
            }

            System.out.println(ans);
            }
    }
}

