package com.ochoscar.dataStructures;

import java.util.Objects;

public class Person {
	
	private Integer id;
	
	private String name;
	
	// Objetos iguales deben tener igual hashcode, si se implementa equals es necesario también implemntar hashcode
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	// Verifica la igualdad por un atributo
	public boolean equals(Object o) {
		if(o instanceof Person) {
			return id == ((Person)o).getId();
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "id: " + id + " name: " + name;
	}
	
	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
