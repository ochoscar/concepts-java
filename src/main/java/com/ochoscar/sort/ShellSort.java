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
public class ShellSort {
    
    public static void sort(Comparable[] a) {
        long ini = System.currentTimeMillis();
        int n = a.length;

        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ... 
        int h = 1;
        while (h < n/3) h = 3*h + 1; 

        while (h >= 1) {
            // h-sort the array
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && GraphicalSort.less(a[j], a[j-h]); j -= h) {
                    GraphicalSort.exch(a, j, j-h);
                    GraphicalSort.drawArray(a, j, j - h);
                }
            }
            h /= 3;
        }
        
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo shell: " + (fin - ini));
    }
    
}
