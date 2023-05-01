package com.ochoscar.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestStream {

	/*public static void main(String[] args) {
		//createStream();
		//operationsStream1();
		//operationsStream2();
		//operationsStream3();
		operationsStream4();
	}
	
	public static void operationsStream4() {
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>() {{
			add(new Vehiculo(2010, "Chevrolet", "Blanco"));
			add(new Vehiculo(2013, "Nissan", "Rojo"));
			add(new Vehiculo(2011, "Renault", "Azul"));
			add(new Vehiculo(2015, "Audi", "Negro"));
			add(new Vehiculo(2014, "BMW", "Amarillo"));
		}};
		
		//lista.stream().map(v -> v.getMarca()).forEach(System.out::println);
		Optional<Vehiculo> mayor = lista.stream().max((x, y) -> {
			if(x.getModelo() > y.getModelo()) return 1;
			else if(x.getModelo() < y.getModelo()) return -1;
			else return 0;
		});
		//System.out.println(mayor.get());
		
		List<String> marcas = lista.stream().map(v -> v.getMarca()).collect(Collectors.toList());
		for(String s : marcas) System.out.println(s);
	}
	
	public static void operationsStream3() {
		ArrayList<String> lista = new ArrayList<String>() {{
			add("a@a.com"); add("b@b.com"); add("c@c.com"); add("d@d.com");
			add("e@e.com"); add("f@f.com"); add("g@g.com"); add("h@h.com");
			add("h@h.com"); add("h@h.com"); add("h@h.com"); add("h@h.com");
		}};
		
		String blackList = "b@b.com,h@h.com";
		//blackList = "a@a.com";

		// Imprima la lista sin incluir los de la lista negra
		for(int i = 0; i < lista.size(); i++) {
			if(blackList.contains(lista.get(i))) {
				lista.remove(i);
			}
		}
		Predicate<String> filtro = correo -> !blackList.contains(correo);
		lista.stream().filter(filtro).forEach(System.out::println);
	}
	
	public static void operationsStream2() {
		Stream.iterate(2, x -> x + 1).limit(20).filter(x -> 
				Stream.iterate(2, t -> t + 1).limit(x - 2).allMatch(t -> x % t != 0)	
			).forEach(System.out::println);
	}
	
	public static void operationsStream1() {
		ArrayList<String> lista = new ArrayList<String>() {{
			add("Madrid"); add("Pereira"); add("Pretoria"); add("Cairo");
			add("Miami"); add("Paris"); add("Berlin"); add("Medellin");
		}};
		
		lista.stream().filter(str -> str.startsWith("M")).forEach(System.out::println);
	}
	
	public static void createStream() {
		// Creacion de arreglos de dos formas
		List<String> arr = Arrays.asList("Madrid", "Pereira", "Pretoria", "Cairo"); // Inmutable
		ArrayList<String> lista = new ArrayList<String>() {{
			add("Madrid"); add("Pereira"); add("Pretoria"); add("Cairo");
		}};
		
		// Primera forma a partir de un arreglo
		Stream<String> s1 = lista.stream();
		s1.forEach(x -> System.out.println(x));
//		lista.add("Medellin");
//		s1 = lista.stream();
//		s1.forEach(x -> System.out.println(x));
		
		// Segunda forma Usando un metodo estatico
		Stream<String> s2 = Stream.of("Madrid", "Pereira", "Pretoria", "Cairo");
		//s2.forEach(x -> System.out.println(x));
		//s2.forEach(x -> System.out.println(x)); No se puede recorrer dos veces
		
		// Tercera forma, con una semilla y una expresion iterativa
		Stream<Integer> s3 = Stream.iterate(1, x -> x + 1);
		//s3.skip(5).limit(20).forEach(x -> System.out.println(x));
		
		// Cuarta forma Con una clase interna Builder
		Stream.Builder<String> sb = Stream.builder();
		sb.accept("Medellin");
		sb.accept("Bogota");
		sb.accept("Sabaneta");
		Stream<String> s4 = sb.build();
		s4.forEach(x -> System.out.println(x));
		
	}*/
	
}
