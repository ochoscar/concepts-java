/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.trees.binary;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ochoscar
 */
public class BinaryTree2<E extends Comparable<? super E> > implements Iterable<E> {

    private class BinaryNode< T extends Comparable<? super T> > {
        
        public T item;
        public BinaryNode<T> left;
        public BinaryNode<T> right;
        
        public BinaryNode(T item) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
        
    }
    
    private BinaryNode<E> root;
    
    public boolean find(E itemToFind) {
        BinaryNode<E> current = root;
        while(itemToFind.compareTo(current.item) != 0) {
            if(itemToFind.compareTo(current.item) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
            if(current == null) {
                return false;
            }
        }
        return true;
    }
    
    public BinaryTree2<E> insert(E itemToInsert) {
        BinaryNode<E> newNode = new BinaryNode(itemToInsert);
        if(root == null) {
            root = newNode;
        } else {
            BinaryNode<E> current = root;
            BinaryNode<E> parent;
            while(true) {
                parent = current;
                if(itemToInsert.compareTo(current.item) < 0) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        break;
                    }
                } else {
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        break;
                    }
                }
            }
        }
        return this;
    }
    
    public String toStringPreorder() {
        return toStringPreorder(root, 0);
    }
    
    private String toStringPreorder(BinaryNode<E> node, int level) {
        String r = "";
        for(int i = 0; i < level; i++) r += "---";
        r += (node != null ? node.item.toString() : "") + "\n";
        if(node == null || (node.left == null && node.right == null)) return r;
        r += toStringPreorder(node.left, level + 1);
        r += toStringPreorder(node.right, level + 1);
        return r;
    }
    
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            
            private Queue< BinaryNode<E> > queue;
            
            {
                queue = new LinkedList();
                queue.add(root);
            }
            
            @Override
            public boolean hasNext() {
                return !queue.isEmpty();
            }

            @Override
            public E next() {
                BinaryNode<E> node = queue.remove();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                return node.item;
            }
            
        };
    }
    
    public boolean delete(E itemToDelete) {
        BinaryNode<E> current = root;
        BinaryNode<E> parent = root;
        boolean isLeftChild = true;
        
        while(itemToDelete.compareTo(current.item) != 0) {
            parent = current;
            if(itemToDelete.compareTo(current.item) < 0) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if(current == null) {
                return false;
            }
        }
        
        // First case: the node don´t have childs
        if(current.left == null && current.right == null) {
            if(current == root) {
                root = null;
            } else if(isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if(current.right == null) {
            // Second case: no right child
            if(current == root) {
                root = current.left;
            } else if(isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.right;
            }
        } else if(current.left == null) {
            // Second case: no left child
            if(current == root) {
                root = current.right;
            } else if(isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.right;
            }
        } else {
            // Third case: generic case, the delete node has two childs
            BinaryNode<E> successor = getSuccessor(current);
            if(current == root) {
                root = successor;
            } else if(isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }
    
    private BinaryNode<E> getSuccessor(BinaryNode<E> delNode) {
        BinaryNode<E> sucessorParent;
        BinaryNode<E> sucessor = delNode;
        BinaryNode<E> current = delNode.right;
        
        while(current != null) {
            sucessorParent = sucessor;
            sucessor = current;
            current = current.left;
            
            //if(sucessor != delNode.rightChild) {
            if(current == null) {
                sucessorParent.left = sucessor.right;
                sucessor.right = delNode.right;
            }
        }
        return sucessor;
    }
    
    
}


