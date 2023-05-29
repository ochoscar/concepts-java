package com.ochoscar.algoritmos_ordenamiento;

import java.util.Random;

import edu.princeton.cs.algs4.StdDraw;

public class MainOrdenamiento {
	
	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		int n =  200;
		Integer[] a = new Integer[n];
		Random r = new Random();
		
		// Se genera el arreglo aleatorio
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(1000);
			System.out.print(a[i] + " ");
		}
		
		//drawArray(a, 5, 15);
		
		// Ordenar
		BurbujaSort.sort(a);
		
		System.out.println("");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	
	public static void drawArray(Comparable a[], int j, int k) {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledSquare(0, 0, 1.0);
        int N = a.length;
        // Dibuja el arreglo
        for (int i = 0; i < N; i++) {
            double x = (double) i / (double) N;
            double y = ((Integer)a[i]) / 1000.0 / 2.0;
            double rw = (double)1 / (4 * N);
            double rh = ((Integer)a[i]) / 1000.0 / 2.0;
            
            if(i == j) StdDraw.setPenColor(StdDraw.RED);
            else if(i == k) StdDraw.setPenColor(StdDraw.BLUE);
            else StdDraw.setPenColor(StdDraw.GRAY);
            
            StdDraw.filledRectangle(x, y, rw, rh);
        }
        StdDraw.show();
        //StdDraw.pause(50);
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
