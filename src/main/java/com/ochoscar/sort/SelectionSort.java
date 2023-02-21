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
public class SelectionSort {
    
    public static void sort(Comparable[] a) {
        int n = a.length;
        long ini = System.currentTimeMillis();
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if( GraphicalSort.less(a[j], a[min]) ) {
                    min = j;
                }
            }
            //GraphicalSort.drawArray(a, i, min);
            GraphicalSort.exch(a, i, min);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo seleccion: " + (fin - ini));
    }
    
}
