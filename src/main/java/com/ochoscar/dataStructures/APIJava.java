package com.ochoscar.dataStructures;

import java.util.*;

public class APIJava {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("hola");
        q.remove();

        Stack<String> s = new Stack<>();
        s.push("hola");
        s.pop();

        Vector<String> v = new Vector<>();
        v.add("hola");
        v.get(0);

        HashMap<Long, Estudiante> map = new HashMap<>();
        Estudiante e = new Estudiante();
        map.put(1L, e);
        //System.out.println("Mapa: " + map.get(1L));
        for(Estudiante est : map.values()) {
            System.out.println(est);
        }

    }

}


class Estudiante2 {

    public Long id;

    public String name;

}