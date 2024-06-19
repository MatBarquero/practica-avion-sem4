package com.example;

import javax.swing.JOptionPane;

public class Nodo {
 private Pila pila;

    public Nodo() {
        pila = new Pila();
    }

    public void insertarAviones() {
        String entrada = JOptionPane.showInputDialog("ingrese el nombre de los aviones, separado por comas (#,#): ");
        String[] nombres = entrada.split(",");
        for (String nombre : nombres) {
            pila.push(new Avion(nombre.trim(), nombre));
        }
    }

    public void reinsertarAvion(String nombre) {
        Pila temp = new Pila();
        Avion avion = null;

        while (!pila.vacio()) {
            Avion actual = pila.pop();
            if (actual.nombre.equals(nombre)) {
                avion = actual;
                break;
            } else {
                temp.push(actual);
            }
        }

        while (!temp.vacio()) {
            pila.push(temp.pop());
        }

        if (avion != null) {
            pila.push(avion);
        }
    }

    public void mostrarPila() {
        StringBuilder sb = new StringBuilder();
        Pila temp = new Pila();

        while (!pila.vacio()) {
            Avion actual = pila.pop();
            sb.append(actual.nombre).append(" ");
            temp.push(actual);
        }

        while (!temp.vacio()) {
            pila.push(temp.pop());
        }

        JOptionPane.showMessageDialog(null, "Aviones: " + sb.toString());
    }
}
