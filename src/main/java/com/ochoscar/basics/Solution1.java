package com.ochoscar.basics;

import java.util.*;

class Solution1 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0; j < n; j++) {
                int partialResult = a;
                for(int k = 0; k <= j; k++) {
                    partialResult += (pow(2, k) * b);
                }
                System.out.print(partialResult);
                if(j < n - 1) System.out.print(" ");
            }
            System.out.println("");
        }
        in.close();
    }

    private static int pow(int a, int b) {
        int r = 1;
        for(int i = 0; i < b; i++) {
            r *= a;
        }
        return r;
    }
}