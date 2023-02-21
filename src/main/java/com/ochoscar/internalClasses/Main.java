package com.ochoscar.internalClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public int id;
	
	//public abstract void method();
	
	public static void main(String[] args) {
		comparaciones();
		manejoFechas();
		stringsCharacter();
		excepcionRT();
		excepcionE();
		clasesInternas();
		Main m = returnOBj();
		//m.method();
		InterfaceConClase ic = new InterfaceConClase() {

			@Override
			public void normal() {
				System.out.println("normal");
				
			}
			
		};
		InterfaceConClase.Inter inter = new InterfaceConClase.Inter();
	}
	
	public static Main returnOBj() {
		return new Main() {
			
			public int j = 3;
			
//			public void method() {
//				super.comparaciones();
//				System.out.println("test anonimo");
//			}

		}; // requiere ;
	}
	
	public static void clasesInternas() {
		ClasesInternas ci = new ClasesInternas();
		ClasesInternas.Interna1 vi1 = ci.new Interna1();
		ClasesInternas.inter1 in1 = new ClasesInternas.inter1();
		vi1.test();
		ClasesInternas.Interna1 vi2 = ci.method();
		ClasesInternas.i = 5;
		Interna2 int2 = new Interna2();
		
	}
	
	public static void excepcionE() {
		try {
			throw new Exception("test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void excepcionRT() {
		throw new RuntimeException("test");
	}
	
	public static void stringsCharacter() {
		Character c = new Character('a');
		
	}
	
	public static void manejoFechas() {
		Date d1 = new Date(System.currentTimeMillis());
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		System.out.println(sf.format(d1));
		
		Scanner sc = new Scanner(System.in);
		try {
			Date date = sf.parse(sc.nextLine());
			System.out.println(sf.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void comparaciones() {
		int j = 1_000_000;
		float k = 1_000_000.00f;

		Integer i1 = 5;
		Integer i2 = 5;
		Integer i3 = new Integer(5);
		Integer i4 = new Integer(5);
		Integer i5 = Integer.valueOf(5);
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println(i1 == i3);
		System.out.println(5 == 5.00);
		
		// Maximos años representados en long
		System.out.println(Long.MAX_VALUE / 1000 / 60 / 60 / 24 / 365);
		// Desbordamiento de numero
		System.out.println(Long.MAX_VALUE + 1);
	}

}
