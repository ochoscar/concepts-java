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
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        MetodosRecursivos m = new MetodosRecursivos();
        Long ini, fin, time;
        
        m.infinita(0L);
        
        // Factorial
        /*ini = System.currentTimeMillis();
        Long fact = m.factorial(10L);
        //Thread.sleep(100);
        fin = System.currentTimeMillis();
        time = fin - ini;
        System.out.println("Factorail de 10: " + fact + " time: " +  time);
        
        // Recursion infinita
        m.infinita(0L);
        
        // Inversion de string
        System.out.println("Inversion: " + m.inverse("hola que mas", "hola que mas".length() - 1));
        
        // Serie fibonaci
        ini = System.currentTimeMillis();
        Long fib = m.fibonacci(5L);
        //Thread.sleep(100);
        fin = System.currentTimeMillis();
        time = fin - ini;
        System.out.println("Fibonacci de 10: " + fib + " time: " +  time);
        
        // Numero par
        System.out.println("Par: " + m.par(223));
        System.out.println("Impar: " + m.impar(354));
        System.out.println("Par: " + m.par2(223));
        System.out.println("Par: " + m.par2(222));
        
        // Mayor de un vector
        int a[] = {10, 4, 7, 9, 15, 14, 2, 25, 6, 4};
        System.out.println("Mayor: " + m.mayor(a));
        
        // Funcion ackerman
        for(Long ma = 0L; ma < 4; ma++)
            for(Long na = 0L; na < 4; na++)
                System.out.println("Ackerman: " + ma + ", " + na + ": " + m.ackerman(ma, na));
        //System.out.println("Ackerman: " + m.ackerman(4L, 2L));
        
        // Busqueda binaria
        int b[] = {3, 5, 6, 9, 11, 14, 16, 19, 21, 24, 27, 30, 31, 35, 38, 40, 41, 44};
        System.out.println("busqueda: " + m.busqueda(b, -127));
        
        // Hanoi
        m.hanoi(3, 1, 2, 3);*/

    }
    
}
