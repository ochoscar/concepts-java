package com.ochoscar.sort;

import edu.princeton.cs.algs4.StdDraw;
import static edu.princeton.cs.algs4.StdDraw.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Inicializando programa");
		
		StdDraw.setXscale(-1.0, 1);
		StdDraw.setYscale(-1.0, 1);
		
		double rx = 0.256, ry = 0.265;
		double vx = 0.015, vy = 0.025;
		double r = 0.01;
		
		while(true) {
			if(Math.abs(rx + vx) > 1) vx = -vx;
			if(Math.abs(ry + vy) > 1) vy = -vy;
			
			rx = rx + vx;
			ry = ry + vy;
			
			//setPenColor(WHITE);
			//filledRectangle(0, 0, 1, 1);
			
			setPenColor(BLUE);
			filledCircle(rx, ry, r);
			
			Thread.sleep(50);
		}
		
		
		
		
		
		
	}

}
