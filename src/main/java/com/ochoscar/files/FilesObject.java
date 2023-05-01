package com.ochoscar.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FilesObject {
	
	private static final String filePath = "/Users/ochoscar/Desktop/j.txt";
	
	public static void main(String[] args) {
		// 1. Escribir al profesor
		Profesor pw = new Profesor("oscar", "ochoa", 21);
		write(pw);
		
		// 2. Leer el profesor
		Profesor pr = read();
		System.out.println(pr);
	}
	
	public static void write(Profesor p) {
		try(FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			oos.writeObject(p);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Profesor read() {
		Profesor returnProfesor = null;
		try(FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			returnProfesor = (Profesor)ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return returnProfesor;
	}

}
