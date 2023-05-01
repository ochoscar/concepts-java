package com.ochoscar.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		testHashSet();
		testHashMap();
		Person p1 = new Person(1, "Oscar");
		Person p2 = new Person(2, "Sandra");
		Person p3 = new Person(3, "Manuel");
		Person p4 = new Person(4, "Uriel");
		List<Person> a = Arrays.<Person>asList(p1, p2, p3, p4);
		print(a);
		lista();
		pila();
		cola();
		arbol();
	}
	
	public static void lista() {
		List<String> list = new LinkedList<>();
		List<String> list2 = new ArrayList() {{
			add("Oscar"); add("Andres");
		}};

	}
	
	public static void pila() {
		Stack<String> st = new Stack<>();
		st.push("A");
		st.push("B");
		st.push("C");
		//System.out.println("mm: " + st.get(1));
//		for(String str : st) {
//			String s = st.pop();
//		}
		System.out.println("mm: " + st.pop());
		System.out.println("mm: " + st.pop());
		System.out.println("mm: " + st.pop());
	}

	public static void cola() {
		Queue<String> q = new LinkedList<>();
		//String s = q.remove();
	}
	
	public static void arbol() {
		TreeMap tm = new TreeMap<>();
		
	}
	
	public static void print(List<?> arr) {
		for(Object s : arr) {
			System.out.println(s);
		}
	}
	
	public static void testHashMap() {
		Map<Integer, Person> hm = new HashMap<>();
		Person p1 = new Person(1, "Oscar");
		Person p2 = new Person(2, "Sandra");
		Person p3 = new Person(3, "Manuel");
		Person p4 = new Person(4, "Uriel");
		
		hm.put(1, p1);
		hm.put(2, p2);
		hm.put(3, p3);
		hm.put(4, p4);
		
		System.out.println(hm.get(3));
		System.out.println("Foreach: Forma alternativa para recorrer los Map mostrando la Clave y el valor:");
		for (Entry<Integer, Person> jugador : hm.entrySet()){
			Integer clave = jugador.getKey();
			Person valor = jugador.getValue();
			System.out.println(clave+"  ->  "+valor);
		}
	}
	
	public static void testHashSet() {
		// Operaciones en tiempo constante
		Set<String> hs = new HashSet<>();
		hs.add("Antioquia");
		hs.add("Nariño");
		hs.add("Choco");
		hs.add("Choco");
		
		for(String s : hs) {
			System.out.println(s);
		}
		
	}
	
}
