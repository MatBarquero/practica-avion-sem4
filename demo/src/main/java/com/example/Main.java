package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
         Nodo Nodo = new Nodo();
        Nodo.insertarAviones();
        Nodo.mostrarPila();

        String nombre = JOptionPane.showInputDialog("ingrese el nombre del avion que va a extraer y reinsertar:");
        Nodo.reinsertarAvion(nombre);
        Nodo.mostrarPila();
    
    }
}