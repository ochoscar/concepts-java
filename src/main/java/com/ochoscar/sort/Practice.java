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
public class Practice {
    
    public static void insertion(Comparable a[]) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            for(int j = i; j > 0; j--) {
                if(GraphicalSort.less(a[j], a[j-1])) {
                    GraphicalSort.exch(a, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void selection(Comparable a[]) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i; j < n; j++) {
                if(GraphicalSort.less(a[j], a[min])) {
                    min = j;
                }
            }
            GraphicalSort.exch(a, i, min);
        }
    }    
    
    public static void merges(Comparable a[]) {
        Comparable aux[] = new Comparable[a.length];
        merges(a, aux, 0, a.length);
    }
    
    public static void merges(Comparable a[], Comparable aux[], int lo, int hi) {
        if(lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        merges(a, aux, lo, mid);
        merges(a, aux, mid + 1, hi);
        merger(a, aux, lo, mid, hi);
    }
    
    public static void merger(Comparable a[], Comparable aux[], int lo, int mid, int hi) {
        for(int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        
        int i = lo; int j = mid + 1;
        for(int k = lo; k <= hi; k++) {
            if(i > mid)                                 a[k] = aux[j++];
            if(j > mid)                                 a[k] = aux[i++];
            if(GraphicalSort.less(aux[j], aux[i]))      a[k] = aux[j++];
            else                                        a[k] = aux[i++];
        }
    }
    
}
