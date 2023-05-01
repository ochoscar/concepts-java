package com.ochoscar.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainFiles {
	
	private static final String filePath = "/Users/ochoscar/Desktop/j.txt";
	
	public static void main(String[] args) {
		// Conexion a base de datos...
		
		// 1. Escribir datos estructurados
		ArrayList<Profesor> profes = new ArrayList() {{
			add(new Profesor("oscar", "ochoa", 21));
			add(new Profesor("pedro", "marin", 32));
		}};
		String fileContent = "";
		for(Profesor p : profes) {
			fileContent += p.nombre;
			fileContent += "#";
			fileContent += p.apellido;
			fileContent += "#";
			fileContent += p.edad;
			fileContent += "\n";
		}
		write(fileContent);
		
		// 2. Leer la estructura
		String r = read();
		StringTokenizer st = new StringTokenizer(r, "\n");
		ArrayList<Profesor> profes2 = new ArrayList<>();
		while(st.hasMoreTokens()) { // Por cada linea == Por cada profesor
			String linea = st.nextToken(); // Ej de linea: oscar#ochoa#21
			String lineaValores[] = linea.split("#");
			String nombre = lineaValores[0];
			String apellido = lineaValores[1];
			Integer edad  = 30;//new Integer(lineaValores[2]);
			Profesor profeNuevo = new Profesor(nombre, apellido, edad);
			profes2.add(profeNuevo);
		}
		
		for(Profesor p : profes2) System.out.println(p);
	}
	
	public static String read() {
		String fileContent = "";
		try (FileInputStream fis = new FileInputStream(filePath);) {
			int c = 0;
			while( (c = fis.read()) != -1 )	fileContent += (char)c;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileContent;
	}
	
	public static void write(String message) {
		try (FileOutputStream fos = new FileOutputStream(filePath);) {
			fos.write(message.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Profesor implements Serializable {
	
	public String nombre;
	public String apellido;
	public Integer edad;
	
	public Profesor(String nombre, String apellido, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
}

