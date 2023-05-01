package com.ochoscar.dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class APICollection {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		LinkedList<String> ll = new LinkedList<>();
		
		Queue<String> q = new LinkedList<>();
		q.add("hola");
		q.remove();
		
		Stack<String> stack = new Stack<>();
		stack.push("hola");
		stack.pop();
		
		Vector<String> vec = new Vector<>(); // Thread safe: seguras con hilos
		
		HashMap<Long, Estudiante> mapa = new HashMap<>();
		mapa.put(1L, new Estudiante());
		mapa.get(1L);
		for(Estudiante e : mapa.values()) {
			System.out.println(e);
		}
		
	}

}

class Estudiante {

	
	
	
}
