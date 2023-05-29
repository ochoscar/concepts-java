package com.ochoscar.errores;

public class GeneralidadesExcepciones {
	
	private static entity.Vehiculo v;
	
	public static void main(String[] args)  {
		//Vehiculo v = null;
		//v.status = 5;
		try {
			m3();
		} catch(FaltaPagoException e) {
			System.out.println("Captura de error de falta pago: " + e.nombreUsaurio);
		} catch(Exception e) {
			System.out.println("fasd");
		} finally {
			System.out.println("Liberamos recursos");
		}
	}
	
	public static void m3() throws FaltaPagoException {
		m1();
	}
	
	public static void m1() throws FaltaPagoException {
		try {
			System.out.println("Antes del error");
			/*int tam = 1;
			int[] b = new int[tam];
			b[3] = 4;
			int a = 5 / 0;
			v.status = 5;
			System.out.println("Despues del error");*/
		} catch(ArithmeticException ex) {
			System.out.println("Ha ocurrido un error / 0" + ex.getMessage());
			ex.printStackTrace();
		} catch(NullPointerException ex) {
			System.out.println("Ha ocurrido un error nulo " + ex.getMessage());
		}
		throw new FaltaPagoException("este man no pago", "Mala Paga Osorio");
	}
	
	public static void m2() {
		return;
		//int a = 0;
	}

}
