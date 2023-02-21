/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.recursivity;

/**
 *
 * @author ochoscar
 */
public class MetodosRecursivos {

    public Long factorial(Long x) {
        if (x == 0) {
            return 1L;
        } else {
            return x * factorial(x - 1);
        }
    }

    public void infinita(Long count) throws Exception {
            count++;
            System.err.println("Contador: " + count);
            //Thread.sleep(10);
            infinita(count);
        
        
    }

    public String inverse(String cadena, int x) {
        if (x == -1) {
            return "";
        }
        return cadena.charAt(x) + inverse(cadena, x - 1);
    }

    public Long fibonacci(Long x) {
        if (x == 0 || x == 1) {
            return x;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }

    public int par(int nump) {
        if (nump == 0) {
            return 1;
        }
        return impar(nump - 1);
    }

    public int impar(int numi) {
        if (numi == 0) {
            return 0;
        }
        return par(numi - 1);
    }

    public boolean par2(int x) {
        return (x == 0) ? true : !par2(x - 1);
    }

    public int mayor(int arr[]) {
        return mayor(arr, 0, Integer.MIN_VALUE);
    }

    private int mayor(int arr[], int i, int m) {
        if (i == arr.length) {
            return m;
        } else {
            return mayor(arr, i + 1, arr[i] > m ? arr[i] : m);
        }
    }

    public Long ackerman(Long m, Long n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackerman(m - 1L, 1L);
        } else {
            return ackerman(m - 1L, ackerman(m, n - 1L));
        }
    }

    public int busqueda(int arr[], int dato) {
        return busqueda(arr, dato, 0, arr.length - 1);
    }

    private int busqueda(int arr[], int dato, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = (lo + hi) / 2;
        if (arr[mid] == dato) {
            return mid;
        } else if (arr[mid] > dato) {
            return busqueda(arr, dato, lo, mid - 1);
        } else {
            return busqueda(arr, dato, mid + 1, hi);
        }
    }

    public void hanoi(int n, int origen, int auxiliar, int destino) {
        if (n == 1) {
            System.out.println("mover disco de " + origen + " a " + destino);
        } else {
            hanoi(n - 1, origen, destino, auxiliar);
            System.out.println("mover disco de " + origen + " a " + destino);
            hanoi(n - 1, auxiliar, origen, destino);
        }
    }

}
