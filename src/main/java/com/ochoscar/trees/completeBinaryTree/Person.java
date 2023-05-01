/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.trees.completeBinaryTree;

/**
 *
 * @author ochoscar
 */
public class Person implements Comparable<Person> {
    
    private int id;
    
    private String name;
    
    public Person() {
    }
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return id + "";
    }
    
    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
