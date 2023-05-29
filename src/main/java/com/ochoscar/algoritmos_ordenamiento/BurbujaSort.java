package com.ochoscar.algoritmos_ordenamiento;

public class BurbujaSort {
	
	public static void sort(Comparable[] a) {
		int n = a.length;
        long ini = System.currentTimeMillis();
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(MainOrdenamiento.less(a[j+1], a[j])) {
                	MainOrdenamiento.exch(a, j, j + 1);
                } 
                MainOrdenamiento.drawArray(a, j, j + 1);
            }
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin - ini));
	}

}
