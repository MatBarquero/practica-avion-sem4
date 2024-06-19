package com.example;

public class Pila {
    private Nodo cima;
    private int tamaño;

    private class Nodo {
        Avion avion;
        Nodo siguiente;

        Nodo(Avion avion) {
            this.avion = avion;
            this.siguiente = null;
        }
    }

    public Pila() {
        cima = null;
        tamaño = 0;
    }

    public void push(Avion avion) {
        Nodo nuevo = new Nodo(avion);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }

    public Avion pop() {
        if (cima == null) {
            return null;
        }
        Avion avion = cima.avion;
        cima = cima.siguiente;
        tamaño--;
        return avion;
    }

    public boolean vacio() {
        return cima == null;
    }

    public int tam() {
        return tamaño;
    }
}
