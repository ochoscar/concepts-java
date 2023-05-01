package com.ochoscar.parameters;

public class Fruta implements Comparable<Fruta>, ValidarCuenta {

	public int i = 1;
	
	public String nombre;
	
	public void metodo() {
		/*String s = "";
		int a;
		s += "hola";
		a = a + 1;
		i = i + 1;*/
	}
	
	@Override
	public int compareTo(Fruta o) {
		return nombre.compareTo(o.nombre); // Fresa.compareTo(Frambuesa)
	}

	@Override
	public void validar() {
		
	}
	
}
