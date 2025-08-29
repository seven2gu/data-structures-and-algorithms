package com01.handy.datastructures;


import com01.handy.datastructures.MyPow;

public class Test {
    public static void main(String[] args) {
        // Create
        MyPow mp = new MyPow();
        double x = 2.2;
        int n = 2;
        double mypow = mp.myPow(x, n);

        System.out.println("Power("+ x + "," + n + ") = " + mypow);
    }
}
