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
public class TestBinaryTree {
 
    public static void main(String args[]) {
        BinaryTree<Person> tree = new BinaryTree();
        tree.insert(new Person(50, "50")); 
        tree.insert(new Person(25, "25")); 
        tree.insert(new Person(75, "75")); 
        tree.insert(new Person(12, "12")); 
        tree.insert(new Person(37, "37")); 
        tree.insert(new Person(43, "43")); 
        tree.insert(new Person(30, "30")); 
        tree.insert(new Person(33, "33")); 
        tree.insert(new Person(87, "87")); 
        tree.insert(new Person(93, "93")); 
        tree.insert(new Person(97, "97")); 
        tree.insert(new Person(27, "27")); 
        tree.insert(new Person(29, "29")); 
        
        tree.displayTree();
        //System.out.println("ARBOL: \n" + tree.toStringPreorder());
        tree.delete(new Person(25, "25"));
        //System.out.println("ARBOL: \n" + tree.toStringPreorder());
        tree.displayTree();
    }
    
}
