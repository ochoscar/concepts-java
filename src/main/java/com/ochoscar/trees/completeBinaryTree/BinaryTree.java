/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ochoscar.trees.completeBinaryTree;

import java.util.Stack;

/**
 *
 * @author ochoscar
 */
public class BinaryTree<T extends Comparable<T>> {
    
    private BinaryNode<T> root;
    
    public BinaryTree() {
    }
    
    // 0. Recorrido en levelorder
    // 1. Armar todas las rutas de un árbol binario
    // 2. Contar el numero de hojas
    // 3. Determinar la profundidad de un árbol binario
    // 4. Eliminar las que actualmente son las hojas de un árbol
    // 5. Relfeje un árbol, intercambiado subárbol derecho e izquierdo comenzando por los niveles de mayor profundidad
    // 6. Encuentre el mayor elemento de un árbol
    // 7. Encuentre el menor elemento de un árbol
    // 8. Diseñe un metodo insert de tal forma que inserte siguiendo levelorder
    // 9. Diseñe un algoritmo recursivo de búsqueda binaria
    // 10. Use recursividad cruzada para programar el calculo del sin y cos:
    //     sin2x = 2sinx cosx 
    //     cos2x = 1 – 2(sinx)^2
    //     Use las aproximaciones
    //     sin x = x – x3/6
    //     cos x = 1 - x^2/2
    //     Cuando x es pequeño
    // 11. Escriba una función recursiva para hallar una potencia
    // 12. Escriba una función recursiva que invierta una cadena
    
    public void insert(T item) {
        BinaryNode<T> newNode = new BinaryNode<>(null, null, item);
        
        if(root == null) {
            root = newNode;
            return;
        }
        
        BinaryNode<T> current = root;
        BinaryNode<T> parent = root;
        boolean isLeft = false;
        while(current != null) {
            parent = current;
            if(current.compareTo(newNode) > 0) {
                current = current.getLeft();
                isLeft = true;
            } else {
                current = current.getRight();
                isLeft = false;
            }
        }
        if(isLeft) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }
    }
    
    public boolean findItem(T item) {
        BinaryNode<T> current = root;
        
        while(current != null) {
            if(current.getItem().compareTo(item) == 0) {
                return true;
            } else if(current.getItem().compareTo(item) > 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return false;
    }
    
    private BinaryNode<T> findNode(T item) {
        BinaryNode<T> current = root;
        
        while(current != null) {
            if(current.getItem().compareTo(item) == 0) {
                return current;
            } else if(current.getItem().compareTo(item) > 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return null;
    }
    
    public boolean delete(T item) {
        // Encontrar el nodo a eliminar y su padre
        BinaryNode<T> current = root;
        BinaryNode<T> parent = current;
        boolean isLeft = false;
        
        while(current != null) {
            if(current.getItem().compareTo(item) == 0) {
                break;
            } else if(current.getItem().compareTo(item) > 0) {
                parent = current;
                current = current.getLeft();
                isLeft = true;
            } else {
                parent = current;
                current = current.getRight();
                isLeft = false;
            }
            if(current == null) {
                return false;
            }
        }
        
        // Caso 1: No se tienen hijos
        if(current.getLeft() == null && current.getRight() == null) {
            if(current == root) {
                root = null;
            } else if(isLeft) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        } else if(current.getLeft() != null && current.getRight() == null) {
            // Caso 2: se tiene un hijo izquierdo
            if(current == root) {
                root = current.getLeft();
            } else if(isLeft) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setRight(current.getLeft());
            }
        } else if(current.getLeft() == null && current.getRight() != null) {
            // Caso 2: se tiene un hijo derecho
            if(current == root) {
                root = current.getRight();
            } else if(isLeft) {
                parent.setLeft(current.getRight());
            } else {
                parent.setRight(current.getRight());
            }
        } else {
            // Caso 3: se tienen dos hijos
            BinaryNode<T> successor = getSuccessor(current);
            if(current == root) {
                root = successor;
            } else if(isLeft) {
                parent.setLeft(successor);
            } else {
                parent.setRight(successor);
            }
            successor.setLeft(current.getLeft());
        }
        
        return true;
    }
    
    private BinaryNode<T> getSuccessor(BinaryNode<T> node) {
        BinaryNode<T> successorParent = node;
        BinaryNode<T> successor = node;
        BinaryNode<T> current = successor.getRight();
        
        while(current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeft();
            
            if(current == null) {
                // hace las conexiones
                if(successorParent != node) {
                    successorParent.setLeft(successor.getRight());
                }
                if(successor != node.getRight()) {
                    successor.setRight(node.getRight());
                }
            }
        }
        
        return successor;
    }

    /**
     * @return the root
     */
    public BinaryNode<T> getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }
    
    public String toStringPreorder() {
        return toStringPreorder(root, 0);
    }
    
    private String toStringPreorder(BinaryNode<T> node, int level) {
        String r = "";
        for(int i = 0; i < level; i++) {
            r += "-";
        }
        
        r += node.getItem().toString() + "\n";
        if(node.getLeft() != null) {
            r += toStringPreorder(node.getLeft(), level + 1);
        }
        if(node.getRight()!= null) {
            r += toStringPreorder(node.getRight(), level + 1);
        }
        return r;
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
                BinaryNode temp = (BinaryNode)globalStack.pop();
                if(temp != null) {
                    System.out.print(temp);
                    localStack.push(temp.getLeft());
                    localStack.push(temp.getRight());
                    
                    if(temp.getLeft() != null || temp.getRight() != null) {
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
