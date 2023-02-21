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
/*public class MergeSort {
    
    // stably merge a[lo .. mid] with a[mid+1 ..hi] using aux[lo .. hi]
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k]; 
        }

        // merge back to a[]
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)                               a[k] = aux[j++];
            else if (j > hi)                                a[k] = aux[i++];
            else if (GraphicalSort.less(aux[j], aux[i]))    a[k] = aux[j++];
            else                                            a[k] = aux[i++];
        }
        GraphicalSort.drawArray(a, 0, 0);
    }

    // mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable[] a) {
        long ini = System.currentTimeMillis();
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length-1);
        
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo merge: " + (fin - ini));
    }
    
}*/




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s115e19
 */
public class MergeSort {

    private static void merge(Comparable[] a,
                              Comparable[] aux, int lo, int mid, int hi) {
        // Copiar de a a aux
        for(int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        // Copiar nuevamente en a
        int i = lo; int j = mid + 1;
        for(int k = lo; k <= hi; k++) {
            if(i > mid)                             a[k] = aux[j++];
            else if(j > hi)                         a[k] = aux[i++];
            else if(GraphicalSort.less(aux[i], aux[j]))    a[k] = aux[i++];
            else                                    a[k] = aux[j++];
        }

        GraphicalSort.drawArray(a, -1, -1);
        //StdDraw.pause(10);
    }

    private static void sort(Comparable[] a,
                             Comparable[] aux, int lo, int hi) {
        if(lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        //System.out.println(lo + " " + mid + " " + hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable a[]) {
        long ini = System.currentTimeMillis();
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo merge: " + (fin - ini));
    }

}

