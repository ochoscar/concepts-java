package com.ochoscar.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	
	public static String file = "/Users/ochoscar/Desktop/test.txt";

	public static void main(String[] args) {
		// lectura escritura basica
		write();
		read();
		// Escribir al final
		
		// Leer por linea
		
		// Lectura escritura objeto
	}
	
	public static void read() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int c = 0;
			String str = "";
			while((c = fis.read()) != -1) {
				str += (char)c;
			}
			
			System.out.println(str);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void write() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			
			String str = "hello \n Esta es una prueba 2 de un \nstring guardado en archivo";
			fos.write(str.getBytes());
			
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
}
