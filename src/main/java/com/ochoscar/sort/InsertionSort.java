/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.sort;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class InsertionSort {

    public static void sort(Comparable[] a) {
        int n = a.length;
        long ini = System.currentTimeMillis();
        for(int i = 0; i < n; i++) {
            for(int j = i; j > 0; j--) {
                if( GraphicalSort.less(a[j], a[j - 1]) ) {
                    GraphicalSort.exch(a, j, j - 1);
                    //GraphicalSort.drawArray(a, i, j-1);
                } else {
                    break;
                }
            }
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo insercion: " + (fin - ini));
    }

}
