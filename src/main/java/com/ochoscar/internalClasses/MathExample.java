package com.ochoscar.internalClasses;

import static java.lang.Math.PI;

import java.util.ArrayList;
import java.util.Random;




public class MathExample {
	
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(100));
		System.out.println(r.nextInt(100));
		System.out.println(r.nextInt(100));
		System.out.println(area(2));
		System.out.println(mins(3, 4, 5, 6, 2, 7));
		MathExample me = new MathExample();
		System.out.println( me.<Integer>minsg(3, 4, 5, 6, 2, 7));
	}
	
	public <E extends Comparable<E> > E minsg(E... vals) {
		E min = vals[0];
		int i = 0;
		for(E e : vals) {
			if(e.compareTo(min) < 0) {
				min = vals[i];
			}
			i++;
		}
		return min;
	}
	
	public static double mins(double... vals) {
		double min = vals[0];
		for(int i = 0; i < vals.length; i++ ) {
			if(min > vals[i]) {
				min = vals[i];
			}
		}
		return min;
	}

	public static <E> void sortTest(ArrayList<String> arr) {

	}
	
	public static double area(double radio) {
		return PI * radio * radio;
	}

}
