/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.sort;

import java.util.Random;

/**
 *
 * @author ochoscar
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double arreglo[] = new Double[50];
        Random r = new Random();
        for(int i = 0; i < arreglo.length - 1; i++) {
            arreglo[i] = r.nextDouble();
        }

        MergeSort.sort(arreglo);




    }
    
}
