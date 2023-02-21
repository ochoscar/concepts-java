/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.sort;

import edu.princeton.cs.algs4.*;
import java.awt.Color;

/**
 *
 * @author ochoscar
 */
public class GraphicalSort {

    // Burbuja(100.000)     125.641
    // Seleccion(100.000)    22.867
    // Insercion(100.000)    34.157
    // Shel(100.000)            128
    // Merge(100.000)           144
    // Merge(1.000.000)         959
    // Quick(100.000)            75
    // Quick(1.000.000)         492


    public static void main(String args[]) {
        StdDraw.enableDoubleBuffering();
        int N = 1000000;
        Person[] a = new Person[N];
        for (int i = 0; i < N; i++) {
            a[i] = new Person();
            a[i].setId(StdRandom.random());
        }
        
        //BubbleSort.sort(a);
        //SelectionSort.sort(a);
        //InsertionSort.sort(a);
        //ShellSort.sort(a);
        //MergeSort.sort(a);
        QuickSort.sort(a);
        
        //for(int i = 0; i < N; i++) System.out.print(a[i] + " ");
        
    }
    
    public static void drawArray(Comparable a[], int j, int k) {
        //return;
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledSquare(0, 0, 1.0);
        int N = a.length;
        // Dibuja el arreglo
        for (int i = 0; i < N; i++) {
            double x = (double) i / (double) N;
            double y = ((Person)a[i]).getId() / 2.0;
            double rw = (double)1 / (4 * N);
            double rh = ((Person)a[i]).getId() / 2.0;
            
            if(i == j) StdDraw.setPenColor(Color.RED);
            else if(i == k) StdDraw.setPenColor(Color.BLUE);
            else StdDraw.setPenColor(Color.GRAY);
            
            StdDraw.filledRectangle(x, y, rw, rh);
        }
        StdDraw.show();
        //StdDraw.pause(100);
    }
    
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    
    public static void exch(Comparable a[], int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

}
