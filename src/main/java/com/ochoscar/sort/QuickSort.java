/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.sort;

/**
 *
 * @author ochoscar
 */
public class QuickSort {
    
    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void sort(Comparable[] a) {
        long ini = System.currentTimeMillis();
        //StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo quick: " + (fin - ini));
    }

    // quicksort the subarray from a[lo] to a[hi]
    private static void sort(Comparable[] a, int lo, int hi) { 
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    // partition the subarray a[lo..hi] so that a[lo..j-1] <= a[j] <= a[j+1..hi]
    // and return the index j.
    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) { 

            // find item on lo to swap
            while (GraphicalSort.less(a[++i], v))
                if (i == hi) break;

            // find item on hi to swap
            while (GraphicalSort.less(v, a[--j]))
                if (j == lo) break;      // redundant since a[lo] acts as sentinel

            // check if pointers cross
            if (i >= j) break;

            GraphicalSort.exch(a, i, j);
            //GraphicalSort.drawArray(a, i, j);
        }

        // put partitioning item v at a[j]
        GraphicalSort.exch(a, lo, j);
        //GraphicalSort.drawArray(a, lo, j);

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
    }

}
