/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.trees.avl;

/**
 *
 * @author ochoscar
 */
public class AVLTree3 <T extends Comparable <T> > {
    
    private AVLNode<T> root;
    
    private class AVLNode<E extends Comparable<E> > {
        
        private E item;
        private AVLNode<E> left;
        private AVLNode<E> rigth;
        private int height;
        
        private AVLNode(E item) {
            this.item = item;
        }
        
    }
    
    public void insert(T item) {
        root = insert(root, item);
    }
    
    private AVLNode<T> insert(AVLNode<T> n, T item) {
        if(n == null) {
            AVLNode<T> newNode = new AVLNode(item);
            return newNode;
        } else {
            int k = n.item.compareTo(item);
            if(k > 0) {
                n.left = insert(n.left, item);
            } else {
                n.rigth = insert(n.rigth, item);
            }
            n.height = Math.max(height(n.left), height(n.rigth)) + 1;
            int diff = diffHeight(n);
            if(diff < -1) {
                if(diffHeight(n.rigth) > 0) {
                    n.rigth = rigthRotate(n.rigth);
                    return leftRotate(n);
                } else {
                    return leftRotate(n);
                }
            } else if(diff > 1) {
                if(diffHeight(n.left) > 0) {
                    n.left = leftRotate(n.left);
                    return rigthRotate(n);
                } else {
                    return rigthRotate(n);
                }
            }
        }
        return n;
    }
    
    private AVLNode<T> leftRotate(AVLNode<T> n) {
        AVLNode<T> r = n.rigth;
        n.rigth = r.left;
        r.left = n;
        n.height = Math.max(height(n.left), height(n.rigth)) + 1;
        r.height = Math.max(height(r.left), height(r.rigth)) + 1;
        return r;
    }
    
    private AVLNode<T> rigthRotate(AVLNode<T> n) {
        AVLNode<T> r = n.left;
        n.left = r.rigth;
        r.rigth = n;
        n.height = Math.max(height(n.left), height(n.rigth)) + 1;
        r.height = Math.max(height(r.left), height(r.rigth)) + 1;
        return r;
    }
    
    private int diffHeight(AVLNode<T> n) {
        return n == null ? 0 : (height(n.left) - height(n.rigth));
    }
    
    private int height(AVLNode<T> n) {
        return n == null ? 0 : n.height;
    }
    
}
