package fechas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/**long ini = System.currentTimeMillis();
		Date hoy = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/yyyy HH:mm");
		
		
		long fin = System.currentTimeMillis();
		long tiempo = fin - ini;
		
		System.out.println(sdf.format(hoy));*/
		
		
		byte b = Byte.MAX_VALUE;
		b++;
		System.out.println(System.currentTimeMillis() / (1000 * 60 * 60 * 24 * 365));
		
		Random r = new Random();
		System.out.println(1 + r.nextInt(6));
		
		// Lectura de la consola
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un dato: ");
		String linea = sc.nextLine();
		System.out.println(linea);*/
	}

}
