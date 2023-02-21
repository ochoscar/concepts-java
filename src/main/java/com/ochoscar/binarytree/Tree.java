/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.binarytree;

import java.util.Stack;

/**
 *
 * @author ochoscar
 */
public class Tree {
    
    /***************************************************************************
    * Attributes.
    ***************************************************************************/
    
    private Node root;
    
    /***************************************************************************
    * Methods.
    ***************************************************************************/
    
    public Tree() {
        root = null;
    }
    
    public Node find(int key) {
        Node current = root;
        while(current.iData != key) {
            if(key < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if(current == null) {
                return null;
            }
        }
        return current;
    }
    
    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;
        
        if(root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if(id < current.iData) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        
        while(current.iData != key) {
            parent = current;
            if(key < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null) {
                return false;
            }
        }
        
        // First case: the node don´t have childs
        if(current.leftChild == null && current.rightChild == null) {
            if(current == root) {
                root = null;
            } else if(isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if(current.rightChild == null) {
            // Second case: no right child
            if(current == root) {
                root = current.leftChild;
            } else if(isLeftChild) {
                    parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if(current.leftChild == null) {
            // Second case: no left child
            if(current == root) {
                root = current.rightChild;
            } else if(isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {
            // Third case: generic case, the delete node has two childs
            Node successor = getSuccessor(current);
            if(current == root) {
                root = successor;
            } else if(isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }
    
    private Node getSuccessor(Node delNode) {
        Node sucessorParent;
        Node sucessor = delNode;
        Node current = delNode.rightChild;
        
        while(current != null) {
            sucessorParent = sucessor;
            sucessor = current;
            current = current.leftChild;
            
            //if(sucessor != delNode.rightChild) {
            if(current == null) {
                sucessorParent.leftChild = sucessor.rightChild;
                sucessor.rightChild = delNode.rightChild;
            }
        }
        return sucessor;
    }
    
    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");
        
        while(isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            
            for(int j = 0; j < nBlanks; j++) {
                System.out.print(" ");
            }
            
            while(globalStack.isEmpty() == false) {
                Node temp = (Node)globalStack.pop();
                if(temp != null) {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    
                    if(temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j<nBlanks*2-2; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            nBlanks /= 2;
            while(localStack.isEmpty() == false) {
                globalStack.push( localStack.pop() );
            }
        }
        System.out.println("......................................................");
    }
    
}
