package com.ochoscar.basics;

public class Basics {

    public static void main(String[] args) {
        System.out.println(Math.pow(2, 0));
        System.out.println(pow(2, 0));
    }

    private static int pow(int a, int b) {
        int r = 1;
        for(int i = 0; i < b; i++) {
            r *= a;
        }
        return r;
    }
}
