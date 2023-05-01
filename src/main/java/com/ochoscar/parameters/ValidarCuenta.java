package com.ochoscar.parameters;

public interface ValidarCuenta {
	
	static int a = 0;

	public void validar();
	
	default public void prevalidar() {
		// Implementacion por defecto
	}
	
	static public void conLogica() {
		System.out.println("hola");
	}
	
}
