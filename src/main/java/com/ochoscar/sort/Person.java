/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.sort;

/**
 *
 * @author ochoscar
 */
public class Person implements Comparable<Person> {
    
    private Double id;

    @Override
    public int compareTo(Person o) {
        return this.getId().compareTo(o.getId());
    }

    /**
     * @return the id
     */
    protected Double getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    protected void setId(Double id) {
        this.id = id;
    }
    
    public String toString() {
        return ("" + id).substring(0,3);
    }
    
}
