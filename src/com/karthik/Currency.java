package com.karthik;
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
              //Input currency in rupees and output in USD.
              //1 INR = 0.011912 USD
              Scanner sc = new Scanner(System.in);
              float INR = sc.nextFloat();
              System.out.println("In USD the Indian Currency is: " + INR*0.011912);
    }
}
