/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.binarytree;

/**
 *
 * @author ochoscar
 */
class Node {
    
    /***************************************************************************
    * Attributes.
    ***************************************************************************/

    public int iData;
    
    public double dData;
    
    public Node leftChild;
    
    public Node rightChild;
    
    /***************************************************************************
    * Methods.
    ***************************************************************************/

    public void displayNode() {
        System.out.print("{" + iData + ", " + dData + "}");
    }

}
