package com.seven.datastructures;

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
