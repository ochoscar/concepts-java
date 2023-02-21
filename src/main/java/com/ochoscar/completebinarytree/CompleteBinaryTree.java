/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.completebinarytree;

/**
 *
 * @author ochoscar
 */
public class CompleteBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Init...");
        BinaryTree<String> bt = new BinaryTree<>();
        //BinaryTree<String>.BinaryNode<String> bn = bt.new BinaryNode(null, null, null);
        bt.insert("K").insert("B").insert("P").insert("C").insert("D").insert("R").insert("S");
        System.out.println("Arbol:\n" + bt.toStringPreorder());
        System.out.println("Contiene R:\n" + bt.find("R"));
        System.out.println("Contiene Q:\n" + bt.find("Q"));
        bt.delete("P");
        System.out.println("Arbol:\n" + bt.toStringPreorder());
        print(bt);
        //assert false;
    }
    
    public static void print(BinaryTree<? extends Comparable> btree) {
        for(Object o : btree) {
            System.out.print(o + " ");
        }
    }
    
}
