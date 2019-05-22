/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arbol;

/**
 *
 * @author Esteban Arteaga
 */
public abstract class Nodo {
    protected Nodo hijIzq, hijDer, NodoPadre;
    protected int id;

    public Nodo(Nodo hijIzq, Nodo hiDer, Nodo NodoPadre, int id) {
        this.hijIzq = hijIzq;
        this.hijDer = hiDer;
        this.NodoPadre = NodoPadre;
        this.id = id;
    }

    public Nodo(int id) {
        this.id = id;
        hijDer = null;
        hijIzq = null;
        NodoPadre = null;
    }

    public Nodo getHijIzq() {
        return hijIzq;
    }

    public void setHijIzq(Nodo hijIzq) {
        this.hijIzq = hijIzq;
    }

    public Nodo getHijDer() {
        return hijDer;
    }

    public void setHijDer(Nodo hiDer) {
        this.hijDer = hiDer;
    }

    public Nodo getNodoPadre() {
        return NodoPadre;
    }

    public void setNodoPadre(Nodo NodoPadre) {
        this.NodoPadre = NodoPadre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
