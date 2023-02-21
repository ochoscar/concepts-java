/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.sort;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author ochoscar
 */
public class BubbleSort {
    
    public static void sort(Comparable[] a) {
        int n = a.length;
        int c = 0;
        long ini = System.currentTimeMillis();
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(GraphicalSort.less(a[j+1], a[j])) {
                    GraphicalSort.exch(a, j, j + 1);
                } 
                //GraphicalSort.drawArray(a, j, j + 1);
            }
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo burbuja: " + (fin - ini));
    }
    
}
