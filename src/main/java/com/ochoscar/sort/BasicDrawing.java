/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.sort;

import edu.princeton.cs.algs4.StdDraw;

/**
 *
 * @author ochoscar
 */
public class BasicDrawing {
    
    public static void main(String args[]) {
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(0, 0, 1);
        
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.setPenRadius(0.01);
        StdDraw.rectangle(0, 0, 0.5, 0.5);
    }
    
}
