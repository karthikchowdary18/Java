package com.karthik;

public class Blockscope {
    public static void main(String[] args) {
        // Anything which is initialized outside the block, can be used modified inside.
        //Anything which is initialized with in th block we use within the same block not outside that block
        int a = 10;
        int b = 20;
        {

            // int a = 10; // we cannot initialize the same int a in the other block in the same function, but we can modify it
        a = 200; // so here we can modify the value in outside this block
            System.out.println(a);

        }
 // the output will be 200 because we changed the value which is outside the block it is possible

        //now look for the For loop
        for (int i = 0; i<4;i++){
            int num = 22;
            System.out.println(num);
        }
        //System.out.println(num);
        // we cannot use num outside the for loop it shows error.

    }
}
