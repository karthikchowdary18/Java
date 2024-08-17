package com.karthik;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();

        switch (animal){
            case "cat" -> System.out.println("meow");
            case "dog" -> System.out.println("Bow");
            case "tiger" -> System.out.println("kaa");
            default -> System.out.println("Not an Animal");
        }
    }
}
