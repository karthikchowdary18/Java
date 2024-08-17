package com.karthik;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EmpID = sc.nextInt();
        String Empdep = sc.next();

        switch (EmpID) {
            case 1:
                System.out.println("KAA");
                break;
            case 2:
                System.out.println("VAA");
                break;
            case 3:
                switch (Empdep) {
                    case "CSE":
                        System.out.println("ok");
                        break;
                    case "IT":
                        System.out.println("not ok");
                        break;
                    default:
                        System.out.println("not departmet");
                        break;
                }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
